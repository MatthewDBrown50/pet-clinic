package com.codenamebear.petclinic.controllers;

import com.codenamebear.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/******************************************
 Created on 10/14/2022 by Matthew D Brown
 *******************************************/

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners(Model model){

        // Give the list of owners to the Spring MVC model, so that it can be accessed by Thymeleaf
        model.addAttribute("owners", ownerService.findAll());

        // Return the Thymeleaf template
        return "owners/index";
    }
}
