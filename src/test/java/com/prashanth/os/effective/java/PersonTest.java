package com.prashanth.os.effective.java;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest {

  @Test
  void testPersonBuilderNonNullity() {
    final Person person = Person.builder("Mari", "Ke").title("Miss")
        .prefix("Engineer")
        .build();
    assertTrue(person.toString().contains("Engineer"));
  }
}