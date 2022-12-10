package com.example.hibernatevalidatorpractice.validator;

import com.example.hibernatevalidatorpractice.annotation.Latitude;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LatitudeValidator implements ConstraintValidator<Latitude, Long> {

    @Override
    public void initialize(Latitude constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {

        return false;
    }
}
