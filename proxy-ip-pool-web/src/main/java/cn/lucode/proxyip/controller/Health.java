package cn.lucode.proxyip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yunfeng.lu on 2017/9/19.
 */
@RestController
@RequestMapping("/health")
public class Health {
    @GetMapping("/check")
    public String check(){
        return "ok";
    }
}
