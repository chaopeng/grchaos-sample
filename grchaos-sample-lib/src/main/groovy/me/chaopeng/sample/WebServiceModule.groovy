package me.chaopeng.sample

import me.chaopeng.grchaos.summer.AbstractSummerModule
import me.chaopeng.grchaos.summer.bean.NamedBean
import me.chaopeng.grchaos.summer.bean.PackageScan

/**
 * me.chaopeng.sample.WebServiceModule
 *
 * @author chao
 * @version 1.0 - 2016-07-05
 */
class WebServiceModule extends AbstractSummerModule{
    @Override
    protected List<NamedBean> configure() {
        return [fromClass(WebService)]
    }

    @Override
    protected List<NamedBean> mutableBeansConfigure() {
        return fromPackage(new PackageScan(packageName: "me.chaopeng.sample.handlers"))
    }

    @Override
    protected void start() {
        summer.getBean("webService").start()
    }
}
