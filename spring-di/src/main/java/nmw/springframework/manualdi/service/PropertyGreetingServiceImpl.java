package nmw.springframework.manualdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
            return  "HelloWorld-Property";
    }
}
