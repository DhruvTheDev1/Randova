package com.example.RandomDataGenerator.model;

public class RandomData {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String password;

  public RandomData() {
  }

  public RandomData(String firstName, String lastName, String phoneNumber, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.password = password;
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

  @Override
  public String toString() {
    return this.firstName + " " + this.lastName + " " + this.phoneNumber + " " + this.password;
  }

}
