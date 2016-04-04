package io.clickhandler.web.reactGwt.client.router;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface RouteHook {
    String call(Location nextLocation);
}
