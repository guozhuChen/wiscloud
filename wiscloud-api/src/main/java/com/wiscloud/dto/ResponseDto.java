package com.wiscloud.dto;

/**
 * Created by Leslie on 2017/4/9.
 */
public class ResponseDto {
    int status; //状态 0:失败，1：成功
    String message; // 响应状态内容
    Object data; // 响应数据对象

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
