# 2022 Winter Weekend | Selenium Bootcamp


## SUBMISSION PROCESS:

### Deadline: 
* November 19th @ 10AM

### Instructions 
* Navigate to your IdeaProjects directory and clone the project locally
```sh
git clone https://github.com/samipiit/SeleniumBootcamp.git
```
* Create your remote repo on Github
* Add the repo URL [here, in your team's sheet](https://docs.google.com/spreadsheets/d/1HXl8awdlQeSRnOlO1LgE3nx4PM5MavDMfDBiJiTTHek/edit?usp=sharing),
* Switch your local repo's remote repo to point to your new remote repo
```sh
git remote set-url origin <your_repo_URL>
```
* Verify your working copy is pointing to the correct repo
```sh
git remote -v
```
* Make sure to push the framework to your remote repo so that you have the base framework available
* Make sure to do this next step only after you've pushed the framework to your remote
    * Inside each module except for `base`, under `src/main/java` and `src/main/test` you will find files titled 
    `delete_this_file.txt` Only delete these files once you have created at least 1 class under these directories. 
    If you delete these files and there is nothing else in the directory, when you push to your remote, Git will exclude 
    the directory entirely. 
* It's recommended to create a new branch for each module you work on, and then merge that branch into your main once
    you have completed writing tests for that module/application.
* You should be pushing **STABLE CODE ONLY** & you should be pushing as soon as you can confirm a test case is passing 
consistently (run test 2-3x to confirm)
  - Best practice on the job, is to push your code every time you solve a problem, make a change, or finish a task
  - ***IMPORTANT: DO NOT PUSH ANY CODE CONTAINING ANY ERRORS, OR ANY INCOMPLETE CODE***
#
### TO DO:
* You are responsible for developing 120 test cases
  * 90% of your tests should be data-driven
    * Either data-drive your tests or access data to assert against, from an external source 
* You must work with at least 10 different web applications (12 tests/application)
  * You are welcome to automate all the given applications, in order to reduce the number of tests required per 
  application
* You must test across all 8 available domains (see below for domain list)
* You must develop at least 10 high-value E2E test cases for Luma
    * Think about common production scenarios, such as opening an account, paying bills,
    making transfers, viewing transaction history, etc
* You must develop at least 10 high value E2E test cases for FreeCRM
    * Look at all the functionality this application allows you to do - Log a call, add a new contact, add new companies, 
    scheduling calendar events, etc  
#
### REQUIREMENTS:
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
- Generating Dynamic Fake Data
- Data Provider
- Assertions using external data
  - Excel
  - Database
#
#### DOMAINS:
- Digital Media
  - [ESPN](https://www.espn.com/)

- Banking/Finance
  - [Bank of America](https://www.bankofamerica.com/)
  - [Investing.com](https://www.investing.com/)

- Travel
  - [Booking.com](https://www.booking.com/)
  - [Expedia](https://www.expedia.com/)

- Telecommunications
  - [Verizon](https://www.verizon.com/)
  - [Optimum](https://www.optimum.com/)

- Automotive
  - [BMW USA](https://www.bmwusa.com/)
  - [Mercedes-Benz USA](https://www.mbusa.com/)

- Real Estate
  - [StreetEasy](https://www.streeteasy.com/)
  - [Apartments.com](https://www.apartments.com/)

- E-Commerce
  - [EBay](https://www.ebay.com/)

- E2E Capable Applications
  - [Free CRM](https://freecrm.com/)
  - [ParaBank](https://parabank.parasoft.com/)

## REMINDERS:
`**DO NOT MESS WITH ANY POM.XML FILE, UNLESS YOU TRULY UNDERSTAND WHAT YOU ARE DOING**`
- When running tests from a Test Class, you need to make sure the method in the BasePage class, 
named `driverSetup (@BeforeMethod)`, has an optional parameter `URL`, with the value of the website you are testing. 
    - If running tests from the xml file, then the `URL` parameter should point to the application homepage
- If you would like your test to automatically retry upon failure, annotate the test method with `@RetryCount(n)` 
    where `n` equals the number of times to retry
    - If you are running from the Test Class and would like your tests to retry on failure, then you need to add the 
    following attribute & value to the `@Test` annotation: 
    
        `retryAnalyzer = RetryAnalyzer.class`
    
    - If you are running from the TestNGRunner.xml, then make sure you have the AnnotationTransfer class identified as 
    a listener. (This has already been done, in all the Runner files)
        
        ```
      <listeners>
             <listener class-name="listeners.AnnotationTransformer"/>
      </listeners>
      ```
- When you run the Maven Clean lifecycle, you will also be cleaning out all existing test reports
    - In order to keep all your reports, you must go to the **ROOT** POM.xml and comment out lines 112-117 
    (The entire `<filesets>` tag)
- If you are copying and pasting code frequently, it probably means you should turn that workflow/action into a method
- Your goal should be to write code that is highly portable and can be used in a wide variety of situations  
- Try to come up with helper methods that can help with assertions (i.e. - compare list of expected results from your 
    excel sheet against a list of WebElement text that was retrieved during test execution, and return true if both 
    lists are equal)
- At the end of the bootcamp, you should be able to confidently run your entire project (all modules), by executing `mvn clean install -U`
  - You must have the path to the Maven executable in your `PATH` environment variable, in order to run `mvn` commands in your terminal/cmd



#### ***ENJOY THE PROCESS & GOOD LUCK!***

