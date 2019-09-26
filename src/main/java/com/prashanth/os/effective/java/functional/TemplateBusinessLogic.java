package com.prashanth.os.effective.java.functional;

public abstract class TemplateBusinessLogic {
  
  public void compute () {
    System.out.println("a");
    System.out.println("b");
    doSomething();
    System.out.println("x");
    System.out.println("y");
  }

  protected abstract void doSomething();
}
