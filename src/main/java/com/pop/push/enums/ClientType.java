package com.pop.push.enums;

/**
 * Created by xugang on 16/10/18.
 */
public enum ClientType {
    android(1),ios(2);
    private int type;
    ClientType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
