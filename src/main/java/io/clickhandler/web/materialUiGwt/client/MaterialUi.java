package io.clickhandler.web.materialUiGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.camber.resources.CamberResourceBundle;
import io.clickhandler.web.materialUiGwt.resources.MaterialUiGwtResourceBundle;
import io.clickhandler.web.reactGwt.client.ReactGwt;

public class MaterialUi {
    public static void init() {
        ScriptInjector.fromString(MaterialUiGwtResourceBundle.INSTANCE.materialUiGwtWebpack().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
