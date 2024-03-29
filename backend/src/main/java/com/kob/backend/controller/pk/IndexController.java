package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")             //localhost:8080/pk
public class IndexController {
    @RequestMapping("index/")       //localhost:8080/pk/index/
    public String index() {
        return "pk/index.html";
    }
}
