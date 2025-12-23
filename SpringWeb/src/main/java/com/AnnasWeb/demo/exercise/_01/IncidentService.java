package com.AnnasWeb.demo.exercise._01;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IncidentService {

    private List<Incident> incidentList = new ArrayList<>();

    public List<Incident> findAll(){
        return incidentList;
    }

    public void addIncident(Incident incident){
        incidentList.add(incident);
    }
}
