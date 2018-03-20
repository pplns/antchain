package com.antchain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * Author : Neal
 * Date : 2018/3/21
 * Email : Loong@pplns.com
 *
 */
@Controller
public class MaterController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "home";
    }
}
