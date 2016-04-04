package io.clickhandler.web.client.remoting;

/**
 *
 */
public class WsConnectedEvent {
    public final WsDispatcher dispatcher;

    public WsConnectedEvent(WsDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
}
