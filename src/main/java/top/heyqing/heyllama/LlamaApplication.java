package top.heyqing.heyllama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.heyqing.heyllama.config.LogoConfig;

/**
 * ClassName:LlamaApplication
 * Package:top.heyqing.heyllama
 * Description:
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@SpringBootApplication
public class LlamaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LlamaApplication.class, args);
        LogoConfig.v();
    }
}
