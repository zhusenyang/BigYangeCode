package com.boot.config;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class C3P0DataSource {
	
	
	@Bean(name = "dataSource")
	@Primary
	@Qualifier(value = "dataSource")
//	@ConfigurationProperties(prefix="jdbc.c3p0.primary")
	public DataSource createC3P0() throws Exception{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		dataSource.setJdbcUrl("jdbc:mysql://119.23.23.35:3306/my_website?useSSL=false");
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到驱动！！！");
			e.printStackTrace();
		}
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(30);
		dataSource.setMaxIdleTime(1800000);
		dataSource.setAcquireIncrement(3);
		dataSource.setMaxStatements(1000);
		dataSource.setInitialPoolSize(5);
		dataSource.setIdleConnectionTestPeriod(60);
		dataSource.setAcquireRetryAttempts(30);
		dataSource.setAcquireRetryDelay(1000);
		dataSource.setBreakAfterAcquireFailure(false);
		dataSource.setTestConnectionOnCheckout(false);
		dataSource.setIdleConnectionTestPeriod(200);
//		Connection conn = dataSource.getConnection();
//		System.out.println("conn="+conn);
//		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
		System.out.println("加载连接池");
		return dataSource;
	}
}
