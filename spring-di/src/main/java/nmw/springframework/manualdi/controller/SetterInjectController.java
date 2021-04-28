package nmw.springframework.manualdi.controller;

import nmw.springframework.manualdi.service.GreetingService;

public class SetterInjectController {

    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreetings();
    }
}
