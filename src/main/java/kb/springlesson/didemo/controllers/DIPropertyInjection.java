package kb.springlesson.didemo.controllers;

import kb.springlesson.didemo.services.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DIPropertyInjection {

    @Autowired
    @Qualifier("propertyService")
    private GeneralService generalService;

    public void dddd(){
        generalService.sayMyName();
    }
}
