package com.stresstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.cache.CacheManager;

import java.util.List;

@Service
public class DataService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CacheManager cacheManager;

    @Cacheable(value = "productName", key = "'allData'")
    public List<Object[]> getAllData() {
        return jdbcTemplate.query("SELECT * FROM product", (rs, rowNum) -> {
            int columnCount = rs.getMetaData().getColumnCount();
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = rs.getObject(i);
            }
            return rowData;
        });
    }
    public void clearCache() {
        String cacheName = "productName";
        cacheManager.getCache(cacheName).clear();
    }
}

