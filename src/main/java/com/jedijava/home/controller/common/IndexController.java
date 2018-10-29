package com.jedijava.home.controller.common;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liukaiyang
 * @date 2018/10/29 16:02
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"/", "index"})
    public String index() {
        return "index.html";
    }

    /**
     * http://localhost:8080/test?format=html
     * @return
     */
    @RequestMapping(value = "test", produces = MediaType.TEXT_HTML_VALUE)
    public String test() {
        return "index.html";
    }

    /**
     * http://localhost:8080/test?format=json
     * @return
     */
    @RequestMapping(value = "test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String testJson() {
        return "{\"hello\":\"world\"}";
    }


}
