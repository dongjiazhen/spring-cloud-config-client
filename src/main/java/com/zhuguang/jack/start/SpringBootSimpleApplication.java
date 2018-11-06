/**   
* @Title:：SpringBootSimpleApplication.java 
* @Package ：com.zhuguang.jack.start 
* @Description： TODO
* @author： lcai   
* @date： 2018年11月6日 下午2:08:18 
* @version ： 1.0   
*/
package com.zhuguang.jack.start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.zhuguang.jack.conf.DataSourceProperties;
@SpringBootApplication
@EnableConfigurationProperties(DataSourceProperties.class)//开启配置文件DataSourceProperties
public class SpringBootSimpleApplication {

	/**
	 * SpringCloud Config 客户端的配置文件名字必须是：bootstrap.properties,否则无法加载
	 * @Title：main 
	 * @Description：TODO
	 * @param ：@param args 
	 * @return ：void 
	 * @throws
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootSimpleApplication.class, args);
	}
}
