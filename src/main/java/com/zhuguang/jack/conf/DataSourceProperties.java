/**   
* @Title:：DataSourceProperties.java 
* @Package ：com.zhuguang.jack.conf 
* @Description： TODO
* @author： lcai   
* @date： 2018年11月6日 下午1:52:35 
* @version ： 1.0   
*/
package com.zhuguang.jack.conf;
import org.springframework.boot.context.properties.ConfigurationProperties;
//这个注解读取properties文件内容。使用这个注解，必须在启动类那里开启这个注解:@EnableConfigurationProperties
/**
 * 读取github仓库里面的：https://github.com/dongjiazhen/zg-config-repo.git 
 * 读取这个地址里面的properties：jack-cloudconfig-dev.properties和jack-cloudconfig-test.properties
 * 
 * jdbc.url=jdbc:mysql://127.0.0.1:3306/db1
 * jdbc.username=root
 * jdbc.password=root
 * jdbc.driverClassName=com.mysql.jdbc.Driver
 * 
 */
//properties文件里面的内容的前缀是 ：jdbc
@ConfigurationProperties(prefix="jdbc",ignoreUnknownFields=false)
public class DataSourceProperties {

	private String url;
	
	private String username;
	
	private String password;
	
	private String driverClassName;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	
}
