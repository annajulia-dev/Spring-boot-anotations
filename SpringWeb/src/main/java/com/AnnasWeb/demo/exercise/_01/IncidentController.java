package com.AnnasWeb.demo.exercise._01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncidentController {
    private IncidentService incidentService;

    @Autowired
    public IncidentController(IncidentService incidentService){
        this.incidentService = incidentService;
    }

    @GetMapping("/report")
    public String getIncident(Model page){
        page.addAttribute("incidents", incidentService.findAll());
        return "incident.html";
    }

    @PostMapping("/report")
    public String postIncident(Incident incident,
                              Model page){
        incidentService.addIncident(incident);
        page.addAttribute("incidents", incidentService.findAll());
        return "incident.html";
    }
}
