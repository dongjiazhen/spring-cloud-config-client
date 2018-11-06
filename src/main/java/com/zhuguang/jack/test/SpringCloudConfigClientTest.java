/**   
* @Title:：SpringCloudConfigClientTest.java 
* @Package ：com.zhuguang.jack.test 
* @Description： TODO
* @author： lcai   
* @date： 2018年11月6日 下午2:25:16 
* @version ： 1.0   
*/
package com.zhuguang.jack.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.zhuguang.jack.conf.DataSourceProperties;
import com.zhuguang.jack.start.SpringBootSimpleApplication;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootSimpleApplication.class)
@WebAppConfiguration
public class SpringCloudConfigClientTest {

	@Autowired
	DataSourceProperties dataSourceProperties;
	
	@Value("${username}")
	private String username;
	
	@Test
	public void test1() {
		/**
		 * 获取github里面的
		 */
		System.out.println(dataSourceProperties.getDriverClassName());
		System.out.println(dataSourceProperties.getUrl());
		System.out.println(dataSourceProperties.getUsername());
		System.out.println(dataSourceProperties.getPassword());
		System.out.println(username);
		
	}
	
}
