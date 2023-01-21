package com.sgt.mediumoverflow.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Maths {
    @Autowired //is another annotation that will help in binding to the component.
    // For eg here we put autowired on Addition maths which will bind to class Addition.

    Addition maths;

    public void addaddition(){
        maths.add();
    }

}
