package com.fish.springboot.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: Jayzou
 * @Date: 2019/2/1
 */
@ConfigurationProperties("acme")
@Data
public class AcmeProperties {

    private boolean enabled;
    private InetAddress remoteAddress;
    private final Security security = new Security();

    @Data
    public static class Security {
        private String username;
        private String password;
        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

    }
}
