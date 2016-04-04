package io.clickhandler.web.client.dom;

import io.clickhandler.web.client.Func;
import io.clickhandler.web.client.react.Ref;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType
public class DOMProps<T> {
    @JsProperty
    public Object children;
    @JsProperty
    public Object key;
    @JsProperty
    public Object ref;
    @JsProperty
    public io.clickhandler.web.client.event.ClipboardEventHandler onCopy;
    @JsProperty
    public io.clickhandler.web.client.event.ClipboardEventHandler onCut;
    @JsProperty
    public io.clickhandler.web.client.event.ClipboardEventHandler onPaste;
    @JsProperty
    public io.clickhandler.web.client.event.CompositionEventHandler onCompositionEnd;
    @JsProperty
    public io.clickhandler.web.client.event.CompositionEventHandler onCompositionStart;
    @JsProperty
    public io.clickhandler.web.client.event.CompositionEventHandler onCompositionUpdate;
    @JsProperty
    public io.clickhandler.web.client.event.FocusEventHandler onFocus;
    @JsProperty
    public io.clickhandler.web.client.event.FocusEventHandler onBlur;
    @JsProperty
    public io.clickhandler.web.client.event.FormEventHandler onChange;
    @JsProperty
    public io.clickhandler.web.client.event.FormEventHandler onInput;
    @JsProperty
    public io.clickhandler.web.client.event.FormEventHandler onSubmit;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onLoad;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onError;
    @JsProperty
    public io.clickhandler.web.client.event.KeyboardEventHandler onKeyDown;
    @JsProperty
    public io.clickhandler.web.client.event.KeyboardEventHandler onKeyPress;
    @JsProperty
    public io.clickhandler.web.client.event.KeyboardEventHandler onKeyUp;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onAbort;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onCanPlay;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onCanPlayThrough;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onDurationChange;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onEmptied;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onEncrypted;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onEnded;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onLoadedData;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onLoadedMetadata;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onLoadStart;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onPause;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onPlay;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onPlaying;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onProgress;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onRateChange;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onSeeked;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onSeeking;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onStalled;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onSuspend;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onTimeUpdate;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onVolumeChange;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onWaiting;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onClick;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onContextMenu;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onDoubleClick;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDrag;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDragEnd;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDragEnter;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDragExit;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDragLeave;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDragOver;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDragStart;
    @JsProperty
    public io.clickhandler.web.client.event.DragEventHandler onDrop;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseDown;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseEnter;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseLeave;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseMove;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseOut;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseOver;
    @JsProperty
    public io.clickhandler.web.client.event.MouseEventHandler onMouseUp;
    @JsProperty
    public io.clickhandler.web.client.event.ReactEventHandler onSelect;
    @JsProperty
    public io.clickhandler.web.client.event.TouchEventHandler onTouchCancel;
    @JsProperty
    public io.clickhandler.web.client.event.TouchEventHandler onTouchEnd;
    @JsProperty
    public io.clickhandler.web.client.event.TouchEventHandler onTouchMove;
    @JsProperty
    public io.clickhandler.web.client.event.TouchEventHandler onTouchStart;
    @JsProperty
    public io.clickhandler.web.client.event.UIEventHandler onScroll;
    @JsProperty
    public io.clickhandler.web.client.event.WheelEventHandler onWheel;

    @JsIgnore
    public Object children() {
        return this.children;
    }

    @JsIgnore
    public Object key() {
        return this.key;
    }

    @JsIgnore
    public DOMProps<T> children(final Object children) {
        this.children = children;
        return this;
    }

    @JsIgnore
    public DOMProps<T> key(final Object key) {
        this.key = key;
        return this;
    }

    @JsIgnore
    public DOMProps<T> ref(String ref) {
        this.ref = ref;
        return this;
    }

    @JsIgnore
    public DOMProps<T> ref(Func.Run1<T> ref) {
        this.ref = ref;
        return this;
    }

