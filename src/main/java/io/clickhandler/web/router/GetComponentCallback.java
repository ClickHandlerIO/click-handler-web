package io.clickhandler.web.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentCallback {
    void call(Location location, ComponentCallback callback);
}
