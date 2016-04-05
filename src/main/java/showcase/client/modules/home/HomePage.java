package showcase.client.modules.home;

import io.clickhandler.web.camber.client.button.FlatButton;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import io.clickhandler.web.reactGwt.client.router.RootRoute;
import io.clickhandler.web.reactGwt.client.router.SimpleRouteComponent;
import io.clickhandler.web.reactGwt.client.router.SimpleRouteProps;
import io.clickhandler.web.reactGwt.client.router.SimpleRouteProxy;
import jsinterop.annotations.JsType;
import showcase.client.App;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.web.reactGwt.client.dom.DOM.a;
import static io.clickhandler.web.reactGwt.client.dom.DOM.div;

@Singleton
public class HomePage extends SimpleRouteComponent<HomePage.Route, HomePage.Props, HomePage.State> {

    @Inject
    FlatButton flatButton;

    @Inject
    public HomePage() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent $this, Props props, State state) {
        return div(
                "home page",
                a($ -> $.onClick(e -> App.getRoutes().getGettingStartedRoutes().getGettingStartedPage().go()), "Go to Getting Started"),
                flatButton.$("Im Here")
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
            super("home", parent);
        }
    }
}
