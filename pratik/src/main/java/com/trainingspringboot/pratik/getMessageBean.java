package com.trainingspringboot.pratik;

public class getMessageBean {
    private String message;

    public getMessageBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }
    @Override
    public String toString() {
        return "getMessageBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
