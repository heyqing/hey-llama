package top.heyqing.heyllama.annotation;

import java.lang.annotation.*;

/**
 * ClassName:OptLog
 * Package:top.heyqing.heyllama.annotation
 * Description:
 * 操作日志
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {

    /**
     * 操作类型
     *
     * @return
     */
    String optType() default "";

}