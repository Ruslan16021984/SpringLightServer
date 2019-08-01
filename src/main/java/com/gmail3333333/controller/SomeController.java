package com.gmail3333333.controller;

import com.gmail3333333.entity.Remind;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/some")
public class SomeController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getSome(){
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("My first remind ");
        return remind;
    }
}
