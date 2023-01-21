package com.sgt.mediumoverflow.demo;


import org.springframework.stereotype.Component;

@Component //  is an annotation that is similar to bean in spring so it will create an object of Addition class.
public class Addition {

    public void add(){
        System.out.println("Addition function called");
    }

}
