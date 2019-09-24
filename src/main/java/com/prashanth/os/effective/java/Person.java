package com.prashanth.os.effective.java;

import static com.google.common.base.Preconditions.checkState;

import com.google.common.base.MoreObjects;

public class Person {

  private final String name;
  private final String surname;

  private String title;
  private String prefix;

  private Person(String name, String surname, String title,
      String prefix) {
    this.name = name;
    this.surname = surname;
    this.title = title;
    this.prefix = prefix;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("Prefix", prefix)
        .add("Title", title)
        .add("Name", name)
        .add("Surname", surname).toString();
  }

  public static class Builder {

    private final String name;
    private final String surname;

    private String title;
    private String prefix;

    private Builder(String name, String surname) {
      this.name = name;
      this.surname = surname;
    }

    public static Builder of(String name, String surname) {
      return new Builder(name, surname);
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    public Person build() {
      checkState(title != null && prefix != null);
      return new Person(title, name, surname, prefix);
    }


  }
}
