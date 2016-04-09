package io.clickhandler.web.materialUiGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.materialUiGwt.resources.MaterialUiGwtResourceBundle;

public class MaterialUi {
    public static void init() {
        ScriptInjector.fromString(MaterialUiGwtResourceBundle.INSTANCE.materialUiGwtWebpack().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
