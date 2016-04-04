package io.clickhandler.web.client.router;

import elemental.client.Browser;
import io.clickhandler.web.client.Try;
import io.clickhandler.web.client.react.ReactElement;
import io.clickhandler.web.client.Func;
import io.clickhandler.web.client.dom.ReactDOM;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 *
 */
public abstract class RootModule extends ModuleLoader {
    private final io.clickhandler.web.client.router.RouteComponent root;

    @Inject
    RootRoute rootRoute;

    @Inject
    Provider<io.clickhandler.web.client.router.RouteGatekeeper> routeGatekeeper;

    private Route appRoute;

    public RootModule(io.clickhandler.web.client.router.RouteComponent root) {
        super("/");
        this.root = root;
    }

    protected io.clickhandler.web.client.router.History history() {
        return ReactRouter.getHashHistory();
    }

    @Override
    protected void loadRouteBuilder(Func.Run1<RoutesBuilder> run1) {
        run1.run(null);
    }

    protected Route appRoute() {
        if (appRoute != null) {
            return appRoute;
        }

        return appRoute = new Route()
            .path("/")
            .component(root)
            .getChildRoutes(
                (location, callback) -> handle(location.getPathname(), location, callback))
            .onEnter(
                (nextState, replaceState) -> routeGatekeeper.get().onEnter(rootRoute, nextState, replaceState))
            .onLeave(
                () -> routeGatekeeper.get().onLeave(rootRoute));
    }

    public void start(String elementId, Func.Run beforeRender) {
        // Create Router.
        final ReactElement router =
            ReactRouter.create(new RouterProps()
                .history(history())
                .routes(appRoute()));

        Try.run(beforeRender);

        // Render.
        ReactDOM.render(router, Browser.getDocument().getElementById(elementId));
    }
}
