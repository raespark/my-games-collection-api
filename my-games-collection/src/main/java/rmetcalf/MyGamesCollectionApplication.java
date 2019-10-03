package rmetcalf;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import rmetcalf.resources.GamesResource;

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
        // nothing to do yet
    }

    @Override
    public void run(final MyGamesCollectionConfiguration configuration,
                    final Environment environment) {
        final GamesResource gamesResource = new GamesResource(
            configuration.getTemplate(),
            configuration.getDefaultName() 
        );
        environment.jersey().register(gamesResource);
    }

}
