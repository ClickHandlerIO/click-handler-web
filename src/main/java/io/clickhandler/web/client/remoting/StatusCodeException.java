package io.clickhandler.web.client.remoting;

/**
 *
 */
public class StatusCodeException extends Throwable {
    public final int code;

    public StatusCodeException() {
        code = 0;
    }

    public StatusCodeException(int code) {
        this.code = code;
    }
}
