package com.sgt.mediumoverflow.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
// @Controller is used in string MVC.(to return the view)
@RestController // To make a bean and map a request (mapping with the URL)
@RequestMapping("/api")
public class Test {
    @GetMapping("/test")
    public Map<String,Integer> testFunc(){
        Map<String,Integer> map = new HashMap<>();
        map.put("hello",1);
        map.put("heyy",2);
        map.put("hiiii",3);
        return map;
    }
    @GetMapping("/testtwo")
    public Map<String,Integer> testFunc2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("seconndddd",1);
        map.put("heyy",2);
        map.put("hiiii",3);
        return map;
    }
}
