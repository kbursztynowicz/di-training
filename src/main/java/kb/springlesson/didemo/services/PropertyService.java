package kb.springlesson.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyService implements GeneralService {

    @Override
    public void sayMyName() {
        System.out.println("called property service");
    }
}
