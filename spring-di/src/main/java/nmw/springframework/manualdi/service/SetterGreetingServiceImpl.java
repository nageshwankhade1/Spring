package nmw.springframework.manualdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
            return  "HelloWorld-Setter";
    }
}
