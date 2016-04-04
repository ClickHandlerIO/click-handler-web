package io.clickhandler.web.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentsCallback {
    void call(Location location, io.clickhandler.web.client.router.ComponentsCallback callback);
}
