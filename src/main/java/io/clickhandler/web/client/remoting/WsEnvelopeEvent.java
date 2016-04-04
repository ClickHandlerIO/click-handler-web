package io.clickhandler.web.client.remoting;

/**
 *
 */
public class WsEnvelopeEvent {
    public final WsDispatcher dispatcher;
    public final WsEnvelope envelope;

    public WsEnvelopeEvent(WsDispatcher dispatcher, WsEnvelope envelope) {
        this.dispatcher = dispatcher;
        this.envelope = envelope;
    }
}
