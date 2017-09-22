package cn.lucode.proxyip.utils.model;

import com.alibaba.fastjson.annotation.JSONField;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * Created by yunfeng.lu on 2017/9/21.
 */

public class ProxyIpModel implements Serializable {

    private static final long serialVersionUID = -6734268779330087826L;
    private String ip;
    private String port;
    private double delay;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Data modifyTime;// 最后确认时间

    @Override
    public String toString() {
        return "ProxyIpModel{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", delay=" + delay +
                ", modifyTime=" + modifyTime +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public double getDelay() {
        return delay;
    }

    public void setDelay(double delay) {
        this.delay = delay;
    }

    public Data getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Data modifyTime) {
        this.modifyTime = modifyTime;
    }


}
