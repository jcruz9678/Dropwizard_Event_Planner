package com.jcruz.Event_Planner_Dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Event_PlannerApplication extends Application<Event_PlannerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new Event_PlannerApplication().run(args);
    }

    @Override
    public String getName() {
        return "Event_Planner";
    }

    @Override
    public void initialize(final Bootstrap<Event_PlannerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Event_PlannerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
