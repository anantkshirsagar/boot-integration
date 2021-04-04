package in.sb.mybatis.bean;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan("in.sb")
public class MybatisConfigration {

	private static final Logger LOG = LoggerFactory.getLogger(MybatisConfigration.class);

	private final DatabaseConfig config;

	public MybatisConfigration(DatabaseConfig config) {
		this.config = config;
	}

	@Bean
	public DriverManagerDataSource getDatasource() {
		DriverManagerDataSource driverManager = new DriverManagerDataSource();
		driverManager.setDriverClassName(config.getDriver());
		driverManager.setUrl(config.getUrl());
		driverManager.setUsername(config.getUsername());
		driverManager.setPassword(config.getPassword());
		LOG.debug("Data source created!");
		return driverManager;
	}

	@Bean
	public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(new ClassPathResource("META-INF/mybatis/mybatis-config.xml"));
		LOG.debug("Sql session factory created!");
		return factoryBean.getObject();
	}

	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		LOG.debug("Transaction manager created!");
		return new DataSourceTransactionManager(dataSource);
	}

}
