TeamFlect Case

Used Approaches,
  I created project relied on POM structure. I used Java with selenium framework. All web elements are located under main -> java -> pages. This helps us easy to maintain all web elements and realted methods. Also utilities and config files are seperated. 
  I used cucumber for creating test cases under test -> java -> featureFiles FilmDetails.feature file. Related test cases are connected with related test methods under FilmDetailsTest class. FilmDetailsTest includes only validation for test steps and related 
  methods are connected with test page classes under main -> java -> pages. And i set allure report feature in the project. Simply you can run project with Runner calss.

Required Technologies,
- Java sdk -> 9.0 version 19
- Selenium -> 4.18.1
- Cucumber -> 7.10.1
- Allure -> 2.25.0
