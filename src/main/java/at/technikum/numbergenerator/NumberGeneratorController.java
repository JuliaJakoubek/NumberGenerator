package at.technikum.numbergenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class NumberGeneratorController {
    NumberGenerator gen = new NumberGenerator();


    @GetMapping("/api")
    public int random(){
        return gen.random();
    }

}
