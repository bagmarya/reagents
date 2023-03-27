package com.chemical.reagents.controller;

import com.chemical.reagents.entity.Chemist;
import com.chemical.reagents.service.ChemistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {

  @Autowired
  private ChemistService chemistService;

  @GetMapping("/chemist/{chemistId:\\d+}")
  public Chemist getChemistById(@PathVariable("chemistId") int id) {
    return chemistService.getChemistById(id);
  }

}
