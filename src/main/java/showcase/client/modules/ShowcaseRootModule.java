package showcase.client.modules;

import io.clickhandler.web.reactRouterGwt.client.RootModule;
import showcase.client.modules.gettingStarted.GettingStartedModule;
import showcase.client.modules.home.HomeModule;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ShowcaseRootModule extends RootModule {
    @Inject
    HomeModule.Loader home;
    @Inject
    GettingStartedModule.Loader gettingStarted;

    @Inject
    public ShowcaseRootModule(ShowcaseRootShell shell) {
        super(shell);
    }

    @Override
    protected void registerModules() {
        register(home);
        register(gettingStarted);
    }
}
