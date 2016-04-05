package io.clickhandler.web.camber.client.button;

import io.clickhandler.web.camber.client.Brand;
import io.clickhandler.web.reactGwt.client.Func;
import io.clickhandler.web.reactGwt.client.event.MouseEvent;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.Component;
import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

public class FlatButton extends Component<FlatButton.Props, FlatButton.State> {

    @Inject
    ButtonBase buttonBase;

    @Inject
    public FlatButton() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this, Props props, State state) {
        return buttonBase.$($ -> {
                    $.setClassName("camber__flat-button" + (props.getClassName() != null ? " " + props.getClassName() : "") + (props.getBrand() != null ? " " + props.getBrand().getClassName() : ""));
                    $.setTagName("button");
                    $.setOnClick(props.getOnClick());
                },
                props.getChildren()
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
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        Brand getBrand();

        @JsProperty
        void setBrand(Brand brand);

        @JsProperty
        Func.Run1<MouseEvent> getOnClick();

        @JsProperty
        void setOnClick(Func.Run1<MouseEvent> onClick);
    }

    @JsType(isNative = true)
    public interface State {
    }
}
