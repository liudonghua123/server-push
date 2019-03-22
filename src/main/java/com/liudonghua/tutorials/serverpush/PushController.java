package com.liudonghua.tutorials.serverpush;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.PushBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PushController {

    @GetMapping(path = "/")
    public String serviceWithoutPush() {
        return "index";
    }

    @GetMapping(path = "/sp")
    public String serviceWithPush(HttpServletRequest request, PushBuilder pushBuilder) {
        System.out.println("pushBuilder is " + pushBuilder);
        if (null != pushBuilder) {
            pushBuilder.path("/scenery.jpg").push();
        }
        return "index";
    }
}
