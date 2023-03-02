package com.backend.sprng.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Slf4j
@Component
public class ApplicationRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

    // it was added just to log H2 Url
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        try {
            log.info("H2 Url: " + dataSource.getConnection().getMetaData().getURL());
        } catch (SQLException e) {
            log.error("failed to get dataSource connection", e);
        }
    }
}
