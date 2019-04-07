package com.boot.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfig {
	
//	@Bean(name = "dataSource")
//	@Primary
//	@Qualifier(value = "dataSource")
	@ConfigurationProperties(prefix = "jdbc.c3p0.primary")
	public DataSource dataSource() {
		System.out.println("datasource-------------------");
		
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}
