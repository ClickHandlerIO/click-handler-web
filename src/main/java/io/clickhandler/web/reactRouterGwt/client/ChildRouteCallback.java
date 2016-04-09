package io.clickhandler.web.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ChildRouteCallback {
    void run(Location location, RouteCallback callback);
}
