package com.ocr.nicolas.escalade.controllers;

import com.ocr.nicolas.escalade.model.bean.BCryptPasswordEncoder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.inject.Inject;


@Controller
@SessionAttributes("Utilisateur")
public class NewUserController {

    static final Log logger = LogFactory.getLog(NewUserController.class);

    @Inject
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value="/newUser", method = RequestMethod.GET)
    public String newUser(Model model) {

        return"/newUser";
    }
}
