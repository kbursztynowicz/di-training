package kb.springlesson.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GeneralService {

    @Override
    public void sayMyName() {
        System.out.println("called constructor service");
    }
}
