package org.example.controller;

import org.example.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/showForm")
    public String showForm()
    {
        return "show-form";
    }
    @PostMapping("/processForm")
public String processForm(@RequestParam("name") String name, @RequestParam("address") String address, Model theModel)
{
    Student student=new Student(name,address);
    theModel.addAttribute("STUDENT",student);

    return "process-form";
}

}
