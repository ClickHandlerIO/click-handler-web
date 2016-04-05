package io.clickhandler.web.camber.client.ripples;

import io.clickhandler.web.camber.client.transitionGroup.ReactTransitionGroupChild;
import io.clickhandler.web.reactGwt.client.Func;
import io.clickhandler.web.reactGwt.client.dom.CSSProps;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.Component;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

import static io.clickhandler.web.reactGwt.client.dom.DOM.div;

public class CircleRipple extends Component<CircleRipple.Props, CircleRipple.State> implements ReactTransitionGroupChild {

    @Inject
    public CircleRipple() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return div($ -> {
            $.style(props.getStyle());
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void componentWillAppear(Func.Run onCompletion) {

    }

    @Override
    public void componentDidAppear() {

    }

    @Override
    public void componentWillEnter(Func.Run onCompletion) {

    }

    @Override
    public void componentDidEnter() {

    }

    @Override
    public void componentWillLeave(Func.Run onCompletion) {

    }

    @Override
    public void componentDidLeave() {

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private void animate(ReactComponent<Props, State> $this) {

    }

    private void initAnimation(ReactComponent<Props, State> $this, Func.Run callback) {

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
