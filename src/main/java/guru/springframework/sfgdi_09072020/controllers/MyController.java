package guru.springframework.sfgdi_09072020.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello! It's your controller speaking");
        return "Hi!";
    }

}
