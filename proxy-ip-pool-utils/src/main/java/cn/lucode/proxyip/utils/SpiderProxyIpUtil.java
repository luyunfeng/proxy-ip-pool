package cn.lucode.proxyip.utils;

import cn.lucode.util.UserAgentUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by yunfeng.lu on 2017/9/21.
 */

@Component
@Scope("singleton")
public class SpiderProxyIpUtil {

    @Value("${spider.url}")
    private String url;

    public class ProxyIpPageProcessor implements PageProcessor {

        @Override
        public void process(Page page) {

        }

        @Override
        public Site getSite() {
            return Site.me().
                    setTimeOut(6000)
                    .setRetryTimes(3)
                    .setSleepTime(1000)
                    .setCharset("UTF-8")
                    .addHeader("Accept-Encoding", "/")
                    .setUserAgent(UserAgentUtils.radomUserAgent());
        }
    }


}
