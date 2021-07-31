import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/customer")
    public String getName(){
      return "Hello";
    }
}
