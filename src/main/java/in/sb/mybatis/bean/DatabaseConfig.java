package in.sb.mybatis.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:database-config.properties")
public class DatabaseConfig {

	@Value("${in.app.sql.jdbc.url}")
	private String url;

	@Value("${in.app.sql.jdbc.driver}")
	private String driver;

	@Value("${in.app.sql.jdbc.username}")
	private String username;

	@Value("${in.app.sql.jdbc.password}")
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DatabaseConfig [url=");
		builder.append(url);
		builder.append(", driver=");
		builder.append(driver);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
