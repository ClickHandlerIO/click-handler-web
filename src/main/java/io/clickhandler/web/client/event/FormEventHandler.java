package io.clickhandler.web.client.event;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface FormEventHandler {
    void handle(FormEvent event);
}
