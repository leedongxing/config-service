/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: BasicService.java project: config-service
 * @creator: lidongxing
 * @date: 2017/12/19
 */

package com.ldx.msg.webservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-19 11:50
 * @lastdate:
 */

@Component
public class SingleMessage {
    @Value("${spring.application.name}")
    private String appName;

    public String getAppName(){
        return appName;
    }
}
