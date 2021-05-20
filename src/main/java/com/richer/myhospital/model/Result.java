package com.richer.myhospital.model;

import java.util.Map;

public class Result {

    private int status;
    private String message;
    private Object Data;

    public Result(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        Data = data;
    }

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
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
