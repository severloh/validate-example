package com.example.validate.controller;

import com.example.validate.domain.vo.Person;
import com.example.validate.validation.validator.PersonValidator;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by silvester on 2017/9/8.
 */
@RestController
@RequestMapping("person")
public class PersonController {
    @InitBinder
    public void initBinder(DataBinder binder){
        binder.setValidator(new PersonValidator());
    }
    @PostMapping
    public String savePerson(@Valid @RequestBody Person person, BindingResult result){
        if (result.hasErrors()){
            return "false";
        }
        return "success";
    }
}
