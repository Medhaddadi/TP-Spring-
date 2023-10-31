
package fr.ubo.dosi.hello.business;


import fr.ubo.dosi.hello.bean.Greeting;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

public class GreetingBusiness {
    Logger logger = Logger.getLogger(GreetingBusiness.class.getName());
    public GreetingBusiness() {
        logger.info("GreetingBusiness ... ");
    }

    public Greeting greeting(String name) {
        return new Greeting(name, "Hello " + name+" !");
    }

    public Greeting badGreeting() {
        return new Greeting("inconu","name est obligatoire . Merci de renseigner ce champ");
    }

}

