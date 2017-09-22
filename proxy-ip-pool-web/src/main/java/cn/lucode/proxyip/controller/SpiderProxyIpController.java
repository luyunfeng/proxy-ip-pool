package cn.lucode.proxyip.controller;

import cn.lucode.proxyip.service.api.ISpiderProxyIpService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yunfeng.lu on 2017/9/22.
 */
@RestController
@RequestMapping("/SpiderProxyIp")
public class SpiderProxyIpController {
    @Autowired
    private ISpiderProxyIpService  spiderProxyIpService;

    @GetMapping("/addIp")
    public String addIp(){
        spiderProxyIpService.addIpFromWeb();
        return "success";
    }

}
