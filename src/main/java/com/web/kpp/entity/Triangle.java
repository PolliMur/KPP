package com.web.kpp.entity;

import java.util.Objects;

public class Triangle {
  private int side1;
  private int side2;
  private int side3;

  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Triangle that = (Triangle) other;
    return Integer.compare(that.side1, side1) == 0
        && Integer.compare(that.side2, side2) == 0
        && Integer.compare(that.side3, side3) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(side1, side2, side3);
  }
}
