package io.clickhandler.web.camber.client.transitionGroup;

import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.ExternalComponent;
import io.clickhandler.web.reactGwt.client.react.ReactClass;
import io.clickhandler.web.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReactTransitionGroup extends ExternalComponent<ReactTransitionGroup.Props> {
    @Inject
    public ReactTransitionGroup() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.ReactTransitionGroup;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        ReactElement getComponent();

        @JsProperty
        void setComponent(ReactElement component);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);
    }
}
