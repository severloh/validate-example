package com.example.validate.validation.validator;

import com.example.validate.domain.vo.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by silvester on 2017/9/8.
 */
public class PersonValidator implements Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name",null,"name is empty");
        Person person = (Person) target;
        if (null == person.getPassword() || "".equals(person.getPassword())){
            errors.rejectValue("password",null,"password is empty");
        }
    }
}
