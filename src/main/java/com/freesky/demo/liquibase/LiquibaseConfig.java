package com.freesky.demo.liquibase;

import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.pool.TypePool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class LiquibaseConfig {

    @Bean
    public SpringLiquibase createLiquibase(DataSource dataSource) {
        log.info("Start default database liquibase update");
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog("classpath:liquibase/master.xml");
        liquibase.setContexts("dev, default, production");
        liquibase.setShouldRun(true);

        liquibase.setResourceLoader(new DefaultResourceLoader());
        liquibase.setDatabaseChangeLogTable("liquibase_changelog");
        liquibase.setDatabaseChangeLogLockTable("liquibase_changelog_lock");
        return liquibase;
    }

}
