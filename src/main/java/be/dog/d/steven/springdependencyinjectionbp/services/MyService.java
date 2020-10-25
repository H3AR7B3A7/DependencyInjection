package be.dog.d.steven.springdependencyinjectionbp.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getHello() {
        return "Hello";
    }
}
