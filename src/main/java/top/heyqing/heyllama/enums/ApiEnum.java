package top.heyqing.heyllama.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import top.heyqing.heyllama.constants.ApiConstant;


import static top.heyqing.heyllama.constants.ApiConstant.*;
import static top.heyqing.heyllama.constants.HttpReqTypeConstant.*;

/**
 * ClassName:ApiEnum
 * Package:top.heyqing.heyllama.enums
 * Description:
 * api枚举类
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Getter
@AllArgsConstructor
public enum ApiEnum {

    /**
     * Generate a completion
     */
    GENERATE_API(GENERATE, POST),

    /**
     * Generate a chat completion
     */
    CHAT_API(CHAT, POST),

    /**
     * Create a Model
     */
    CREATE_API(CREATE, POST),

    /**
     * Check if a Blob Exists
     */
    BLOB_HEAD_API(BLOB, HEAD),

    /**
     * Create a Blob
     */
    BLOB_POST_API(BLOB, POST),

    /**
     * List Local Models
     */
    TAG_API(TAG, GET),

    /**
     * Show Model Information
     */
    SHOW_API(SHOW, POST),

    /**
     * Copy a Model
     */
    COPY_API(COPY, POST),

    /**
     * Delete a Model
     */
    DELETE_MODEL_API(DELETE_MODEL, DELETE),

    /**
     * Pull a Model
     */
    PULL_API(PULL, POST),

    /**
     * Push a Model
     */
    PUSH_API(PUSH, POST),

    /**
     * Generate Embeddings
     */
    EMBED_API(EMBED, POST),

    /**
     * List Running Models
     */
    PS_API(PS, GET);

    private final String url;
    private final String reqMethod;

    /**
     * 路径校验
     *
     * @param suffixUrl
     * @return
     */
    public static boolean isValid(String suffixUrl) {
        for (ApiEnum apiEnum : ApiEnum.values()) {
            if (apiEnum.getUrl().equals(suffixUrl)) {
                return true;
            }
        }
        return false;
    }
}
