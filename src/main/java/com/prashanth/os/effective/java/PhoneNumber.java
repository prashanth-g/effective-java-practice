package com.prashanth.os.effective.java;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.Objects;

public class PhoneNumber {

  private static final PhoneNumber COMMON = new PhoneNumber(123, 1234);
  private final int areaCode;

  private final int number;

  private PhoneNumber(int areaCode, int number) {
    this.areaCode = areaCode;
    this.number = number;
  }

  public static PhoneNumber of(int areaCode, int number) {
    checkArgument(areaCode > 100);
    checkArgument(number > 1000);
    if(areaCode == 123 && number == 1234) {
      return COMMON;
    }
    return new PhoneNumber(areaCode, number);
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PhoneNumber) {
      PhoneNumber other = (PhoneNumber) object;
      return this.number == other.number && this.areaCode == other.areaCode;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, number);
  }
}
