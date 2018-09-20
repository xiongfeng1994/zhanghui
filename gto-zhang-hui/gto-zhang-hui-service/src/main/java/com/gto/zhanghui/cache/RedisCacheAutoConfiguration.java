package com.gto.zhanghui.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.Jedis;

@Configuration
@ConditionalOnClass({ JedisConnection.class, RedisOperations.class, Jedis.class })
public class RedisCacheAutoConfiguration {

	@Autowired
	private StringRedisTemplate redisTemplate;

	@Bean
	public DistributedCache redisCache() {
		final SpringDataRedisCache redisCache = new SpringDataRedisCache();
		redisCache.setRedisTemplate(redisTemplate);
		RedisCacheUtil.setRedisCache(redisCache); // 填充工具类 代理
		return redisCache;
	}

}
