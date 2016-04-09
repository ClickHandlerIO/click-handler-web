package showcase.client.modules.gettingStarted;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import dagger.Component;
import io.clickhandler.web.reactGwt.client.Func;
import io.clickhandler.web.reactRouterGwt.client.ModuleLoader;
import io.clickhandler.web.reactRouterGwt.client.RoutesBuilder;
import showcase.client.App;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Component(modules = App.Core.class)
public interface GettingStartedModule {
    GettingStartedModule instance = DaggerGettingStartedModule.create();

    Routes routes();

    @Singleton
    class Routes extends RoutesBuilder {
        @Inject
        GettingStartedPage gettingStartedPage;

        @Inject
        public Routes() {
        }

        @Override
        protected void registerComponents() {
            add(gettingStartedPage);
        }
    }

    class Loader extends ModuleLoader {
        @Inject
        public Loader(GettingStartedPage.Route root) {
            super(root.path());
        }

        @Override
        protected void loadRouteBuilder(Func.Run1<RoutesBuilder> callback) {
            GWT.runAsync(new RunAsyncCallback() {
                @Override
                public void onFailure(Throwable reason) {
                    // Ignore.
                }

                @Override
                public void onSuccess() {
                    callback.run(GettingStartedModule.instance.routes());
                }
            });
        }
    }
}
