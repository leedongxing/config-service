/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: TestMessageController.java project: test-msg-master
 * @creator: lidongxing
 * @date: 2017/11/9
 */

package com.ldx.msg.webapp.ctroller;

import com.ldx.msg.webservice.SingleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-11-09 18:10
 * @lastdate:
 */

@Controller
@RequestMapping(value = "/")
public class WelcomeController {
    @Autowired
    private SingleMessage singleMessage;

    @RequestMapping(value = "index")
    @ResponseBody
    public String nativeIndex(HttpServletRequest request, HttpServletResponse response) {
        return singleMessage.getAppName();
    }

}
