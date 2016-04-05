package io.clickhandler.web.camber.client.ripples;

import io.clickhandler.web.camber.client.transitionGroup.ReactTransitionGroup;
import io.clickhandler.web.reactGwt.client.event.SyntheticEvent;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.Component;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static io.clickhandler.web.reactGwt.client.dom.DOM.div;

public class TouchRipple extends Component<TouchRipple.Props, TouchRipple.State> {

    @Inject
    ReactTransitionGroup reactTransitionGroup;
    @Inject
    CircleRipple circleRipple;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return div($ -> {
                    $.className("camber__touch-ripple");
                    $.onMouseUp(e -> end($this));
                    $.onMouseDown(e -> {
                        if (e.getButton().intValue() == 0) {
                            start($this, e, true);
                        }
                    });
                    $.onMouseLeave(e -> end($this));
                    $.onTouchStart(e -> start($this, e, true));
                    $.onTouchEnd(e -> end($this));
                },
                state.getRipples().isEmpty() ? null :
                        reactTransitionGroup.$($ -> $.setClassName("transition-group"),
                                state.getRipples()
                        ),
                props.getChildren());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public State getInitialState(ReactComponent<Props, State> $this) {
        State s = super.getInitialState($this);
        s.setRipples(new ArrayList<>());
        return s;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    private void start(ReactComponent<Props, State> $this, SyntheticEvent e, boolean isRippleTouchGenerated) {
        List<ReactElement> ripples = $this.state().getRipples();
        final Double key = $this.state().getNextKey();
        ripples.add(
                circleRipple.$($ -> {
                    $.setKey(key.toString());
                })
        );
        $this.setState(s -> {
            s.setRipples(ripples);
            s.setNextKey(key + 1);
        });
    }

    private void end(ReactComponent<Props, State> $this) {
        List<ReactElement> ripples = $this.state().getRipples();
        if (ripples.size() > 0) {
            ripples.remove(0);
        }
        $this.setState(s -> s.setRipples(ripples));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {

    }

    @JsType(isNative = true)
    public interface State {
        @JsProperty
        Double getNextKey();

        @JsProperty
        void setNextKey(Double nextKey);

        @JsProperty
        List<ReactElement> getRipples();

        @JsProperty
        void setRipples(List<ReactElement> ripples);
    }
}
