package nmw.springframework.manualdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
            return  "Hello - world";
    }
}
