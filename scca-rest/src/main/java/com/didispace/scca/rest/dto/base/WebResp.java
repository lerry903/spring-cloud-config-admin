package com.didispace.scca.rest.dto.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by 程序猿DD/翟永超 on 2018/5/17.
 * <p>
 * Blog: http://blog.didispace.com/
 * Github: https://github.com/dyc87112/
 */
@Data
public class WebResp<T> {

    public static final Integer SUCCESS = 200;
    public static final Integer ERROR = 500;


    private Integer code;
    private T data;
    @ApiModelProperty("响应消息")
    private String message;
    @ApiModelProperty("时间戳")
    private Long now = System.currentTimeMillis();

    public static <T> WebResp<T> success(T data) {
        WebResp<T> webResp = new WebResp<>();
        webResp.setCode(SUCCESS);
        webResp.setData(data);
        return webResp;
    }

    public static WebResp<String> success(String message) {
        WebResp<String> webResp = new WebResp<>();
        webResp.setCode(SUCCESS);
        webResp.setMessage(message);
        webResp.setData("");
        return webResp;
    }

    public static <T> WebResp<T> success(T data, String message) {
        WebResp<T> webResp = new WebResp<>();
        webResp.setCode(SUCCESS);
        webResp.setData(data);
        webResp.setMessage(message);
        return webResp;
    }

}
