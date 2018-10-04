package kb.springlesson.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements GeneralService {

    @Override
    public void sayMyName() {
        System.out.println("called setter service");
    }
}
