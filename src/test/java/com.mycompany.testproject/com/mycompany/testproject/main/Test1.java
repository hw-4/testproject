package com.mycompany.testproject.main;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {

  private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

  @Test
  void Test1() {
    LOGGER.info("successfully ran test");
  }

}
