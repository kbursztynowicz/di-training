package kb.springlesson.didemo.controllers;

import kb.springlesson.didemo.services.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    @Autowired
    private GeneralService generalService;

    public void getCaption() {
        generalService.sayMyName();
    }
}
