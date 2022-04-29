# 2022 Winter Weekend | Selenium Bootcamp


## SUBMISSION PROCESS:
- Deadline: May 15th @ 10AM
### PRIORITY 1
- One person from your team should do the following: 
  - Clone the project locally
  - Create your team's remote repo on Github
  - Add the repo URL [here, in your team's sheet](https://docs.google.com/spreadsheets/d/1KLyA8MVIOBkZ72z8b5jLUwgXkMTqw-EgJcm8C2CufaA/edit#gid=0),
  - Switch your local repo to point to your team's new remote repo
    - `git remote set-url <existing remote name> <new repo URL>`
  - Push the framework to your team's remote repo
- All members should now clone the repo, create their own branch and push at least once to their individual branches, so that everyone starts with the same baseline framework in their respective branches 
- You should be pushing **STABLE CODE ONLY** & you should be pushing as soon as you can confirm a test case is passing consistently (run test 3-4x to confirm)
  - Best practice (in real life), is to push your code every time you solve a problem, make a change, or finish a task.
  - ***IMPORTANT: DO NOT PUSH ANY CODE CONTAINING ANY ERRORS, OR ANY INCOMPLETE CODE***

## TODO:
- Each team is responsible for developing 150 test cases/member
  - 90% of your tests should be data-driven (either data-drive your tests or access data to assert against, from an Excel sheet) 
- Each person must work with at least 10 different web applications (15 tests/application)
  - You are welcome to automate all the given applications, in order to reduce the number of tests you would need to write per application.
- You must test in all 7 available domains (see below for domain list)
- You must develop at least 10 End-to-End test cases for automationpractice.com
  - Take a poke around the account page, checkout page, shopping cart page, etc and try to think of some common production scenarios that might occur often 
- All teams will be accountable for the entirety of deliverables (test cases) for all active team members

## REQUIREMENTS:
- Explicit Wait
- Fluent Wait
- Mouse Hover
- Drag and Drop
- Dropdown Select
- Radio Buttons
- Checkbox Select
- Static & Dynamic Web Tables
- Date Picker/Calendar Picker
- Modal Windows
- Alert Dismissal
- Tab Switching
- iFrames
- Testing Embedded Media Players
- File Upload/Download
- Exception Handling
- Data Provider
- Assertions using external data
  - Excel
  - Database
  
## DOMAINS:
- Digital Media
  - https://www.espn.com/
  - https://www.marketwatch.com/

- Banking/Finance
  - https://www.bankofamerica.com/
  - https://www.sofi.com/

- Travel
  - https://www.booking.com/
  - https://www.expedia.com/

- Telecommunications
  - https://www.verizon.com/
  - https://www.att.com/

- Automotive
  - https://www.bmwusa.com/
  - https://www.mbusa.com/

- Real Estate
  - https://www.redfin.com/
  - https://www.realtor.com/

- E-Commerce
  - http://automationpractice.com/
  - https://www.ebay.com/


## REMINDERS:
- **DO NOT MESS WITH ANY POM.XML FILE, UNLESS YOU TRULY UNDERSTAND WHAT YOU ARE DOING**
- When running tests from a Test Class, you need to make sure the method in the BasePage class, named `driverSetup` (@BeforeMethod), has an optional parameter `URL`, with the value of the website you are testing. If running tests from the xml file, then the `URL` parameter should point to the application homepage
- If you would like your test to automatically retry upon failure, annotate the test method with `@RetryCount(2)` with the number passed to the annotation being the number of times you would like your test to retry
    - If you are running from the Test Class and would like your tests to auto-retry, then you need to add the following attribute & value to the `@Test` annotation: 
        - `retryAnalyzer = RetryAnalyzer.class`
    - If you are running from the TestNGRunner.xml, then make sure you have the AnnotationTransfer class identified as a listener. (This has already been done, in all the Runner files)
        - `<listeners>`
                `<listener class-name="listeners.AnnotationTransformer"/>`
           `</listeners>`
- When you run the Maven Clean lifecycle, you will also be cleaning out all existing test reports
    - In order to keep all your reports, you must go to the ***PARENT/ROOT*** POM.xml and comment out lines 112-117 (The entire `<filesets>` tag)
- If you are copying and pasting code frequently, it probably means you should turn that workflow/action/whatever into a method
- Your goal should be to write code that is highly portable and can be used in a wide variety of situations  
- Try to come up with helper methods that can help with assertions (i.e. - compare list of expected results from your excel sheet against a list of webelement text that was retrieved during test execution, and return true if both are equal)
- At the end of the bootcamp, you should be able to confidently run your entire project (all modules), by executing `mvn clean install -U`
  - You must have the path to the Maven executable in your `PATH` environment variable, in order to run `mvn` commands in your terminal/cmd



#### ***ENJOY THE PROCESS & GOOD LUCK!***

