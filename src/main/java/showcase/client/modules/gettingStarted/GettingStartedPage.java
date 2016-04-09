package showcase.client.modules.gettingStarted;

import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import io.clickhandler.web.reactRouterGwt.client.RootRoute;
import io.clickhandler.web.reactRouterGwt.client.SimpleRouteComponent;
import io.clickhandler.web.reactRouterGwt.client.SimpleRouteProps;
import io.clickhandler.web.reactRouterGwt.client.SimpleRouteProxy;
import jsinterop.annotations.JsType;
import showcase.client.App;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.web.reactGwt.client.dom.DOM.a;
import static io.clickhandler.web.reactGwt.client.dom.DOM.div;

@Singleton
public class GettingStartedPage extends SimpleRouteComponent<GettingStartedPage.Route, GettingStartedPage.Props, GettingStartedPage.State> {

    @Inject
    public GettingStartedPage() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent $this, Props props, State state) {
        props();
        return div(
                "getting started page",
                a($ -> $.onClick(e -> App.getRoutes().getHome().getHomePage().go()), "Go To Home Page")
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Props / State / Route / Args
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends SimpleRouteProps {
    }

    @JsType(isNative = true)
    public interface State {
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(RootRoute parent) {
            super("gettingStarted", parent);
        }
    }
}
