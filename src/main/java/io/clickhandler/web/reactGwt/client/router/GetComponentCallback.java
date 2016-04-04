package io.clickhandler.web.reactGwt.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentCallback {
    void call(Location location, io.clickhandler.web.reactGwt.client.router.ComponentCallback callback);
}
