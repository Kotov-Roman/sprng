package com.backend.sprng.config;

import com.backend.sprng.ApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class DataSourceConfigTest extends ApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void configurationTest_dbUrl_isInMemoryDevDb() {
        String url = null;
        try {
            url = dataSource.getConnection().getMetaData().getURL();
        } catch (SQLException e) {
            log.error("failed to get dataSource connection", e);
        }
        assertThat(url).isEqualTo("jdbc:h2:mem:memDEV-DB");
    }
}
