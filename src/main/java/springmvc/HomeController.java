package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping (value = "/home",method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("I am here");
        return "home";
    }

    @RequestMapping (value = "/fetchStudent")
    public String fetchStudentRecords(){
        System.out.println("I am fetching");
        return "viewStudent";
    }

    @RequestMapping (value = "/update")
    public String update(){
        System.out.println("I am there");
        return "updateUI";
    }

    @RequestMapping (value = "/search")
    public String search(){
        System.out.println("I am there");
        return "searchUI";
    }

    @RequestMapping (value = "/delete")
    public String delete(){
        System.out.println("I am there");
        return "deleteUI";
    }

//    @RequestMapping (value = "/add")
//    public String addStudent(@ModelAttribute("student") Student2 student , Model model){
//        System.out.println(student.getName());
//        this.studentService.createStudent(student);
//        return "home";
//    }

}
