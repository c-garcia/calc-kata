package com.thoughtworks.calc;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class SmokeTest {
  private final PrintStream standardOut = System.out;
//  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

//  @BeforeEach
//  public void setUp() {
//    System.setOut(new PrintStream(outputStreamCaptor));
//  }
//  @Test
//  void testSystemOut() {
//    System.out.println("3aaa");
//
//    assertEquals("aaa", outputStreamCaptor.toString()
//        .trim());
//  }

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
