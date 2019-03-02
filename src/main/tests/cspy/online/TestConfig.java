package cspy.online;

import cspy.online.bean.UserTable;
import cspy.online.bean.UserTableExample;
import cspy.online.config.SimpleCloudInitializer;
import cspy.online.mapper.UserTableMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

/**
 * @author CSpy
 * @date 2019/2/22 13:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestConfig {

    @Autowired
    ApplicationContext context;

//    @Autowired
//    UserTable userTable;

    @Autowired
    UserTableMapper userTableMapper;

    @Autowired
    SimpleCloudInitializer initializer;

    @Test
    public void testConfig() {
        System.out.println(Arrays.toString(initializer.getBasicDir().toArray()));
    }

    @Test
    public void testCURD() {
//        UserTable userTable = context.getBean(UserTable.class);
        UserTable userTable = new UserTable();

        UserTableExample userTableExample = new UserTableExample();


    }


}
