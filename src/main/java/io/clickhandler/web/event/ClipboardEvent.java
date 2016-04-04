package io.clickhandler.web.event;

import elemental.dom.Clipboard;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface ClipboardEvent extends SyntheticEvent {
    @JsProperty
    Clipboard getClipboardData();
}
