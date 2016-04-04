package io.clickhandler.web.reactGwt.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentsCallback {
    void call(Location location, io.clickhandler.web.reactGwt.client.router.ComponentsCallback callback);
}
