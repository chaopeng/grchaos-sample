This is a sample project to show how to build a hotswapable webservices base on [GrChaos](https://github.com/chaopeng/grchaos) and [chaosrx](https://github.com/chaopeng/chaosrx).

1. import into idea
2. add a run configure: mainClass=me.chaopeng.grchaos.application.GrChaosApplicationMain, module=grchaos-sample-lib_main
3. run, type start in console and try access `127.0.0.1:8888`
4. change `SampleHandler`, type reload and try access `127.0.0.1:8888` again to see the different