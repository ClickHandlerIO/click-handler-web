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
public class TableHeaderColumn extends ExternalComponent<TableHeaderColumn.Props> {

    @Inject
    public TableHeaderColumn() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.TableHeaderColumn;
    }-*/;


    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String className;
//        double columnNumber;
//        String key;
//        CSSProps style;
//        String tooltip;
//        CSSProps tooltipStyle;
//        MouseEventHandler onClick; // func

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        double getColumnNumber();

        @JsProperty
        void setColumnNumber(double columnNumber);

        @JsProperty
        String getKey();

        @JsProperty
        void setKey(String key);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getTooltip();

        @JsProperty
        void setTooltip(String tooltip);

        @JsProperty
        CSSProps getTooltipStyle();

        @JsProperty
        void setTooltipStyle(CSSProps tooltipStyle);

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
        default Props columnNumber(final double columnNumber) {
            setColumnNumber(columnNumber);
            return this;
        }

        @JsOverlay
        default Props key(final String key) {
            setKey(key);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props tooltip(final String tooltip) {
            setTooltip(tooltip);
            return this;
        }

        @JsOverlay
        default Props tooltipStyle(final CSSProps tooltipStyle) {
            setTooltipStyle(tooltipStyle);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
