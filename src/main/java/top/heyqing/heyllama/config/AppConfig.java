package top.heyqing.heyllama.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:AppConfig
 * Package:top.heyqing.heyllama.config
 * Description:
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Configuration
@EnableConfigurationProperties(LlamaConfig.class)
public class AppConfig {
}
