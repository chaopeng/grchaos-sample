package me.chaopeng.sample

import me.chaopeng.chaosrx.AbstractHttpHandler
import me.chaopeng.chaosrx.HttpRouter
import me.chaopeng.chaosrx.HttpService
import me.chaopeng.chaosrx.HttpServiceHandler
import me.chaopeng.grchaos.summer.bean.SummerAware
import me.chaopeng.grchaos.summer.ioc.annotations.Bean
import me.chaopeng.grchaos.summer.ioc.lifecycle.SummerUpgrade

/**
 * me.chaopeng.sample.WebService
 *
 * @author chao
 * @version 1.0 - 2016-07-05
 */
@Bean
class WebService implements SummerUpgrade, SummerAware {

    HttpServiceHandler serviceHandler = new HttpServiceHandler();

    void start() {
        HttpRouter router = new HttpRouter(summer.getBeansInPackage("me.chaopeng.sample.handlers", AbstractHttpHandler).values())
        serviceHandler = new HttpServiceHandler();
        serviceHandler.setHttpRouter(router);
        new HttpService(8888, serviceHandler).start();
    }

    @Override
    void upgrade() {
        HttpRouter router = new HttpRouter(summer.getBeansInPackage("me.chaopeng.sample.handlers", AbstractHttpHandler).values())
        serviceHandler.setHttpRouter(router);
    }
}
