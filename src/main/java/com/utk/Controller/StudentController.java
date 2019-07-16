package com.utk.Controller;

import com.utk.Entity.Student;
import com.utk.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired                              //Automatically instantiate
    private StudentService StudentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents()
    {
        return StudentService.getAllStudents();
    }
}
