package io.clickhandler.web.materialUiGwt.client;

import io.clickhandler.web.reactGwt.client.dom.CSSProps;
import io.clickhandler.web.reactGwt.client.event.MouseEventHandler;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.ExternalComponent;
import io.clickhandler.web.reactGwt.client.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class ToolbarTitle extends ExternalComponent<ToolbarTitle.Props> {

    @Inject
    public ToolbarTitle() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.ToolbarTitle;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        CSSProps style;
//        String text; // text to be displayed in title
//        MouseEventHandler onClick;

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getText();

        @JsProperty
        void setText(String text);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props text(final String text) {
            setText(text);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
