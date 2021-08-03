package com.test.micronaut;

import io.micronaut.context.annotation.Configuration;
import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Requires;

import javax.inject.Singleton;
import java.util.List;


@ConfigurationProperties("app")
public class ConfigProperties {

    private String name;
    private String description;

    private Level level1=new Level();
    @ConfigurationProperties("level1")
    public static class Level {
        private String key1;
        private String key2;
        private List<String> servers;

        public String getKey1() {
            return key1;
        }

        public void setKey1(String key1) {
            this.key1 = key1;
        }

        public String getKey2() {
            return key2;
        }

        public void setKey2(String key2) {
            this.key2 = key2;
        }

        public List<String> getServers() {
            return servers;
        }

        public void setServers(List<String> servers) {
            this.servers = servers;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Level getLevel1() {
        return level1;
    }

    public void setLevel1(Level level1) {
        this.level1 = level1;
    }
}
