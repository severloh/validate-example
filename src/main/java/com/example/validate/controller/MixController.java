package com.example.validate.controller;

import com.example.validate.domain.vo.Person;
import com.example.validate.domain.vo.Student;
import com.example.validate.validation.validator.PersonValidator;
import com.example.validate.validation.validator.StudentValidator;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by silvester on 2017/9/8.
 */
@RestController
@RequestMapping("mix")
public class MixController {
    @InitBinder("person")
    public void initPersonBinder(DataBinder binder){
        binder.setValidator(new PersonValidator());
    }
    @InitBinder("student")
    public void initStudentBinder(DataBinder binder){
        binder.setValidator(new StudentValidator());
    }
    @PostMapping("person")
    public String savePerson(@Valid @RequestBody Person person, BindingResult result){
        if (result.hasErrors()){
            return "false";
        }
        return "success";
    }
    @PostMapping("student")
    public String saveStudent(@Valid @RequestBody Student student, BindingResult result){
        if (result.hasErrors()){
            return "false";
        }
        return "success";
    }
}
