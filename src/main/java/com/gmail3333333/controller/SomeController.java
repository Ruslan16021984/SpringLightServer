package com.gmail3333333.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/some")
public class SomeController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getSome(ModelMap modelMap){
        return "My Some";
    }
}
