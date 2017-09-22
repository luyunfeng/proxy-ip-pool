package cn.lucode.proxyip.utils;

import cn.lucode.proxyip.dal.dao.ProxyIpMapper;
import cn.lucode.proxyip.dal.pojo.ProxyIp;
import cn.lucode.proxyip.utils.model.ProxyIpModel;
import cn.lucode.util.TinyUUIDGenerator;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;
import us.codecraft.webmagic.pipeline.Pipeline;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yunfeng.lu on 2017/9/22.
 */
@Component("SpiderProxyIPipelineUtil")
public class SpiderProxyIpPipelineUtil implements Pipeline {

    @Resource
    private ProxyIpMapper proxyIpMapper;

    /**
     * Process extracted results.
     *
     * @param resultItems resultItems
     * @param task        task
     */
    @Override
    public void process(ResultItems resultItems, Task task) {
        List<ProxyIpModel> list=resultItems.get("proxyIpModelRes");
        for (int i=0;i<list.size();i++){
            ProxyIp record=new ProxyIp();
            record.setId(TinyUUIDGenerator.generate());
            record.setIp(list.get(i).getIp());
            record.setPort(list.get(i).getPort());
            proxyIpMapper.insert(record);
        }
    }
}
