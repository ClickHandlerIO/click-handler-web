package io.clickhandler.web.reactRouterGwt.client;

import javax.inject.Inject;

/**
 *
 */
public class RootRoute extends SimpleRouteProxy {
    @Inject
    public RootRoute() {
        super("/");
    }
}

