package top.heyqing.heyllama.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:Options
 * Package:top.heyqing.heyllama.param
 * Description:
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Data
@ApiModel(value = "请求额外模型参数")
public class Options implements Serializable {

    private static final long serialVersionUID = -1154537948377017944L;
    @ApiModelProperty(value = "模型温度参数")
    private Double temperature;

    @ApiModelProperty(value = "其他额外参数可以添加这里")
    private Object additionalParameters;
}
