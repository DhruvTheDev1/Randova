package com.example.RandomDataGenerator.controller;

import java.util.ArrayList;
import java.util.List;

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
    List<RandomData> randomData = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      randomData.add(generateDataService.generateData());
    }

    model.addAttribute("randomData", randomData);
    return "randomData";
  }
}
