package com.example.RandomDataGenerator.service;

import java.io.InputStream;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;

@Service
public class GenerateDataService {
  private List<String> firstNames;
  private List<String> lastNames;
  private Random random = new Random();

  @PostConstruct
  public void generateNames() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    InputStream firstStream = getClass().getResourceAsStream("/first-names.json");
    InputStream lastStream = getClass().getResourceAsStream("/names.json");

    firstNames = mapper.readValue(firstStream, new TypeReference<List<String>>() {
    });
    lastNames = mapper.readValue(lastStream, new TypeReference<List<String>>() {
    });

    //test
    System.out.println("First Name size:");
    System.out.println(firstNames.size());
    System.out.println("Last Name size:");
    System.out.println(lastNames.size());
  }

  public String generateRandomFullName() {
    String firstName = firstNames.get(random.nextInt(firstNames.size()));
    String lastName = lastNames.get(random.nextInt(lastNames.size()));

    return firstName + " " + lastName;
  }

  //testing
  public static void main(String[] args) throws Exception {
    GenerateDataService service = new GenerateDataService();
    service.generateNames();
    System.out.println(service.generateRandomFullName());
    System.out.println(service.generateRandomFullName());
  }
}
