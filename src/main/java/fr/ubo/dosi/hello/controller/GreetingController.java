package fr.ubo.dosi.hello.controller;

import fr.ubo.dosi.hello.bean.Greeting;
import fr.ubo.dosi.hello.business.GreetingBusiness;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import javax.inject.Inject;
@RestController
public class GreetingController {


    private final GreetingBusiness business;
    Logger logger = LogManager.getLogger(GreetingController.class);

    @Inject
    public GreetingController(GreetingBusiness business) {
        this.business = business;
    }

    @RequestMapping("/greeting")
    public Greeting greeting() {
        logger.info("greeting ... ");
        return business.badGreeting();
    }


    @RequestMapping("/greeting/{name}")
    public Greeting greetingWithName(@PathVariable String name) {
        return business.greeting(name);
    }

    @RequestMapping(value = "/greeting2")
    public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "world") String name) {
        return business.greeting(name);
    }


    @RequestMapping(value = "/greeting3")
    public Greeting greeting3(@RequestParam(value = "name", required = true) String name) {
        return business.greeting(name);
    }

}
