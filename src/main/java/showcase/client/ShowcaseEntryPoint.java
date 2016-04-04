package showcase.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.web.camber.client.Camber;
import showcase.resources.ShowcaseResourceBundle;

public class ShowcaseEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        // inject javascript and css
        Camber.init();

        // temp inject react router
        ScriptInjector.fromString(ShowcaseResourceBundle.INSTANCE.react_router().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // wire the app
        final App app = App.get();

        // todo start utils

        // start react app
        app.bootstrap().start("app");
    }
}
