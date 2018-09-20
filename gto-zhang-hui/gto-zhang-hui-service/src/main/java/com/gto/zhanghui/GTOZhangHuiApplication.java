package com.gto.zhanghui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan(basePackages = {"com.gto.zhanghui.dao"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GTOZhangHuiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GTOZhangHuiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GTOZhangHuiApplication.class);
	}
}
