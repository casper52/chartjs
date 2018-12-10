package org.gorany;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="org.gorany.mapper")
public class ChartTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChartTestApplication.class, args);
	}
}
