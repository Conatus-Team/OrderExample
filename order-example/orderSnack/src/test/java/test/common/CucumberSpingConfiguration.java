package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.OrderSnackApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderSnackApplication.class })
public class CucumberSpingConfiguration {}
