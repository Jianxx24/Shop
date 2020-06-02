package pl.shop.shop.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeKontroler {
@GetMapping("/")
    public String getHomePage(Model model){

    return "index";
}


}
