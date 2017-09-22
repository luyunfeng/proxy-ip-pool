package cn.lucode.proxyip.service;

import cn.lucode.proxyip.service.api.ICrawlManager;
import cn.lucode.proxyip.service.api.ISpiderProxyIpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yunfeng.lu on 2017/9/22.
 */
@Service
public class SpiderProxyIpService implements ISpiderProxyIpService{
    @Autowired
    private ICrawlManager crawlManager;

    public void addIpFromWeb(){
        crawlManager.proxyIPCrawl();
    }
}
