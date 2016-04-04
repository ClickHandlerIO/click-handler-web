package io.clickhandler.web.client.remoting;

/**
 *
 */
public class WsClosedEvent {
    public final WsDispatcher dispatcher;

    public WsClosedEvent(WsDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
}
