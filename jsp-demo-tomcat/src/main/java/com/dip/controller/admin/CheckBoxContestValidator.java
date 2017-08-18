package com.dip.controller.admin;

import com.dip.entity.Contest;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * Created by Макс on 28.03.2017.
 */
public class CheckBoxContestValidator  implements Validator {
    @Override
    public boolean supports(Class clazz) {
        //just validate the Customer instances
        return Contest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Contest cust = (Contest) target;

        if(cust.getTitle().length()==0){
            errors.rejectValue("favLanguages", "required.favLanguages");
        }
    }
}
