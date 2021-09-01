package com.thoughtworks.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainTest {
  ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp(){
    System.setOut(new PrintStream(outputStreamCaptor));
  }


  @Test
  @Tag("e2e")
  public void shouldShowTheHelpWhenNoArgs() {

    Main.main(new String[0]);

    assertEquals("some help message\n", outputStreamCaptor.toString());
  }
}
