package com.zht.cloud.domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张洪涛
 * @create 2020-05-13 18:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult
{
    private Integer code;
    private String  message;
    private Object  data;

    public static CommonResult success(Object data){
        return new CommonResult(500,"请求成功",data);
    }
    public static CommonResult success(String msg,Object data){
        return new CommonResult(500,msg,data);
    }
    public static CommonResult error(){
        return new CommonResult(400,"请求失败",null);
    }
    public static CommonResult error(Integer code, String message){
        return new CommonResult(code,message,null);
    }
}
