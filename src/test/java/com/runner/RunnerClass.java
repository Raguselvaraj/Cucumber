package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\acer\\eclipse-workspace\\Cucumber\\src\\test\\resources\\AdactinDay2.feature", 
glue = "com.test")

public class RunnerClass {

}
