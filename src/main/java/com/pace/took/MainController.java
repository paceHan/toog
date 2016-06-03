package com.pace.took;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Naver on 2016-06-03.
 */
@Controller
@RequestMapping(value = "/")
public class MainController {
    @RequestMapping(value = "/index.toog")
    public String index() {
        return "index";
    }
}
