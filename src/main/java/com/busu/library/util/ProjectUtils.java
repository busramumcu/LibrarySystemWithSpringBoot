package com.busu.library.util;

import org.springframework.web.servlet.ModelAndView;

/**
 * Created by BUSRAMUMCU on 24.05.2019.
 */
public class ProjectUtils {

    public static ModelAndView getModelAndView(String viewName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
