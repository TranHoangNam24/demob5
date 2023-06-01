package com.example.demob5.Validator;

import com.example.demob5.Validator.annotation.ValidUserId;
import com.example.demob5.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if (user == null)
            return true;
        return user.getId()!= null;
    }
}
