package showcase.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.materialUiGwt.client.MaterialUi;
import io.clickhandler.web.reactGwt.client.ReactGwt;
import io.clickhandler.web.reactRouterGwt.client.ReactRouterGwt;
import io.clickhandler.web.reactRouterGwt.resources.ReactRouterGwtResourceBundle;
import showcase.resources.ShowcaseResourceBundle;

public class ShowcaseEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        // Inject webpack javascript
        ScriptInjector.fromString(ShowcaseResourceBundle.INSTANCE.webpackjs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // Wire the app
        final App app = App.get();

        // todo start utils

        // Start react app
        app.bootstrap().start("app");
    }
}
