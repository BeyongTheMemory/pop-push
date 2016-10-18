package com.pop.push.serviceImpl;

import com.pop.push.enums.ClientType;
import com.pop.push.service.PushService;

/**
 * Created by xugang on 16/10/18.
 */
public class PushServiceImpl implements PushService{

    public void push(String clientId, int clientType) {
        switch (clientType){
            case 1://android
                break;
            case 2://ios
                break;
            default:
                break;
        }
    }
}
