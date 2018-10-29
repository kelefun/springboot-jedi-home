package com.jedijava.home.controller.common;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;

/**
 * @author liukaiyang
 * @date 2018/10/29 17:20
 */
public class JediErrorController extends BasicErrorController {
    public JediErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
        super(errorAttributes, errorProperties );
        System.out.println("");
    }
}
