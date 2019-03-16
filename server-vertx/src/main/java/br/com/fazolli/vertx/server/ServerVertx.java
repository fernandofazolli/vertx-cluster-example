package br.com.fazolli.vertx.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class ServerVertx extends AbstractVerticle {

    @Override
    public void start() {
        Router router = Router.router(vertx);
        router.get("/vertx-demo").handler(routingContext -> {
            String nameParam = routingContext.queryParam("name").get(0);
            vertx.eventBus().<String>send("evento-demo", nameParam, ar -> {
                if (ar.succeeded()) {
                    routingContext.response().end(ar.result().body());
                } else {
                    routingContext.fail(ar.cause());
                }
            });
        });
        vertx.createHttpServer().requestHandler(router).listen(8080);
    }

}
