package io.clickhandler.web.camber.client.button;

import io.clickhandler.web.camber.client.ripples.TouchRipple;
import io.clickhandler.web.reactGwt.client.Func;
import io.clickhandler.web.reactGwt.client.dom.DOM;
import io.clickhandler.web.reactGwt.client.event.MouseEvent;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.Component;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class ButtonBase extends Component<ButtonBase.Props, ButtonBase.State> {

    @Inject
    TouchRipple touchRipple;

    @Inject
    public ButtonBase() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return DOM.create(props.getTagName(),
                $ -> {
                    $.className("camber__button-base " + props.getClassName());
                    $.onClick(e -> {
                        if (props.getOnClick() != null) {
                            props.getOnClick().run(e);
                        }
                    });
                    // todo add other handlers
                },
                touchRipple.$(
                        props.getChildren()
                )
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Args / Props / State / Route
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getTagName();

        @JsProperty
        void setTagName(String tagName);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        Func.Run1<MouseEvent> getOnClick();

        @JsProperty
        void setOnClick(Func.Run1<MouseEvent> onClick);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
