package be.dog.d.steven.springdependencyinjectionbp.controllers;

import be.dog.d.steven.springdependencyinjectionbp.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * BAD PRACTICE, DON'T DO THIS
 */
@Controller
public class FieldController {
    @Autowired
    MyService myService;

    public String saySomething(){
        return myService.getHello();
    }
}
