package jalil.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @GetMapping("/docker")
    public String docker(){
        return "HEY DOCKER!!!";
    }
}
