package com.pop.push.dto;

import java.io.Serializable;

/**
 * Created by xugang on 16/10/18.
 */
public class PushDto implements Serializable{
    private String cid;
    private String Message;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
