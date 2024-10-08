package com.zjp.orderservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.File;

/**
 * ClassName: H2DataSourceConfig
 * Package: com.zjp.userservice.config
 * Description:
 * 初始化h2数据库
 *
 * @Author zjp
 * @Create 2024/9/30 10:56
 * @Version 1.0
 */
@Slf4j
@Service
@AutoConfigureAfter(DataSource.class)
public class H2DataSourceConfig {

    //初始化sql
    private static final String SCHEMA = "classpath:db/schema-h2.sql";

    @Autowired
    DataSource dataSource;

    @Autowired
    ApplicationContext applicationContext;

    @PostConstruct
    public void init() throws Exception {
        //初始化本地数据库
        String userHome = System.getProperty("user.home");//获取系统用户目录
        File f = new File(userHome + File.separator + "h2.lck");
        if (!f.exists()) {
            log.info("--------------初始化h2数据----------------------");
            f.createNewFile();
        } else {
            log.info("--------------h2数据库已经存在----------------------");
        }
        Resource resource = applicationContext.getResource(SCHEMA);
        ScriptUtils.executeSqlScript(dataSource.getConnection(), resource);
    }
}