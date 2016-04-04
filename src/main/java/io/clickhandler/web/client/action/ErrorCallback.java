package io.clickhandler.web.client.action;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ErrorCallback {
    void run(Throwable e);
}
