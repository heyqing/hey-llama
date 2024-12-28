package top.heyqing.heyllama.constants;

/**
 * ClassName:ApiConstant
 * Package:top.heyqing.heyllama.constants
 * Description:
 * llama api路径
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
public interface ApiConstant {

    /**
     * Generate a completion:生成补全
     * POST
     */
    /*
    使用提供的模型生成给定提示的响应。这是一个流端点，因此会有一系列响应。最终响应对象将包括来自请求的统计信息和附加数据。
     */
    String GENERATE = "/api/generate";

    /**
     * Generate a chat completion:生成聊天完成
     * POST
     */
    /*
    在与提供的模型的聊天中生成下一条消息。这是一个流端点，因此会有一系列响应。可以使用 "stream": false 禁用流式传输。
    最终响应对象将包括来自请求的统计信息和附加数据。
     */
    String CHAT = "/api/chat";

    /**
     * Create a Model:创建模型
     * POST
     */
    /*
    从模型文件创建模型。建议将 modelfile 设置为 Modelfile 的内容，而不仅仅是设置路径。
    这是远程创建的要求。远程模型创建还必须使用“创建 Blob”与服务器显式创建任何文件 Blob、字段（例如 FROM 和 ADAPTER）以及响应中指示的路径的值。
     */
    String CREATE = "/api/create";

    /**
     * Check if a Blob Exists:检查 Blob 是否存在
     * HEAD
     * other:/api/blobs/:digest
     * <p>
     * Create a Blob:创建 Blob
     * other:/api/blobs/:digest
     * POST
     */
    /*
    确保服务器上存在用于 FROM 或 ADAPTER 字段的文件 blob。这是检查您的 Ollama 服务器而不是 ollama.com。
    And
    从服务器上的文件创建 blob。返回服务器文件路径。
     */
    String BLOB = "/api/blobs";

    /**
     * List Local Models:列出本地
     * GET
     */
    /*
    列出本地可用的型号。
     */
    String TAG = "/api/tags";

    /**
     * Show Model Information:显示型号信息
     * POST
     */
    /*
    显示有关模型的信息，包括详细信息、模型文件、模板、参数、许可证、系统提示。
     */
    String SHOW = " /api/show";

    /**
     * Copy a Model:拷贝模型
     * POST
     */
    /*
    复制模型。使用现有模型的另一个名称创建模型。
     */
    String COPY = "/api/copy";

    /**
     * Delete a Model:删除模型
     * DELETE
     */
    /*
    删除模型及其数据。
     */
    String DELETE_MODEL = "/api/delete";

    /**
     * Pull a Model:拉取一个模型
     * POST
     */
    /*
    从 ollama 库下载模型。取消的拉取将从中断处恢复，并且多个调用将共享相同的下载进度。
     */
    String PULL = "/api/pull";

    /**
     * Push a Model:推送模型
     * POST
     */
    /*
    将模型上传到模型库。需要先注册 ollama.ai 并添加公钥。
     */
    String PUSH = "/api/push";

    /**
     * Generate Embeddings:生成嵌入
     * POST
     */
    /*
    从模型生成嵌入
     */
    String EMBED = "/api/embed";

    /**
     * List Running Models:列出运行模型
     * GET
     */
    /*
    列出当前加载到内存中的模型。
     */
    String PS = "/api/ps";
}
