package com.example.RandomDataGenerator.model;

public class RandomData {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String password;
  private String email;
  private String country;

  public RandomData() {
  }

  public RandomData(String firstName, String lastName, String phoneNumber, String password, String email, String country) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.password = password;
    this.email = email;
    this.country = country;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return this.firstName + " " + this.lastName + " " + this.phoneNumber + " " + this.password + " " + this.email + " " + this.country;
  }

}
