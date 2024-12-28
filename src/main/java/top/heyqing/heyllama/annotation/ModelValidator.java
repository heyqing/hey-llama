package top.heyqing.heyllama.annotation;

import top.heyqing.heyllama.service.impl.ModelValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:ModelValidator
 * Package:top.heyqing.heyllama.annotation
 * Description:
 * 模型校验
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Constraint(validatedBy = ModelValidatorImpl.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ModelValidator {
    String message() default "Invalid model name";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
