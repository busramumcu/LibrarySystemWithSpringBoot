package com.busu.library.controller;

import com.busu.library.model.BooksEntity;
import com.busu.library.service.MyUserService;
import com.busu.library.util.ProjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by BUSRAMUMCU on 29.05.2019.
 */
@Controller
public class HomeController {

    @Autowired
    private MyUserService myUserService;

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView handleRequestRegister() {
        ModelAndView modelAndView = ProjectUtils.getModelAndView("home");
        List<BooksEntity> booksEntities = myUserService.getAllBook();
        modelAndView.addObject("booksList", booksEntities);
        return modelAndView;
    }

}

