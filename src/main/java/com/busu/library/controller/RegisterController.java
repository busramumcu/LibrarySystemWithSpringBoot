package com.busu.library.controller;

import com.busu.library.model.Message;
import com.busu.library.model.Register;
import com.busu.library.model.UserEntity;
import com.busu.library.service.MyUserService;
import com.busu.library.util.ProjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by BUSRAMUMCU on 25.05.2019.
 */
@Controller
public class RegisterController {

    @Autowired
    private MyUserService myUserService;

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public ModelAndView handleRequestRegister() {
        ModelAndView modelAndView = ProjectUtils.getModelAndView("register");
        return modelAndView;
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView handleResponseRegister(@Valid Register register) {
        ModelAndView modelAndView = ProjectUtils.getModelAndView("registerSuccess"); /* işlem sonucu yönleneceğim html*/
        myUserService.saveUser(register);
        return modelAndView;
    }




}


