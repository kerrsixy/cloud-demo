package com.zjp.feginservice.client.decoder;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: CustomErrorDecoder
 * Package: com.zjp.feginservice.client.decoder
 * Description:
 *
 * @Author zjp
 * @Create 2024/10/10 18:00
 * @Version 1.0
 */
@Slf4j
public class CustomErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() > 200) {
            log.error("请求失败");
            return new RuntimeException("请求失败");
        } else {
            return defaultErrorDecoder.decode(s, response);
        }
    }
}
