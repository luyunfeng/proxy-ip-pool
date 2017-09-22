package cn.lucode.proxyip.dal.dao;

import cn.lucode.proxyip.dal.pojo.ProxyIp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProxyIpMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProxyIp record);

    int insertSelective(ProxyIp record);

    ProxyIp selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProxyIp record);

    int updateByPrimaryKey(ProxyIp record);
}