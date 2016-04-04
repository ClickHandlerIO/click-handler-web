package io.clickhandler.web.client.dom;

import elemental.dom.Element;
import jsinterop.annotations.JsMethod;
import io.clickhandler.web.client.react.ReactElement;

/**
 *
 */
public class ReactDOM {
    @JsMethod(namespace = "ReactDOM")
    public static native ReactElement render(ReactElement obj, Element element);
}
