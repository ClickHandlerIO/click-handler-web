package io.clickhandler.web.client.router;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface Router extends History {
    @JsMethod
    void setRouteLeaveHook(Route route, io.clickhandler.web.client.router.RouteHook hook);

    @JsMethod
    void replace(String path);
}
