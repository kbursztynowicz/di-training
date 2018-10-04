package kb.springlesson.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryService implements GeneralService {

    @Override
    public void sayMyName() {
        System.out.println("I am the primary service.");
    }
}
