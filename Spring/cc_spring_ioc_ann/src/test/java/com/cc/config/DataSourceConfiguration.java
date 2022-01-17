package com.cc.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {
    @Value("${jdbc.Driver}")
    private String driver;
    @Value("${jdbc.Url}")
    private String url;
    @Value("${jdbc.username}")
    private String user;
    @Value("jdbc.password")
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource() throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        return comboPooledDataSource;

    }
}