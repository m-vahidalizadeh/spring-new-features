package com.gloriousoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.PushBuilder;

//@Controller
//@RequestMapping("push")
public class PushController {

    //    @GetMapping("with")
    public String demoWithPush(PushBuilder pushBuilder) {
        if (null != pushBuilder) {
            pushBuilder.path("/img/spring.jpg").push();
        }
        return "push";
    }

    //    @GetMapping("without")
    public String demoWithoutPush() {
        return "push";
    }

}
