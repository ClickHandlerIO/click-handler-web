package io.clickhandler.web.reactRouterGwt.client;

/**
 *
 */
public interface RouteGatekeeper {
    void onEnter(RouteProxy routeProxy, RouteProps nextState, ReplaceStateFunction replaceState);

    Object onLeave(RouteProxy routeProxy);
}
