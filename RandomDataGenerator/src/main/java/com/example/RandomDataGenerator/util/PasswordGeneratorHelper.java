package com.example.RandomDataGenerator.util;
// provides a cryptographically strong random number generator
import java.security.SecureRandom;

public class PasswordGeneratorHelper {
  private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXZY";
  private static final String LOWER = UPPER.toLowerCase();
  private static final String DIGITS = "0123456789";
  private static final String SPECIAL_CHARS = "!@#$%^&*()_+{}[]";

  private static final String PASSWORD_ALLOWED = UPPER + LOWER + DIGITS + SPECIAL_CHARS;

  private static SecureRandom secureRandom = new SecureRandom();

  public static String generatePassword(int length) {
    StringBuilder password = new StringBuilder(length);
    // first 4 characters upper, lower, digit, special character
    password.append(UPPER.charAt(secureRandom.nextInt(UPPER.length())));
    password.append(LOWER.charAt(secureRandom.nextInt(LOWER.length())));
    password.append(DIGITS.charAt(secureRandom.nextInt(DIGITS.length())));
    password.append(SPECIAL_CHARS.charAt(secureRandom.nextInt(DIGITS.length())));
    // remaining filled randomly from PASSWORD_ALLOWED
    for(int i = 4; i < length; i++) {
     password.append(PASSWORD_ALLOWED.charAt(secureRandom.nextInt(PASSWORD_ALLOWED.length())));
    }

    // method to shuffle the entire password
    String shufflePassword = shufflePassword(password.toString());
    return shufflePassword;
  }

  private static String shufflePassword(String password) {
    char[] charArray = password.toCharArray();
    for(int i = 0; i < charArray.length; i++) {
      int randomIndex = secureRandom.nextInt(charArray.length);
      char temp = charArray[i];
      charArray[i] = charArray[randomIndex];
      charArray[randomIndex] = temp;
    }
    return new String(charArray);
  }

}
