package io.clickhandler.web.reactGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.reactGwt.resources.ReactGwtResourceBundle;

public class ReactGwt {
    public static void init() {
        ScriptInjector.fromString(ReactGwtResourceBundle.INSTANCE.reactGwtWebpack().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
