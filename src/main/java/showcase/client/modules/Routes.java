package showcase.client.modules;

import showcase.client.modules.home.HomePage;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Routes {

    @Inject
    public Routes() {
    }

    @Inject
    HomeRoutes home;

    public HomeRoutes getHome() {
        return home;
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
}
