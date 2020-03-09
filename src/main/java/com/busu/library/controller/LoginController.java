package com.busu.library.controller;

import com.busu.library.model.Message;
import com.busu.library.model.UserEntity;
import com.busu.library.service.MyUserService;
import com.busu.library.util.ProjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by BUSRAMUMCU on 24.05.2019.
 */
@Controller
public class LoginController {

    @Autowired
    private MyUserService myUserService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView handleRequestLogin() {
        ModelAndView modelAndView = ProjectUtils.getModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public ModelAndView handleResponseLogin(@Valid Message message) {
        ModelAndView modelAndView = ProjectUtils.getModelAndView("messageView");
        modelAndView.addObject("messageObject", message);
        return modelAndView;
    }

}