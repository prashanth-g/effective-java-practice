package com.prashanth.os.functional;

public class PhoneNumbers {

  private final int areaCode;

  private final int number;

  private PhoneNumbers(int areaCode, int number) {
    this.areaCode = areaCode;
    this.number = number;
  }

  public static PhoneNumbers of(int areaCode, int number) {
    return new PhoneNumbers(areaCode, number);
  }
}
