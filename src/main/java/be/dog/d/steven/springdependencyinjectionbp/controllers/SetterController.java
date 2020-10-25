package be.dog.d.steven.springdependencyinjectionbp.controllers;

import be.dog.d.steven.springdependencyinjectionbp.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {
    private MyService myService;

    @Autowired
    public void setMyService(MyService myService){
        this.myService = myService;
    }

    public String saySomething(){
        return myService.getHello();
    }
}
