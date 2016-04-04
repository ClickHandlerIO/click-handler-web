package io.clickhandler.web.reactGwt.client.action;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ResponseCallback<T> {
    void call(T response);
}
