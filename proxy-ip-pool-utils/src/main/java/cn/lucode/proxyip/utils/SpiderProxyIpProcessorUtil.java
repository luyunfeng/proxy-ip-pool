package cn.lucode.proxyip.utils;

import cn.lucode.proxyip.utils.model.ProxyIpModel;
import cn.lucode.util.UserAgentUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunfeng.lu on 2017/9/21.
 */
public class SpiderProxyIpProcessorUtil implements PageProcessor {

    @Override
    public void process(Page page) {
        List<String> ipList = page.getHtml().xpath("//tr[@class='odd']//td[2]/text()").all();
        List<String> portList = page.getHtml().xpath("//tr[@class='odd']//td[3]/text()").all();
        List<ProxyIpModel> proxyIpModelRes = new ArrayList();
        for (int i = 0; i < ipList.size(); i++) {
            ProxyIpModel proxyIpModel = new ProxyIpModel();
            proxyIpModel.setIp(ipList.get(i));
            proxyIpModel.setPort(portList.get(i));
            proxyIpModelRes.add(proxyIpModel);
        }
        page.putField("proxyIpModelRes", proxyIpModelRes);

        //page.addTargetRequest("http://www.xicidaili.com/nn/3");
        for (int i=0;i<1000;i++){
            String url="http://www.xicidaili.com/nn/"+i+3;
            page.addTargetRequest(url);
        }
    }
    @Override
    public Site getSite() {
        return Site.me()
                .setTimeOut(6000)
                .setRetryTimes(3)
                .setSleepTime(1000)
                .setCharset("UTF-8")
                .addHeader("Accept-Encoding", "/")
                .setUserAgent(UserAgentUtils.radomUserAgent());
    }
}
