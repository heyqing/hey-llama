package top.heyqing.heyllama.controller;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.heyqing.heyllama.annotation.OptLog;
import top.heyqing.heyllama.service.ChatService;
import top.heyqing.heyllama.vo.R;

import static top.heyqing.heyllama.constants.OptConstant.*;

/**
 * ClassName:ChatController
 * Package:top.heyqing.heyllama.controller
 * Description:
 *
 * @Date:2024/12/28
 * @Author:Heyqing
 */
@Api(tags = "聊天接口")
@RestController
@RequestMapping("chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @OptLog(optType = TEST)
    @ApiOperation(value = "测试接口", notes = "该接口实现了测试接口的功能")
    @PostMapping("test")
    public R test(@Validated @RequestBody String content) {
        return chatService.test(content);
    }
}
