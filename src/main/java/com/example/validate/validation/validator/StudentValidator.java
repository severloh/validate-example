package com.example.validate.validation.validator;

import com.example.validate.domain.vo.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by silvester on 2017/9/8.
 */
public class StudentValidator implements Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"userName",null,"userName is empty");
        Student student = (Student) target;
        if (null == student.getAddress() || "".equals(student.getAddress())){
            errors.rejectValue("address",null,"address is empty");
        }
    }
}
