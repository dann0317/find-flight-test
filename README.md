# find-flight-test

## Test objective:
This test case was defined to prove the flight reservation for a specific trip, from Medellin to Manizales. 
The expected result is the display of a list of flights between those cities. 

## The project directory structure
The project has build scripts for Gradle, and follows the standard directory structure used in most Serenity projects:
src
+ main
+ test
   + java                          
     + starter  -- Test runners and supporting code
       + helpers
       + interactions
       + runners
       + stepdefinitions
       + tasks
       + userinterfaces
   + resources
       + features --                 Feature files 
       + + search   --               Feature file subdirectories


## Executing the tests
To run the sample project, you can either just run the CucumberTestSuite test runner class, or run gradle test from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the driver system property, e.g.

$ gradle clean test -Pdriver=firefox
The test results will be recorded in the target/site/serenity directory.

## Versions and Webdriver configuration
The WebDriver configuration is managed entirely from this file, as illustrated below:

webdriver {
driver = chrome
}
headless.mode = true

chrome.switches="""--start-maximized;--test-type;--no-sandbox;--ignore-certificate-errors;
--disable-popup-blocking;--disable-default-apps;--disable-extensions-file-access-check;
--incognito;--disable-infobars,--disable-gpu"""

###### Webdriver Version: '119.0.6045.105'

###### Serenity Version:  '4.0.1'

###### Java Version:  '16'
