package com.example.RandomDataGenerator.service;

import java.io.InputStream;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.RandomDataGenerator.model.RandomData;
import com.example.RandomDataGenerator.util.PasswordGeneratorHelper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;

@Service
public class GenerateDataService {
  private List<String> firstNames;
  private List<String> lastNames;
  private List<String> country;
  private Random random = new Random();

  @PostConstruct
  public void init() throws Exception {
    generateNames();
    generateCountry();
  }

  // loads names into list during startup once before the bean is used
  public void generateNames() throws Exception {
    // reads JSON names and converts to objects
    ObjectMapper mapper = new ObjectMapper();

    InputStream firstStream = getClass().getResourceAsStream("/first-names.json");
    InputStream lastStream = getClass().getResourceAsStream("/names.json");

    firstNames = mapper.readValue(firstStream, new TypeReference<List<String>>() {
    });
    lastNames = mapper.readValue(lastStream, new TypeReference<List<String>>() {
    });
  }

  // loads countries into list
  public void generateCountry() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    InputStream countryStream = getClass().getResourceAsStream("/countries.json");

    country = mapper.readValue(countryStream, new TypeReference<List<String>>() {
    });
  }

  public String generateFirstName() {
    return firstNames.get(random.nextInt(firstNames.size()));
  }

  public String generateLastName() {
    return lastNames.get(random.nextInt(lastNames.size()));
  }

  public String generateRandomCountry() {
    return country.get(random.nextInt(country.size()));
  }

  // generate random phone number
  public String generateNumber() {
    StringBuilder sb = new StringBuilder("+44");
    sb.append("7");

    for (int i = 0; i < 9; i++) {
      sb.append(random.nextInt(10));
    }
    return sb.toString();
  }

  // calls static method in PasswordGeneratorHelper class
  // generates password between 8 - 15 length
  public String generatePassword() {
    int passwordLength = random.nextInt(15 - 8 + 1) + 8;
    return PasswordGeneratorHelper.generatePassword(passwordLength);
  }

  // generate emails
  public String generateEmail(String firstName, String lastName) {
    // String firstName = firstNames.get(random.nextInt(firstNames.size()));
    // String lastName = lastNames.get(random.nextInt(lastNames.size()));
    int num = random.nextInt(1000);
    String[] domains = { "gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "icloud.com" };
    String randomDomain = domains[random.nextInt(domains.length)];
    return firstName + "." + lastName + num + "@" + randomDomain;
  }

  // generates single data object
  public RandomData generateData() {
    String firstName = generateFirstName();
    String lastName = generateLastName();
    String phoneNumber = generateNumber();
    String password = generatePassword();
    String email = generateEmail(firstName, lastName);
    String country = generateRandomCountry();
    return new RandomData(firstName, lastName, phoneNumber, password, email, country);
  }
}
