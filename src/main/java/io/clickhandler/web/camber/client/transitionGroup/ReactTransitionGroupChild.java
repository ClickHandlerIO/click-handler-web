package io.clickhandler.web.camber.client.transitionGroup;


import io.clickhandler.web.reactGwt.client.Func;

public interface ReactTransitionGroupChild {

    void componentWillAppear(Func.Run onCompletion);

    void componentDidAppear();

    void componentWillEnter(Func.Run onCompletion);

    void componentDidEnter();

    void componentWillLeave(Func.Run onCompletion);

    void componentDidLeave();
}
