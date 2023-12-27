package com.example.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class RedisHttpSessionConfig {
    public RedisHttpSessionConfig() {
        // TODO Auto-generated constructor stub
    }
}
