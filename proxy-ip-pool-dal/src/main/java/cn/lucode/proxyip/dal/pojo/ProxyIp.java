package cn.lucode.proxyip.dal.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class ProxyIp implements Serializable {
    private static final long serialVersionUID = 2198206330908963570L;
    private String id;

    private String ip;

    private String port;

    private BigDecimal delay;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    @Override
    public String toString() {
        return "ProxyIp{" +
                "id='" + id + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", delay=" + delay +
                ", modifyTime=" + modifyTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BigDecimal getDelay() {
        return delay;
    }

    public void setDelay(BigDecimal delay) {
        this.delay = delay;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}