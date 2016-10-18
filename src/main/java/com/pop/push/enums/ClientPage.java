package com.pop.push.enums;

/**
 * Created by xugang on 16/10/18.
 */
public enum ClientPage {
    MyMessage(1),//新评论
    MyNote(2);//新纸条

    int type;

    ClientPage(int type) {
        this.type = type;
    }
}
