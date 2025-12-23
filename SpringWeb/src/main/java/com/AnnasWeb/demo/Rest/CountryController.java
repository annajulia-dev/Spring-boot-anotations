package com.AnnasWeb.demo.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/country")
    public List<Country> getCountry(){
        List<Country> countries = new ArrayList<>();
        countries.add(Country.of("Japan", 1));
        countries.add(Country.of("Brazil", 3));

        return countries;
    }

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        var c = Country.of("France", 98);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital","Paris")
                .header("favorite_food","cheese and wine")
                .body(c);
    }
}
