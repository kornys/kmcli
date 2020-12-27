package io.kornys.kmcli;

import io.kornys.kmcli.amqp.AmqpConsumer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A simple resource showing the last price.
 */
@Path("/consumer")
public class AmqpController {

    @Inject
    AmqpConsumer consumer;

    @GET
    @Path("last")
    @Produces(MediaType.TEXT_PLAIN)
    public String last() {
        return consumer.getLastPrice();
    }

    @GET
    @Path("all")
    @Produces(MediaType.TEXT_PLAIN)
    public String all() {
        return String.join(System.lineSeparator(), consumer.getAllPrices());
    }
}
