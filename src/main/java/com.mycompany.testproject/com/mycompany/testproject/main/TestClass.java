package com.mycompany.testproject.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;

@ApplicationScoped
public class TestClass {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestClass.class);

  /**
   * Main without args evaluated.
   *
   * @param args
   *          - no args expected
   */
  public static void main(final String[] args) {

    LOGGER.info("Testlog");
    LOGGER.atDebug()
          .log("debug");

    CDI.current()
       .select(TestClass.class)
       .get()
       .runTest();
    // }
  }

  private void runTest() {
    LOGGER.info("perfect");

  }

}
