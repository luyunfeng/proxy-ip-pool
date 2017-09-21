package cn.lucode.proxyip.dal.dao;

import cn.lucode.proxyip.dal.pojo.ProxyIp;

public interface ProxyIpMapper {
    int deleteByPrimaryKey(String ip);

    int insert(ProxyIp record);

    int insertSelective(ProxyIp record);

    ProxyIp selectByPrimaryKey(String ip);

    int updateByPrimaryKeySelective(ProxyIp record);

    int updateByPrimaryKey(ProxyIp record);
}