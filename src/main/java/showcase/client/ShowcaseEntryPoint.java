package showcase.client;

import com.google.gwt.core.client.EntryPoint;
import io.clickhandler.web.materialUiGwt.client.MaterialUi;
import io.clickhandler.web.reactGwt.client.ReactGwt;
import io.clickhandler.web.reactRouterGwt.client.ReactRouterGwt;

public class ShowcaseEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        // inject javascript and css
        ReactGwt.init();
        ReactRouterGwt.init();
        MaterialUi.init();
//        Camber.init();

        // wire the app
        final App app = App.get();

        // todo start utils

        // start react app
        app.bootstrap().start("app");
    }
}
