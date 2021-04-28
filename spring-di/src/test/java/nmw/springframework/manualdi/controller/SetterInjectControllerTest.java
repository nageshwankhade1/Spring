package nmw.springframework.manualdi.controller;

import nmw.springframework.manualdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectControllerTest {

    SetterInjectController setterInjectController;

    @BeforeEach
    void setUp() {
        setterInjectController = new SetterInjectController();
        setterInjectController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectController.getGreeting());
    }
}