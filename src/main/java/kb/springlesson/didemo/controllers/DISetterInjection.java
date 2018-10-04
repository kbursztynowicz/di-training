package kb.springlesson.didemo.controllers;

import kb.springlesson.didemo.services.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DISetterInjection {

    private GeneralService service;

    @Autowired
    @Qualifier("setterService")
    public void setService(GeneralService service) {
        this.service = service;
    }

    public void adda(){
        service.sayMyName();
    }
}
