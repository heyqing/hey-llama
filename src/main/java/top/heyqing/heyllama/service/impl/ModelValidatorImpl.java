package top.heyqing.heyllama.service.impl;

import top.heyqing.heyllama.annotation.ModelValidator;
import top.heyqing.heyllama.constants.ModelConstant;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * ClassName:ModelValidatorImpl
 * Package:top.heyqing.heyllama.service.impl
 * Description:
 * 模型校验实现类
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
public class ModelValidatorImpl implements ConstraintValidator<ModelValidator, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        // 校验值是否在 ModelConstant 中
        return value.equals(ModelConstant.LLAMA32_LATEST) || value.equals(ModelConstant.QWEN25_CODER_3B);
    }
}