package cn.lucode.proxyip.service;

import cn.lucode.proxyip.service.api.ICrawlManager;
import cn.lucode.proxyip.utils.SpiderProxyIpPipelineUtil;
import cn.lucode.proxyip.utils.SpiderProxyIpProcessorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;

import javax.annotation.Resource;

/**
 * Created by yunfeng.lu on 2017/9/22.
 */
@Service
public class CrawlManager implements ICrawlManager {

    @Autowired
    private SpiderProxyIpPipelineUtil spiderProxyIpPipelineUtil;

    @Override
    public void proxyIPCrawl() {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        httpClientDownloader.setProxyProvider(
                SimpleProxyProvider.from(new Proxy("116.255.165.250",3128)));
        OOSpider.create(new SpiderProxyIpProcessorUtil()).setDownloader(httpClientDownloader)
                .addUrl("http://www.xicidaili.com/nn/2").addPipeline(spiderProxyIpPipelineUtil)
                .thread(5)
                .run();
    }
}
