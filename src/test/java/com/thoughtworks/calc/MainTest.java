package com.thoughtworks.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainTest {


  @Test
  @Tag("e2e")
  public void shouldShowTheHelpWhenNoArgs() {
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStreamCaptor));

    Main.main(new String[0]);

    assertEquals("some help message", outputStreamCaptor.toString());
  }
}
