package io.clickhandler.web.reactGwt.client.action;

import java.util.Queue;

/**
 *
 */
public abstract class SingletonAction<IN, OUT> extends AbstractAction<IN, OUT> {
    private Queue<ActionCall<IN, OUT>> queue;
}
