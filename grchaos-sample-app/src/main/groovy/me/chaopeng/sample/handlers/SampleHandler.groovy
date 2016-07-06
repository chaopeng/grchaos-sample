package me.chaopeng.sample.handlers

import me.chaopeng.chaosrx.AbstractHttpHandler
import me.chaopeng.chaosrx.Response
import me.chaopeng.grchaos.summer.ioc.annotations.Bean

import javax.ws.rs.Path

/**
 * me.chaopeng.sample.handlers.SampleHandler
 *
 * @author chao
 * @version 1.0 - 2016-07-05
 */
@Bean
@Path("/")
class SampleHandler extends AbstractHttpHandler {

    @Path("/")
    Response index() {
        return Response.newBuilder().withContent("index").build();
    }

}
