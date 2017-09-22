import cn.lucode.StartApplication;
import cn.lucode.proxyip.dal.dao.ProxyIpMapper;
import cn.lucode.proxyip.dal.pojo.ProxyIp;
import cn.lucode.util.TinyUUIDGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by yunfeng.lu on 2017/9/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)
@TestPropertySource("classpath:application.properties")
public class DalTest {
    @Autowired
    private ProxyIpMapper proxyIpMapper;

    @Test
    public void test(){
        ProxyIp proxyIp=new ProxyIp();
        proxyIp.setId(TinyUUIDGenerator.generate());
        proxyIp.setIp("192.168.0.1");
        proxyIp.setPort("88");
        proxyIp.setDelay(new BigDecimal(Double.valueOf(20.1)));
        System.out.println(proxyIp.toString());
        System.out.println(proxyIpMapper.insert(proxyIp));
    }
    @Test
    public void test2(){
        System.out.println(proxyIpMapper.selectByPrimaryKey("20170922104956012000001008300040"));
    }

}
