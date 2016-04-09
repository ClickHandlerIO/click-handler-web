package io.clickhandler.web.materialUiGwt.client;

import io.clickhandler.web.reactGwt.client.dom.CSSProps;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.ExternalComponent;
import io.clickhandler.web.reactGwt.client.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Divider extends ExternalComponent<Divider.Props> {

    // todo need to get MuiTheme passed in

    @Inject
    public Divider() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Divider;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isInset();

        @JsProperty
        void setInset(boolean inset);

        @JsProperty
        Object getMuiTheme();

        @JsProperty
        void setMuiTheme(Object muiTheme);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props inset(boolean inset) {
            setInset(inset);
            return this;
        }

        @JsOverlay
        default Props muiTheme(Object muiTheme) {
            setMuiTheme(muiTheme);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

    }
}