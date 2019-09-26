package com.prashanth.os.effective.java.functional;

import java.util.Objects;
import java.util.function.IntUnaryOperator;

public class StrategyBusinessLogic {

  private final IntUnaryOperator intUnaryOperator;

  private StrategyBusinessLogic(
      IntUnaryOperator intUnaryOperator) {
    this.intUnaryOperator = intUnaryOperator;
  }

  public static StrategyBusinessLogic of(
      IntUnaryOperator intUnaryOperator) {
    Objects.requireNonNull(intUnaryOperator);
    return new StrategyBusinessLogic(intUnaryOperator);
  }

  public void compute () {
    System.out.println("a");
    System.out.println("b");
    intUnaryOperator.applyAsInt(10);
    System.out.println("x");
    System.out.println("y");
  }
}
