package fr.ubo.dosi.hello.business;

import fr.ubo.dosi.hello.bean.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;



class GreetingBusinessTest {

    @Inject
    GreetingBusiness business;
    @Test
    void greeting() {
        Greeting greeting = business.greeting("toto");
        assertEquals("Hello toto !", greeting.getMessage());
    }


    @Test
    void badGreeting() {
        Greeting greeting = business.badGreeting();
        assertEquals("name est obligatoire . Merci de renseigner ce champ", greeting.getMessage());
    }

}