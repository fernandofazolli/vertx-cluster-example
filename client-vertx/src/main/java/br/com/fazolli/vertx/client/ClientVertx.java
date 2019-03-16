package br.com.fazolli.vertx.client;

import io.vertx.core.AbstractVerticle;

import java.util.logging.Logger;

public class ClientVertx extends AbstractVerticle {

    private static final Logger LOGGER = Logger.getLogger(ClientVertx.class.getName());

    @Override
    public void start() {
        vertx.eventBus().<String>consumer("evento-demo").handler(objectMessage -> {
            LOGGER.info(String.format("Hello %s", objectMessage.body()));
            objectMessage.reply(String.format("Hello %s", objectMessage.body()));
        });
    }

}
