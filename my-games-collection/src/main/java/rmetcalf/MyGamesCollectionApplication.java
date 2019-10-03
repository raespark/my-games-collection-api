package rmetcalf;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyGamesCollectionApplication extends Application<MyGamesCollectionConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyGamesCollectionApplication().run(args);
    }

    @Override
    public String getName() {
        return "MyGamesCollection";
    }

    @Override
    public void initialize(final Bootstrap<MyGamesCollectionConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MyGamesCollectionConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
