package io.clickhandler.web.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentsCallback {
    void call(Location location, ComponentsCallback callback);
}
