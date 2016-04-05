package io.clickhandler.web.camber.client.ripples;

import io.clickhandler.web.camber.client.transitionGroup.ReactTransitionGroupChild;
import io.clickhandler.web.reactGwt.client.Func;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.Component;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
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
        return div();
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

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @JsType(isNative = true)
    public interface Props extends BaseProps {

    }

    @JsType(isNative = true)
    public interface State {
    }
}
