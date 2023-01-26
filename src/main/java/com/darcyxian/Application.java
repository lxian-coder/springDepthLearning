package com.darcyxian;

import com.darcyxian.config.ApplicationConfig;
import com.darcyxian.service.GreetingService;
import com.darcyxian.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        OutputService outputService = context.getBean(OutputService.class);

        for(int i=0; i<5; i++){
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }

}
