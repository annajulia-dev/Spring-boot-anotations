package com.AnnasWeb.demo.exercise._01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Scan {

    @GetMapping("scan/{planet}")
    public String getScan(@RequestParam(defaultValue = "1") int zoom,
                          @PathVariable String planet,
                          Model page){
        page.addAttribute("planet", planet);
        page.addAttribute("zoom", zoom);

        if(zoom > 10)
            page.addAttribute("warning", "WARNING: High radiation risk at this magnification!");
        return "scan.html";
    }
}
