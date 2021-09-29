package com.thoughtworks.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SmokeTest {

  public interface ExampleInterface {
    Integer sum(Integer a, Integer b);
  }
  @Test
  public void shouldPass() {
    assertTrue(true);
  }

  @Test
  public void shouldPassWithMocks() {
    var sut = mock(ExampleInterface.class);
    when(sut.sum(1, 2)).thenReturn(3);
    var res = sut.sum(1, 2);
    assertEquals(3, res);
    verify(sut, times(1)).sum(1, 2);
  }
}
