package be.dog.d.steven.springdependencyinjectionbp.controllers.bp;

import be.dog.d.steven.springdependencyinjectionbp.services.bp.BpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class BpFinalConstructorController {
    private final BpService bpService;

    public String saySomething(){
        return bpService.getHello();
    }
}
