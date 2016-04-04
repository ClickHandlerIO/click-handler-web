package io.clickhandler.web.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentCallback {
    void call(Location location, io.clickhandler.web.client.router.ComponentCallback callback);
}
