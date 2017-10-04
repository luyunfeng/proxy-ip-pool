package cn.lucode.proxyip.utils;

import cn.lucode.proxyip.utils.enums.RedisKey;
import cn.lucode.proxyip.utils.model.ProxyIpModel;
import cn.lucode.redis.service.IRedisOperation;
import cn.lucode.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yunfeng.lu on 2017/10/4.
 */
@Component
public class IPCacheUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(IPCacheUtil.class);

    @Autowired
    private IRedisOperation redisOperation;

    public static final Long TIME_OUT_DAY = 24 * 60 * 60L;

    public void save(ProxyIpModel proxyIpModel){
        redisOperation.setValue(RedisKey.KEY_PROXY_IP.getCode()
                + "_" + proxyIpModel.getIp()+":"+proxyIpModel.getPort(),
                JsonUtil.obj2Json(proxyIpModel), 7 * TIME_OUT_DAY);

    }

}
