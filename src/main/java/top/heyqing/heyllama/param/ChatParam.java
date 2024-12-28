package top.heyqing.heyllama.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName:ChatParam
 * Package:top.heyqing.heyllama.param
 * Description:
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Data
@ApiModel(value = "聊天请求参数")
public class ChatParam implements Serializable {
    private static final long serialVersionUID = 4696893498531802344L;
    @ApiModelProperty(value = "模型名称", required = true)
    private String model;

    @ApiModelProperty(value = "消息列表，保持对话记忆")
    private List<Message> messages;
    @ApiModelProperty(value = "模型可用的工具列表")
    private List<String> tools;

    @ApiModelProperty(value = "响应格式(json 或 JSON schema)")
    private String format;

    @ApiModelProperty(value = "额外模型参数")
    private Options options;

    @ApiModelProperty(value = "是否返回单一响应对象，而非流对象")
    private Boolean stream;

    @ApiModelProperty(value = "模型在内存中的保持时间，默认5分钟")
    private String keepAlive;

    @Data
    @ApiModel(value = "消息对象")
    public static class Message implements Serializable {

        private static final long serialVersionUID = -9065874638847682565L;
        @ApiModelProperty(value = "消息角色(system, user, assistant, tool)")
        private String role;

        @ApiModelProperty(value = "消息内容")
        private String content;

        @ApiModelProperty(value = "Base64编码的图片列表")
        private List<String> images;

        @ApiModelProperty(value = "工具调用列表")
        private List<String> toolCalls;
    }


}
