package io.clickhandler.web.reactRouterGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.reactRouterGwt.resources.ReactRouterGwtResourceBundle;

public class ReactRouterGwt {
    public static void init() {
        ScriptInjector.fromString(ReactRouterGwtResourceBundle.INSTANCE.reactRouterGwtWebpack().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
