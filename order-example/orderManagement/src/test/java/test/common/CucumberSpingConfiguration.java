package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.OrderManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderManagementApplication.class })
public class CucumberSpingConfiguration {}
