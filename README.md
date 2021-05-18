Automation Project using Cucumber TestNG and Selenium 

**Features**
Folder structure is clear 
Helper folder has ReportHelper class to generate cucumber Reports 
Stepdefinition folder contains all the glue code to run the feature steps 
Pages folder contains Webelements and operations on elements

**To Get Started**

Pre-requisites
Java installed in the system
Maven installed in the system
Run the following maven command from command line
**mvn clean test**

The scripts should run successfully in Chrome browser as it is defined in the config.properties file.
You can change the browser on which you want to run test cases

Target folder should be created with cucumber-html-report and surefire-reports.
Test_Output folder should be created with the default testng reports

Writing Features

Feature: To search cucumber in google
@Regression
Scenario:  Housing Page


Writing Step Definitions
public class Steps extends CucumberRunner {
@Then("$")
public void function() throws Throwable {
}
}

Cucumber Options
@CucumberOptions(
strict = true,
monochrome = true,
features = {"src/test/resources/features/"},
glue = "stepdefinition",
plugin = {"pretty", "html:target/cucumber-html-report" },
)

HTML Reports
Default cucumber HTML reports are generated which can be customized according to specific needs