package top.heyqing.heyllama.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import top.heyqing.heyllama.annotation.ModelValidator;

import javax.validation.constraints.NotNull;

/**
 * ClassName:LlamaConfig
 * Package:top.heyqing.heyllama.config
 * Description:
 * llama配置类
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Data
@Validated
@ConfigurationProperties(prefix = "llama")
public class LlamaConfig {

    @NotNull
    private String baseUrl;

    @NotNull
    @ModelValidator
    private String model;

}
