package top.heyqing.heyllama.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.heyqing.heyllama.config.LlamaConfig;
import top.heyqing.heyllama.enums.ApiEnum;
import top.heyqing.heyllama.exception.HeyLlamaException;

/**
 * ClassName:LlamaUtil
 * Package:top.heyqing.heyllama.util
 * Description:
 * llama工具类
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
public class LlamaUtil {

    /**
     * 获取请求路径
     *
     * @param suffixUrl
     * @return
     */
    public static String genReqUrl(String suffixUrl) {
        if (!ApiEnum.isValid(suffixUrl)) {
            throw new HeyLlamaException("Invalid suffixUrl: " + suffixUrl);
        }
        return LoadLlamaConfig.getBaseUrl() + suffixUrl;
    }

    /**
     * 获取模型名称
     *
     * @return
     */
    public static String getModel() {
        return LoadLlamaConfig.getModel();
    }

    @Component
    static class LoadLlamaConfig {
        private static String baseUrl;
        private static String model;

        // 使用构造器注入 LlamaConfig
        @Autowired
        public LoadLlamaConfig(LlamaConfig llamaConfig) {
            baseUrl = llamaConfig.getBaseUrl();
            model = llamaConfig.getModel();
        }

        public static String getBaseUrl() {
            return baseUrl;
        }

        public static String getModel() {
            return model;
        }
    }
}
