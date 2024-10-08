package com.intern.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.intern.crud.database.StudentRepo;
import com.intern.crud.model.Students;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class StudentController {

    @Autowired
    StudentRepo repo;

    // To execute index.jsp when application starts
    @RequestMapping("/")
	public String home() {
        return "index";
	}
    
    // To redirect to "newrecord.jsp" to fetch the values
    @GetMapping("/add")
    public String addRedirect() {
        return "newrecord";
    }

    @GetMapping("/update")
    public String updateRedirect() {
        return "updaterecord";
    }

    @GetMapping("/delete")
    public String deleteRedirect() {
        return "deleterecord";
    }
    
    // Calling the repo class directly for fetching all records as no processing need by service class
    @GetMapping("/view")
    public String view(Model model){
        List<Students> students = repo.findAll();
        System.out.println(students);
        model.addAttribute("students", students);
        return "viewall";
    }
    
    // To fetch input from "newrecord.jsp" into the StudentModel object and sending to repo class
    @PostMapping("/submitStudentInfo")
    public String newStudentRecord(@RequestParam("rollNum") int rollNum, @RequestParam("name") String name,@RequestParam("grade") float grade, Model model) {
        
        // we are instantiating the "Students" model to reduce the scope and statefulness
        Students student = new Students();
        student.setRollNum(rollNum);
        student.setName(name);
        student.setGrade(grade);
        System.out.println(student);
        repo.save(student);
        model.addAttribute("message", "1 Student detail is added");
        return "newrecord";
    }
    
    // To fetch input from "updaterecord.jsp" into the StudentModel object and sending to repo class
    // I have removed the '@RequestParam' cuz if the method parameter exactly matches the input names we can omit
    
    @PostMapping("/updateStudent")
    public String updateStudentRecord(int rollNum, String name,float grade, Model model) {
        
        // we are instantiating the "Students" model to reduce the scope and statefulness
        Students student = new Students();
        student.setRollNum(rollNum);
        student.setName(name);
        student.setGrade(grade);
        System.out.println(student);
        repo.update(student);
        model.addAttribute("message", "1 Student detail is updated");
        return "updaterecord";
    }

    @PostMapping("/deleteStudent")
    public String deleteStudentRecord(@RequestParam("rollNum") int rollNum, Model model) {
        repo.delete(rollNum);
        model.addAttribute("message", "1 Student detail is Deleted!");
        return "deleterecord";
    }
    
    }

