package solutions.kilian.config;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

public class EnvironmentTest {
  private Logger LOGGER = LoggerFactory.getLogger(EnvironmentTest.class);

  @Test
  public void webdriverPathEnvVarShouldBeSeted() {
    Optional<String> webdriverHomeEnv = Optional.fromNullable(System.getenv("WEBDRIVER_BINARY"));
    LOGGER.debug(webdriverHomeEnv.get());
    assertTrue("Webdriver Path Environment variable not present!", webdriverHomeEnv.isPresent());
  }

  @Test
  public void webdriverEnvVarShouldBeSeted() {
    Optional<String> webdriver = Optional.fromNullable(System.getenv("WEBDRIVER"));
    LOGGER.debug(webdriver.get());
    assertTrue("Webdriver Environment variable not present!", webdriver.isPresent());
  }


}
