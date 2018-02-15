package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/{name}")
    public String index(@PathVariable String name) {
        return "Greetings from Spring Boot mister "+ name + "!";
    }
    
}
