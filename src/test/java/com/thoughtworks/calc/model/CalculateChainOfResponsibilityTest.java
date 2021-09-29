package com.thoughtworks.calc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculateChainOfResponsibilityTest {

  @Test
  public void shouldReturnTheFirstValidResult() {
    final String EXPR = "1 + 2";

    var exprCalcNotWorking = mock(ExpressionCalculator.class);
    var exprCalc = mock(ExpressionCalculator.class);
    var sut = new CalculateChainOfResponsibility(exprCalcNotWorking, exprCalc);
    when(exprCalcNotWorking.calculate(EXPR)).thenThrow(new UnsupportedOperationException());
    when(exprCalc.calculate(EXPR)).thenReturn(3.0);

    var res = sut.calculate(EXPR);

    assertEquals(3.0, res);
    verify(exprCalcNotWorking, times(1)).calculate(EXPR);
    verify(exprCalc, times(1)).calculate(EXPR);
  }

  @Test
  public void shouldThrowUnsupportedOperationIfNoneMatches() {
    final String EXPR = "1 + 2";

    var sut = new CalculateChainOfResponsibility();

    assertThrows(
        UnsupportedOperationException.class,
        () -> sut.calculate(EXPR));
  }
}
