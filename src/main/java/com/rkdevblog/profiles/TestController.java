package com.rkdevblog.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkdevblog.profiles.config.ApplicationProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class TestController {


  private final String welcomeMessage;
  private final ApplicationProperties applicationProperties;

  public TestController(
          @Value("${spring.application.welcomeMessage}")
      String welcomeMessage,

      ApplicationProperties applicationProperties) {

    this.welcomeMessage = welcomeMessage;
    this.applicationProperties = applicationProperties;
  }
 // localhost:9090/api/v1/test
  @GetMapping("test")
  public String testController() {
    log.info("welcome message from value: {}", welcomeMessage);
    log.info("welcome message: {}", applicationProperties.getApplication().getWelcomeMessage());
    log.info("x-api-key: {}", applicationProperties.getApplication().getXApiKey());
    return applicationProperties.getApplication().getWelcomeMessage();
  }
}
