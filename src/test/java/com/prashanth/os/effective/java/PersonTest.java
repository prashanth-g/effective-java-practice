package com.prashanth.os.effective.java;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prashanth.os.effective.java.Person.Builder;
import org.junit.jupiter.api.Test;

class PersonTest {

  @Test
  void testPersonBuilderNonNullity() {
    final Person person = Builder.of("Mari", "Ke").title("Miss")
        .prefix("Engineer")
        .build();
    assertTrue(person.toString().contains("Engineer"));
  }
}