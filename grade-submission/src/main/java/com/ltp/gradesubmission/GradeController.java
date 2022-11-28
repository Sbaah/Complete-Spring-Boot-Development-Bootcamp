package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ltp.gradesubmission.Grade;

@Controller
public class GradeController {

    List<Grade> studentGrades =  Arrays.asList(
    new Grade ("Harry","Postions","C-" ),
    new Grade ("Hermione","Artihmancy","A+"),
    new Grade ("Neville","Chatms","A-" )
    );

    // @GetMapping("/")
    // public String home(){
    //     return "shows";
    // }

    @GetMapping("/")
    public String gradeForm(Model model){
        model.addAttribute("garde", new Grade());
        return "form";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }


   
}
