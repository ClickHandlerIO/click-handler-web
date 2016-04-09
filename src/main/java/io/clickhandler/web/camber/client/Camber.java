package io.clickhandler.web.camber.client;

import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.camber.resources.CamberResourceBundle;
import io.clickhandler.web.reactGwt.client.ReactGwt;

public class Camber {
    public static void init() {
        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.camberWebpack().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
