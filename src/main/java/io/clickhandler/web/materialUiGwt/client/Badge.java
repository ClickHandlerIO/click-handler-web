package io.clickhandler.web.materialUiGwt.client;

import io.clickhandler.web.reactGwt.client.dom.CSSProps;
import io.clickhandler.web.reactGwt.client.event.MouseEventHandler;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.ExternalComponent;
import io.clickhandler.web.reactGwt.client.react.ReactClass;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Badge extends ExternalComponent<Badge.Props> {
    @Inject
    public Badge() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Badge;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement getBadgeContent();

        @JsProperty
        void setBadgeContent(ReactElement badgeContent);

        @JsProperty
        CSSProps getBadgeStyle();

        @JsProperty
        void setBadgeStyle(CSSProps badgeStyle);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        boolean isPrimary();

        @JsProperty
        void setPrimary(boolean primary);

        @JsProperty
        boolean isSecondary();

        @JsProperty
        void setSecondary(boolean secondary);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler style);


        // fluent setters
        @JsOverlay
        default Props badgeContent(ReactElement badgeContent) {
            setBadgeContent(badgeContent);
            return this;
        }

        @JsOverlay
        default Props badgeStyle(CSSProps badgeStyle) {
            setBadgeStyle(badgeStyle);
            return this;
        }

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props primary(boolean primary) {
            setPrimary(primary);
            return this;
        }

        @JsOverlay
        default Props secondary(boolean secondary) {
            setSecondary(secondary);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
