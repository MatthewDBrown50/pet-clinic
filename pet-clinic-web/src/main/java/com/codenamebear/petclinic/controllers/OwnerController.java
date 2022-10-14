package com.codenamebear.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/******************************************
 Created on 10/14/2022 by Matthew D Brown
 *******************************************/

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
