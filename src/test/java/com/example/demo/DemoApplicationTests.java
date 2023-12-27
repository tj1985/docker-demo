package com.example.demo;

import com.example.demo.conf.MailProperties;
import com.example.demo.importer.CacheType;
import com.example.demo.importer.EnableMyCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableMyCache(type = CacheType.LOCAL)
class DemoApplicationTests {
    @Autowired
	private MailProperties mailProperties;

	@Test
	void contextLoads() {
		System.out.println(mailProperties.getHostname());
		System.out.println(mailProperties.getPort());
	}

}
