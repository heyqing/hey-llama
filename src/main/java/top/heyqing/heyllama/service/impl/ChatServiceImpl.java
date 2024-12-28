package top.heyqing.heyllama.service.impl;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import top.heyqing.heyllama.constants.RoleConstant;
import top.heyqing.heyllama.param.ChatParam;
import top.heyqing.heyllama.service.ChatService;
import top.heyqing.heyllama.vo.R;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static top.heyqing.heyllama.util.LlamaUtil.genReqUrl;
import static top.heyqing.heyllama.util.LlamaUtil.getModel;
import static top.heyqing.heyllama.constants.ApiConstant.CHAT;

/**
 * ClassName:ChatServiceImpl
 * Package:top.heyqing.heyllama.service.impl
 * Description:
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Service
public class ChatServiceImpl implements ChatService {

    /**
     * 测试接口
     *
     * @param content
     * @return
     */
    @SneakyThrows
    @Override
    public R test(String content) {
        String jsonParam = initReqParam(content, false);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(300, TimeUnit.SECONDS) // 设置连接超时,采用非流式时耗费时间 - 测试阶段建议问题简单易回答
                .readTimeout(300, TimeUnit.SECONDS)    // 设置读取超时
                .writeTimeout(300, TimeUnit.SECONDS)   // 设置写入超时
                .build();
        okhttp3.RequestBody body = okhttp3.RequestBody.create(MediaType.parse("application/json"), jsonParam);
        String reqUrl = genReqUrl(CHAT);
        Request request = new Request.Builder()
                .url(reqUrl)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return R.ok().data(response.body().string().toString());
    }

    /*****************************************************************private*****************************************************************/

    /**
     * 初始化请求参数
     *
     * @param content
     * @param isStream
     * @return
     */
    private String initReqParam(String content, boolean isStream) {
        ChatParam.Message message = new ChatParam.Message();
        message.setRole(RoleConstant.USER);
        message.setContent(content);
        ChatParam chatParam = new ChatParam();
        chatParam.setModel(getModel());
        chatParam.setMessages(Arrays.asList(message));
        chatParam.setStream(isStream);
        String jsonRequest = JSON.toJSONString(chatParam);
        return jsonRequest;
    }

}
