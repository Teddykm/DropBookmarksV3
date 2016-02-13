package com.udemy.dropbookmaks;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropBookmarksV3Application extends Application<DropBookmarksV3Configuration> {

    public static void main(final String[] args) throws Exception {
        new DropBookmarksV3Application().run(args);
    }

    @Override
    public String getName() {
        return "DropBookmarksV3";
    }

    @Override
    public void initialize(final Bootstrap<DropBookmarksV3Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropBookmarksV3Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
