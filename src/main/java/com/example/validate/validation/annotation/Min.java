package com.example.validate.validation.annotation;

import com.example.validate.validation.validator.MinValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by silvester on 2017/9/8.
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MinValidator.class)
public @interface Min {
    int value() default 0;
    String message();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
