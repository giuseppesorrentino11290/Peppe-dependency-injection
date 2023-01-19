package Giuseppe.Sorrentino.Peppedependencyinjection.controllers;

import Giuseppe.Sorrentino.Peppedependencyinjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }



    @GetMapping("/getName")
    public String getName(){

        return myService.getName();
    }
    @GetMapping
    public String helloMsg(){
        return "welcome message";
    }

}
