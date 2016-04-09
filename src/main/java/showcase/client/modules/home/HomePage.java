package showcase.client.modules.home;

import io.clickhandler.web.materialUiGwt.client.FlatButton;
import io.clickhandler.web.materialUiGwt.client.RaisedButton;
import io.clickhandler.web.reactGwt.client.dom.CSSProps;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import io.clickhandler.web.reactRouterGwt.client.RootRoute;
import io.clickhandler.web.reactRouterGwt.client.SimpleRouteComponent;
import io.clickhandler.web.reactRouterGwt.client.SimpleRouteProps;
import io.clickhandler.web.reactRouterGwt.client.SimpleRouteProxy;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.web.reactGwt.client.dom.DOM.div;

@Singleton
public class HomePage extends SimpleRouteComponent<HomePage.Route, HomePage.Props, HomePage.State> {

    @Inject
    FlatButton flatButton;
    @Inject
    RaisedButton raisedButton;

    @Inject
    public HomePage() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent $this, Props props, State state) {
        return div($ -> $.style(new CSSProps().padding("10px")),
                div("home page"),
                flatButton.$($ -> {
                    $.setLabel("Test Button");
                }),
                raisedButton.$($ -> $.setLabel("Hello"))
//                a($ -> $.onClick(e -> App.getRoutes().getGettingStartedRoutes().getGettingStartedPage().go()), "Go to Getting Started"),
//                div(flatButton.$($ -> $.setBrand(Brand.SECONDARY),
//                        "Im Here"
//                ))
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
