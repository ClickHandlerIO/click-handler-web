package io.clickhandler.web.client.event;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ClipboardEventHandler {
    void handle(ClipboardEvent event);
}
