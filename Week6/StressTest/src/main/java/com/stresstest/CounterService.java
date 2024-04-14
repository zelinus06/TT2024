package com.stresstest;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class CounterService {
    private int sum = 0;
    @Cacheable("Sum")
    public int incrementCount() {
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        return sum;
    }
}

