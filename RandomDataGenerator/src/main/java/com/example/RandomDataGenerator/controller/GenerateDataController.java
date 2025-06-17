package com.example.RandomDataGenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.RandomDataGenerator.model.RandomData;
import com.example.RandomDataGenerator.service.GenerateDataService;

@Controller
public class GenerateDataController {
  @Autowired
  private GenerateDataService generateDataService;

  @GetMapping("/generated-random-data")
  public String generateRandomData(Model model) {
    RandomData randomData = generateDataService.generateData();
    model.addAttribute("randomData", randomData);
    return "index";
  }
}
