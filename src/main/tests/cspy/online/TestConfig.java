package cspy.online;

import cspy.online.config.SimpleCloudInitializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

/**
 * @author CSpy
 * @date 2019/2/22 13:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestConfig {

    @Autowired
    GenericApplicationContext context;

    @Autowired
    SimpleCloudInitializer initializer;

    @Test
    public void testConfig() {
        System.out.println(Arrays.toString(initializer.getBasicDir().toArray()));
    }


}
