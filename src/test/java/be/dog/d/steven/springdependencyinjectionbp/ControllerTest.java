package be.dog.d.steven.springdependencyinjectionbp;

import be.dog.d.steven.springdependencyinjectionbp.controllers.ConstructorController;
import be.dog.d.steven.springdependencyinjectionbp.controllers.FieldController;
import be.dog.d.steven.springdependencyinjectionbp.controllers.PrivateFieldController;
import be.dog.d.steven.springdependencyinjectionbp.controllers.SetterController;
import be.dog.d.steven.springdependencyinjectionbp.controllers.bp.BpFinalConstructorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ControllerTest {

    @Autowired
    FieldController fieldController;

    @Autowired
    PrivateFieldController privateFieldController;

    @Autowired
    SetterController setterController;

    @Autowired
    ConstructorController constructorController;

    @Autowired
    BpFinalConstructorController bpFinalConstructorController;

    @Test
    void testControllers(){
        System.out.println("Field controller says: " + fieldController.saySomething());

        System.out.println("Private field controller says: " + privateFieldController.saySomething());

        System.out.println("Setter controller says: " + setterController.saySomething());

        System.out.println("Constructor controller says: " + constructorController.saySomething());

        System.out.println("Best practice controller says: " + bpFinalConstructorController.saySomething());
    }
}
