package com.example.validate.controller;

import com.example.validate.domain.vo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by silvester on 2017/9/8.
 */
@RestController
@RequestMapping("user")
public class UserController {
    public final static Log log = LogFactory.getLog(UserController.class);

    @PostMapping
    public String saveUser(@Valid @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            List<FieldError> list = result.getFieldErrors();
            for (FieldError error : list) {
                log.error(String.format("%s---%s---%s", error.getObjectName(), error.getField(), error.getDefaultMessage()));
            }
            return "error";
        }
        return "success";
    }
}
