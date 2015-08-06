package head1.module1.lesson4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Petrenko on 06.08.2015.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "WELCOME TO THE HOME PAGE";
    }
}
