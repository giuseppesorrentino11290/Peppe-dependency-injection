package Giuseppe.Sorrentino.Peppedependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("Il costruttore MyComponent è stato chiamato");
        this.myComponentName = "Giuseppe Sorrentino";
    }

    public String getMyComponentName(){

        return myComponentName;
    }

}
