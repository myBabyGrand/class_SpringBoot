package hello.config;

import hello.datasource.MyDataSource;
import hello.datasource.MyDataSourcePropertiesV3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Slf4j
@EnableConfigurationProperties(MyDataSourcePropertiesV3.class)
public class MyDataSourceConfigV3 {
    private final MyDataSourcePropertiesV3 properties;

    public MyDataSourceConfigV3(MyDataSourcePropertiesV3 properties) {
        this.properties = properties;
    }

    @Bean
    public MyDataSource myDataSource() {
        return MyDataSource
                .builder()
                .url(properties.getUrl())
                .username(properties.getUsername())
                .password(properties.getPassword())
                .maxConnection(properties
                        .getEtc()
                        .getMaxConnection())
                .timeout(properties
                        .getEtc()
                        .getTimeout())
                .options(properties
                        .getEtc()
                        .getOptions())
                .build();
    }
}
