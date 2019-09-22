package com.prashanth.os.effective.java;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.MoreObjects;
import java.util.Comparator;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

public class PhoneNumber implements Formattable, Comparable<PhoneNumber> { // Formattable

  private static final PhoneNumber COMMON = new PhoneNumber(123, 1234);
  private static final Comparator<PhoneNumber> COMPARATOR = Comparator
      .comparingInt((PhoneNumber p) -> p.areaCode)
      .thenComparingInt(p -> p.number);

  private final int areaCode;
  private final int number;

  private PhoneNumber(int areaCode, int number) {
    this.areaCode = areaCode;
    this.number = number;
  }

  public static PhoneNumber of(int areaCode, int number) {
    checkArgument(areaCode > 100);
    checkArgument(number > 1000);
    if (areaCode == 123 && number == 1234) {
      return COMMON;
    }
    return new PhoneNumber(areaCode, number);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true; // Check Reflex
    }
    if (object instanceof PhoneNumber) {
      PhoneNumber other = (PhoneNumber) object;
      return this.number == other.number && this.areaCode == other.areaCode;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, number);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("areaCode", areaCode)
        .add("number", number)
        .toString();
  }

  @Override
  public void formatTo(Formatter formatter, int flags, int width,
      int precision) {
      formatter.format("%d-%d", areaCode, number);
  }

  @Override
  public int compareTo(PhoneNumber o) {
    return COMPARATOR.compare(this, o);
  }
}
