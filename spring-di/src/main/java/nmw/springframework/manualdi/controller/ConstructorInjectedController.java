package nmw.springframework.manualdi.controller;

import nmw.springframework.manualdi.service.GreetingService;

public class ConstructorInjectedController {

    GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreetings();
    }
}
