package io.clickhandler.web.reactGwt.client.react;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ReactClass<P> {
    P getDefaultProps();
}
