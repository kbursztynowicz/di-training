package kb.springlesson.didemo.controllers;

import kb.springlesson.didemo.services.GeneralService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DIConstructorInjection {

    private GeneralService service;

    public DIConstructorInjection(@Qualifier("constructorService") GeneralService service) {
        this.service = service;
    }

    public void dadada(){
        service.sayMyName();
    }
}
