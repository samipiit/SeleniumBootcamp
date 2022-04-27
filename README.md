## 2022 Winter Weekend | Selenium Bootcamp


### SUBMISSION PROCESS:
- Deadline: May 15th @ 10AM
# PRIORITY 1
- One person from your team should do the following: 
  - Clone the project locally
  - Create your team's remote repo on Github
  - Add the repo URL [here, in ](https://docs.google.com/spreadsheets/d/1KLyA8MVIOBkZ72z8b5jLUwgXkMTqw-EgJcm8C2CufaA/edit#gid=0),
  - Switch your local repo to point to your team's new remote repo
    - `git remote set-url <existing remote name> <new repo URL>`
  - Push the framework to your team's remote repo
- All members should now clone the repo, create their own branch and push at least once to their individual branches, so that everyone starts with the same baseline framework in their respective branches 
- You should be pushing **STABLE CODE ONLY** & you should be pushing as soon as you can confirm a test case is passing consistently (run test 3-4x to confirm)
  - Best practice (in real life), is to push your code every time you solve a problem, make a change, or finish a task.
  - ***IMPORTANT: DO NOT PUSH ANY CODE CONTAINING ANY ERRORS, OR ANY INCOMPLETE CODE***

### TODO:
- Each team is responsible for developing 150 test cases per member
- At least 10 different web applications should be tested (15 test cases/ea)
  - You are welcome to automate all given applications
  - You must test in all 7 available domains (see below)
  - You must develop at least 10 End-to-End test cases for automationpractice.com
    - Take a poke around the account page, checkout page, shopping cart page, etc and try to think of some common production scenarios 
- All teams will be accountable for the entirety of deliverables (test cases) for all active team members

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
- Data Provider
- Assertions using external data
  - Excel
  - Database
  
### DOMAINS:
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
- If you are copying and pasting code, it probably means you should make that workflow/action/whatever into a method
- Try to come up with helper methods that can help with assertions (i.e. - compare list of expected results from your excel sheet against a list of webelement text that was retrieved during test execution, and return true if both are equal)
- At the end of the bootcamp, you should be able to confidently run your entire project (all modules), by executing `mvn clean install -U`
  - You must have the path to the Maven executable in your `PATH` environment variable, in order to run `mvn` commands in your terminal/cmd



#### ***ENJOY THE PROCESS & GOOD LUCK!***

