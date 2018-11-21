package io.github.liuht777.scheduler.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 组件配置类
 *
 * @author liuht
 */
@ConfigurationProperties(prefix = "taroco.scheduler")
@Data
public class TarocoSchedulerProperties {

    /**
     * ip black list
     */
    private List<String> ipBlackList;

    /**
     * spring task scheduler pool size, default: 10
     */
    private int poolSize = 10;

    /**
     * zk properties
     */
    private Zk zk;

    @Data
    public static class Zk {

        /**
         * zookeeper connect String eg: 192.168.1.12:2181,192.168.1.13:2181,192.168.1.14:2181
         */
        private String url;

        /**
         * scheduler tool root path, default: /taroco/scheduler
         */
        private String rootPath = "/taroco/scheduler";

        /**
         * zookeeper session timeout, default: 30000 ms
         */
        private int sessionTimeout = 30000;

        /**
         * connect timeout, default: 5000 ms
         */
        private int connectionTimeout = 5000;
    }
}