    @JsIgnore
    public DOMProps<T> ref(final Ref<T> ref) {
        if (ref == null) return this;
        this.ref = ref.getName();
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCopy(io.clickhandler.web.client.event.ClipboardEventHandler value) {
        this.onCopy = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCut(io.clickhandler.web.client.event.ClipboardEventHandler value) {
        this.onCut = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPaste(io.clickhandler.web.client.event.ClipboardEventHandler value) {
        this.onPaste = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCompositionEnd(io.clickhandler.web.client.event.CompositionEventHandler value) {
        this.onCompositionEnd = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCompositionStart(io.clickhandler.web.client.event.CompositionEventHandler value) {
        this.onCompositionStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCompositionUpdate(io.clickhandler.web.client.event.CompositionEventHandler value) {
        this.onCompositionUpdate = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onFocus(io.clickhandler.web.client.event.FocusEventHandler value) {
        this.onFocus = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onBlur(io.clickhandler.web.client.event.FocusEventHandler value) {
        this.onBlur = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onChange(io.clickhandler.web.client.event.FormEventHandler value) {
        this.onChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onInput(io.clickhandler.web.client.event.FormEventHandler value) {
        this.onInput = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSubmit(io.clickhandler.web.client.event.FormEventHandler value) {
        this.onSubmit = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoad(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onLoad = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onError(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onError = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onKeyDown(io.clickhandler.web.client.event.KeyboardEventHandler value) {
        this.onKeyDown = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onKeyPress(io.clickhandler.web.client.event.KeyboardEventHandler value) {
        this.onKeyPress = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onKeyUp(io.clickhandler.web.client.event.KeyboardEventHandler value) {
        this.onKeyUp = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onAbort(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onAbort = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCanPlay(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onCanPlay = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCanPlayThrough(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onCanPlayThrough = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDurationChange(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onDurationChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onEmptied(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onEmptied = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onEncrypted(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onEncrypted = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onEnded(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onEnded = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoadedData(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onLoadedData = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoadedMetadata(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onLoadedMetadata = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoadStart(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onLoadStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPause(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onPause = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPlay(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onPlay = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPlaying(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onPlaying = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onProgress(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onProgress = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onRateChange(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onRateChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSeeked(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onSeeked = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSeeking(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onSeeking = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onStalled(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onStalled = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSuspend(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onSuspend = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTimeUpdate(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onTimeUpdate = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onVolumeChange(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onVolumeChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onWaiting(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onWaiting = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onClick(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onClick = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onContextMenu(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onContextMenu = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDoubleClick(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onDoubleClick = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDrag(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDrag = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragEnd(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDragEnd = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragEnter(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDragEnter = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragExit(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDragExit = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragLeave(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDragLeave = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragOver(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDragOver = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragStart(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDragStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDrop(io.clickhandler.web.client.event.DragEventHandler value) {
        this.onDrop = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseDown(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseDown = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseEnter(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseEnter = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseLeave(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseLeave = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseMove(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseMove = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseOut(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseOut = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseOver(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseOver = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseUp(io.clickhandler.web.client.event.MouseEventHandler value) {
        this.onMouseUp = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSelect(io.clickhandler.web.client.event.ReactEventHandler value) {
        this.onSelect = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchCancel(io.clickhandler.web.client.event.TouchEventHandler value) {
        this.onTouchCancel = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchEnd(io.clickhandler.web.client.event.TouchEventHandler value) {
        this.onTouchEnd = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchMove(io.clickhandler.web.client.event.TouchEventHandler value) {
        this.onTouchMove = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchStart(io.clickhandler.web.client.event.TouchEventHandler value) {
        this.onTouchStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onScroll(io.clickhandler.web.client.event.UIEventHandler value) {
        this.onScroll = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onWheel(io.clickhandler.web.client.event.WheelEventHandler value) {
        this.onWheel = value;
        return this;
    }
}
