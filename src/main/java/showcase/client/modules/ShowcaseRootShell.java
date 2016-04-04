package showcase.client.modules;

import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import io.clickhandler.web.reactGwt.client.router.RootRoute;
import io.clickhandler.web.reactGwt.client.router.SimpleRouteComponent;
import io.clickhandler.web.reactGwt.client.router.SimpleRouteProps;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.web.reactGwt.client.dom.DOM.div;


@Singleton
public class ShowcaseRootShell extends SimpleRouteComponent<RootRoute, ShowcaseRootShell.Props, ShowcaseRootShell.State> {
//    private final Loggly log = Loggly.get(ShowcaseRootShell.class);

//    @Inject
//    AlertConfirmManager alertConfirmManager;

    @Inject
    public ShowcaseRootShell() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    @JsIgnore
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return div($ -> $.className("full-height"),
                props.getChildren()
//            alertConfirmManager.$()
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
}
