package solutions.kilian.config;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

public class EnvironmentTest {
  private Logger LOGGER = LoggerFactory.getLogger(EnvironmentTest.class);

  @Test
  public void environmentVaribleShouldBeSeted() {
    Optional<String> webdriverHomeEnv = Optional.fromNullable(System.getenv("WEBDRIVER_BINARY"));
    LOGGER.debug(webdriverHomeEnv.get());
    assertTrue("Environment variable not present!", webdriverHomeEnv.isPresent());
  }


}
