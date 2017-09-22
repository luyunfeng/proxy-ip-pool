import cn.lucode.util.UserAgentUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;

import java.util.List;

/**
 * Created by yunfeng.lu on 2017/9/19.
 */
public class GithubRepoPageProcessor implements PageProcessor {

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    //private Site site = Site.me().setRetryTimes(3).setSleepTime(2000).addCookie();

    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {
        System.out.println(page.getHtml().toString());

        List<String> ipList = page.getHtml().xpath("//td[@data-title=\"IP\"]/text()").all();
        List<String> portList = page.getHtml().xpath("//tr[@data-title=\"PORT\"]/text()").all();
        page.putField("result", ipList);


    }

    @Override
    public Site getSite() {
        Site site = Site.me().setTimeOut(6000).setRetryTimes(3)
                .setSleepTime(1000).setCharset("UTF-8").addHeader("Accept-Encoding", "/")
                .setUserAgent(UserAgentUtils.radomUserAgent());
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).
                addUrl("http://www.kuaidaili.com/free/intr/2/")
                //开启5个线程抓取
                .thread(5)
                //启动爬虫
                .run();
    }
}
