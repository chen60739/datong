package com.example.datong.message;

public enum ResultCode {
    SUCCESS(1,"成功"),
    ERROE(0,"错误"),
    USER_NOT_EXIST(1001,"用户不存在"),
    PASSWORD_ERROR(1002,"密码错误");

    private Integer code;
    private String message;

    private ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
