package be.dog.d.steven.springdependencyinjectionbp.services.bp;

import org.springframework.stereotype.Service;

@Service
public class BpServiceImpl implements BpService{

    @Override
    public String getHello() {
        return "The 'best practice' hello!";
    }
}
