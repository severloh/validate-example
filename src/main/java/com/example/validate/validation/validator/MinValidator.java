package com.example.validate.validation.validator;

import com.example.validate.validation.annotation.Min;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by silvester on 2017/9/8.
 */
public class MinValidator implements ConstraintValidator<Min,Integer> {
    private int minValue;
    @Override
    public void initialize(Min min) {
        minValue = min.value();

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value >= minValue;
    }
}
