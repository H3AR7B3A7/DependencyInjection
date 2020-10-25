package be.dog.d.steven.springdependencyinjectionbp.controllers;

import be.dog.d.steven.springdependencyinjectionbp.services.MyService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    private MyService myService;

    public ConstructorController(MyService myService){
        this.myService = myService;
    }

    public String saySomething(){
        return myService.getHello();
    }
}
