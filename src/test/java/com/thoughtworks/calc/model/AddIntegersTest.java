package com.thoughtworks.calc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddIntegersTest {
  @Test
  public void shouldSumTwoIntegers() {
    String exp = "1+2";

    double result = new AddIntegers().calculate(exp);

    assertEquals(3, result);
  }

  @Test
  public void shouldSumMultipleIntegers() {
    String exp = "1+2+7+8+14";

    double result = new AddIntegers().calculate(exp);

    assertEquals(32,result);
  }

  @Test
  public void shouldThrowIfItCannotSum() {
    String exp = "1-4";

    var sut = new AddIntegers();

    assertThrows(
        UnsupportedOperationException.class,
        () -> sut.calculate(exp));
  }
}
