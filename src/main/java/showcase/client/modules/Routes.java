package showcase.client.modules;

import showcase.client.modules.gettingStarted.GettingStartedPage;
import showcase.client.modules.home.HomePage;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Routes {

    @Inject
    public Routes() {
    }

    public static class HomeRoutes {
        @Inject
        HomePage.Route homePage;

        @Inject
        public HomeRoutes() {
        }

        public HomePage.Route getHomePage() {
            return homePage;
        }
    }

    @Inject
    HomeRoutes home;

    public HomeRoutes getHome() {
        return home;
    }

    public static class GettingStartedRoutes {
        @Inject
        GettingStartedPage.Route gettingStartedPage;

        @Inject
        public GettingStartedRoutes() {
        }

        public GettingStartedPage.Route getGettingStartedPage() {
            return gettingStartedPage;
        }
    }

    @Inject
    GettingStartedRoutes gettingStartedRoutes;

    public GettingStartedRoutes getGettingStartedRoutes() {
        return gettingStartedRoutes;
    }
}
