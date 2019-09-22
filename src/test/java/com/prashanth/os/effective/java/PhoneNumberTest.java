package com.prashanth.os.effective.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PhoneNumberTest {

  @Test
  void testReflexive() { // Test Object equals to itself
    final PhoneNumber phoneNumber = PhoneNumber.of(123, 1234);
    assertTrue(phoneNumber.equals(phoneNumber));
  }

  @Test
  void testSymmetrical() {
    final PhoneNumber x = PhoneNumber.of(123, 1234);
    final PhoneNumber y = PhoneNumber.of(123, 1234);
    assertTrue(x.equals(y));
    assertTrue(y.equals(x));
  }

  @Test
  void testTransitive() {
    final PhoneNumber x = PhoneNumber.of(123, 1234);
    final PhoneNumber y = PhoneNumber.of(123, 1234);
    final PhoneNumber z = PhoneNumber.of(123, 1234);
    assertTrue(x.equals(y));
    assertTrue(y.equals(z));
    assertTrue(x.equals(z));
  }

  @Test
  void testConsistent() {
    final PhoneNumber x = PhoneNumber.of(123, 1234);
    final PhoneNumber y = PhoneNumber.of(123, 1234);
    assertTrue(x.equals(y));
    assertTrue(x.equals(y));
    assertTrue(x.equals(y));
  }

  @Test
  void testNonNullity() {
    final PhoneNumber x = PhoneNumber.of(123, 1234);
    assertFalse(x.equals(null));
  }
}