package com.scallion.client.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.kerberos.client.KerberosRestTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/24 10:32
 */
@Configuration
public class KerberosConfig {
    @Value("${app.user-principal}")
    private String principal;

    @Value("${app.keytab-location}")
    private String keytabLocation;

    @Bean
    public RestTemplate restTemplate() {
        return new KerberosRestTemplate(keytabLocation, principal);
    }
}
