package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("/test")
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        System.out.println("in homeController");
        return "index";
    }

//    @RequestMapping("/home")
//    public String home(Model m) {
//      m.addAttribute("trdy","yrd");
//      return "home";
//    }

}
