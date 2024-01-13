package net.cruftex.quarkusTest.controller;

import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import jakarta.enterprise.event.Observes;

public class StaticResources {

    void installRoute(@Observes StartupEvent startupEvent, Router router, Vertx vertx) {
        /*
        vertx.fileSystem().exists("static/survey.jquery.1.9.122.defaultV2.min.css")
          .onFailure(event -> System.err.println(event))
          .onSuccess(event -> System.err.println(event));
         */
        router.route()
                .path("/static/*")
                .handler(StaticHandler.create("static/"));
    }
}