package top.heyqing.heyllama.exception;

/**
 * ClassName:HeyLlamaException
 * Package:top.heyqing.heyllama.exception
 * Description:
 * 自定义异常
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
public class HeyLlamaException extends RuntimeException {

    // 构造函数，无参数
    public HeyLlamaException() {
        super();
    }

    // 构造函数，带有详细消息
    public HeyLlamaException(String message) {
        super(message);
    }

    // 构造函数，带有详细消息和原因
    public HeyLlamaException(String message, Throwable cause) {
        super(message, cause);
    }

    // 构造函数，带有原因
    public HeyLlamaException(Throwable cause) {
        super(cause);
    }
}

