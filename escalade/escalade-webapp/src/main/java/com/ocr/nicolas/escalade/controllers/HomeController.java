package com.ocr.nicolas.escalade.controllers;

import com.ocr.nicolas.escalade.business.contract.SiteManager;
import com.ocr.nicolas.escalade.model.bean.Site;
import com.ocr.nicolas.escalade.model.bean.Utilisateur;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.inject.Inject;
import javax.validation.Valid;

@Controller
public class HomeController {

    @Inject
    private SiteManager siteManager;

    static final Log logger = LogFactory.getLog(HomeController.class);


    /**
     * Redirection index.jsp to home.jsp
     * @param model model
     * @return home.jsp
     */
    @RequestMapping(value="/home", method = RequestMethod.GET )
    public String home(Model model, @SessionAttribute(value = "Utilisateur", required = false) Utilisateur utilisateur) {
        //Model for display all site on home.jsp
        model.addAttribute("site", siteManager.getListAllSite());

        // model for "log"
        if (utilisateur != null) {
            model.addAttribute("log", utilisateur.getEmail());
        }
        return "home";
    }

    /**
     * Redirection index.jsp to home.jsp
     * @param model model
     * @return home.jsp
     */
    @RequestMapping(value="/home", method = RequestMethod.POST)
    public String homePost(@Valid Site site, BindingResult bindingResult, Model model, @SessionAttribute(value = "Utilisateur", required = false) Utilisateur utilisateur) {

        // model for "log"
        if (utilisateur != null) {
            model.addAttribute("log", utilisateur.getEmail());
        }

        //method for display climbing site with filter -> to check !!!
        model.addAttribute("site", siteManager.getListSiteWithFilter(site.getLocalisationPays(), site.getLocalisationDepartement(), site.getNombreDeSecteur(), site.getNomSite()));


        return "home";
    }

}
