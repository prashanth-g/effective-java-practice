package com.prashanth.os.effective.java;

import java.util.function.IntBinaryOperator;

public enum Operation {
  ADD((x, y) -> x + y),
  SUBTRACT((x, y) -> x - y),
  MULTIPLY((x, y) -> x * y),
  DIVIDE((x, y) -> x / y);

  private final IntBinaryOperator operator;

  Operation(IntBinaryOperator operator) {
    this.operator = operator;
  }
}
