package io.clickhandler.web.router;

/**
 *
 */
public interface RouteGatekeeper {
    void onEnter(RouteProxy routeProxy, RouteProps nextState, ReplaceStateFunction replaceState);

    Object onLeave(RouteProxy routeProxy);
}
