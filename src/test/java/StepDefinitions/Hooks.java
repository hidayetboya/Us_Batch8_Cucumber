package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before
    public void beforeScenario(){
        System.out.println("Before Scenario Runs ");
    }
    @After
    public void afterScenario(){
        BaseDriver.quitDriver();

    }
    @BeforeStep
    public void beforeStep (){
        System.out.println("BeforeStep Runs");
    }
    @AfterStep
    public void afterStep (){
        System.out.println("AfterStep Runs");
    }
}
