package kb.springlesson.didemo;

import kb.springlesson.didemo.controllers.DIConstructorInjection;
import kb.springlesson.didemo.controllers.DIPropertyInjection;
import kb.springlesson.didemo.controllers.DISetterInjection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        DIConstructorInjection constructorController = (DIConstructorInjection) ctx.getBean("DIConstructorInjection");
        DIPropertyInjection propertyInjection = (DIPropertyInjection) ctx.getBean("DIPropertyInjection");
        DISetterInjection setterInjection = (DISetterInjection) ctx.getBean("DISetterInjection");

        constructorController.dadada();
        propertyInjection.dddd();
        setterInjection.adda();
    }
}
