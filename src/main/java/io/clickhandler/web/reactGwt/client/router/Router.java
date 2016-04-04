package io.clickhandler.web.reactGwt.client.router;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true, namespace = "ReactRouter")
public interface Router extends History {
    @JsMethod
    void setRouteLeaveHook(Route route, io.clickhandler.web.reactGwt.client.router.RouteHook hook);

    @JsMethod
    void replace(String path);
}
