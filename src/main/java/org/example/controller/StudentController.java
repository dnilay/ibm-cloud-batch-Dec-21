package org.example.controller;

import org.example.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/showForm")
    public String showForm(Model theModel)
    {
        Student student=new Student();
        theModel.addAttribute("student",student);
        return "show-formv1";
    }
    @PostMapping("/processForm")
public String processForm(@ModelAttribute("student") Student student)
{
    return "process-form";
}

}
