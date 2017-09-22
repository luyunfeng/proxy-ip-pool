//package cn.lucode.proxyip.utils;
//
//import cn.lucode.proxyip.utils.model.ProxyIpModel;
//import cn.lucode.util.UserAgentUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import us.codecraft.webmagic.Site;
//import us.codecraft.webmagic.model.OOSpider;
//
//import java.util.List;
//
///**
// * Created by yunfeng.lu on 2017/9/22.
// */
//@Component
//@Scope("singleton")
//public class SpiderProxyIpCrawlerUtil {
//
//    @Qualifier("SpiderProxyIPipelineUtil")
//    @Autowired
//    private SpiderProxyIpPipelineUtil spiderProxyIpPipelineUtil;
//
//    public void crawl() {
//        OOSpider.create()
//                .addUrl("http://www.xicidaili.com/nn/1")
//                .thread(5)
//                .run();
//    }
//
//}
