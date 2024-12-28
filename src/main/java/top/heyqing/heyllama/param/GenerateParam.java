package top.heyqing.heyllama.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName:GenerateParam
 * Package:top.heyqing.heyllama.param
 * Description:
 * 生成请求参数
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Data
@ApiModel(value = "生成请求参数")
public class GenerateParam implements Serializable {
    private static final long serialVersionUID = 1082723842134204724L;


    @ApiModelProperty(value = "模型名称", required = true)
    private String model;

    @ApiModelProperty(value = "提示内容,问题")
    private String prompt;

    @ApiModelProperty(value = "模型响应后的后缀文本")
    private String suffix;

    @ApiModelProperty(value = "Base64编码的图片列表")
    private List<String> images;

    @ApiModelProperty(value = "响应格式(json 或 JSON schema)")
    private String format;

    @ApiModelProperty(value = "额外模型参数")
    private Options options;

    @ApiModelProperty(value = "系统消息，覆盖Modelfile中的定义")
    private String system;

    @ApiModelProperty(value = "模板提示，覆盖Modelfile中的定义")
    private String template;

    @ApiModelProperty(value = "是否返回单一响应对象，而非流对象")
    private Boolean stream;

    @ApiModelProperty(value = "是否对提示不应用格式化")
    private Boolean raw;

    @ApiModelProperty(value = "模型在内存中的保持时间，默认5分钟")
    private String keepAlive;

    @ApiModelProperty(value = "用于短对话记忆的上下文信息（已弃用）")
    private String context;


}
