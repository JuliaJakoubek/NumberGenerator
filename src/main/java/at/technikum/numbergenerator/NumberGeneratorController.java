package at.technikum.numbergenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class NumberGeneratorController {
    Random rand = new Random();
    int upperbound = 100;
    int int_random = rand.nextInt(upperbound);

    @GetMapping("/api")
    public int random(){
        return int_random;
    }

}
