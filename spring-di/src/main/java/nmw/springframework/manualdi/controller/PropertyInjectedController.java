package nmw.springframework.manualdi.controller;

import nmw.springframework.manualdi.service.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreetings();
    }
}
