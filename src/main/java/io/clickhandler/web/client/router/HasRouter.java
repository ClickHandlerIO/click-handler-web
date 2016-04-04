package io.clickhandler.web.client.router;

import io.clickhandler.web.client.react.ReactComponent;
import io.clickhandler.web.client.Reflection;

/**
 *
 */
public interface HasRouter {
    default Router getRouter(ReactComponent $this) {
        return Reflection.get($this.getProperty("context"), "router");
    }
}
