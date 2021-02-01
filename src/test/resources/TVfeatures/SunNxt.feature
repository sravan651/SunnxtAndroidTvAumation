Feature: SunNxt TV Automation

@MobileTest @Hometabs @sss
Scenario Outline: Tv-01&03&04&05-Verify Home tabs
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click HomeTabs
Then user back to home
 
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
@MobileTest @Carousals 
Scenario Outline: TV06&07-User should be able to navigate between carousal in each page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then  user click Moviestab navigate all carosals
Then  user click Tvshowstab navigate all carosals  
Then  user click Livetab navigate all carosals
Then  user click Musicvideostab navigate all carosals
Then  user click Comedytab navigate all carosals
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @MobileLogin @sravan
Scenario Outline: TV11-User should be able to Sign in with Mobilenumber 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user launch homepage
Given user click one content
Then user Login with Mobilenumber 
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
@MobileTest @EmailsecondaryprofleLogin 
Scenario Outline: TV-12&13&14-User should be able to Sign in with Email ID
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with emailid  
Then user back to home


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 

@MobileTest @Nonsubscriber @ss
Scenario Outline: TV-15-User should be able to SIgn in from settings page also
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Settings" menu
Then user Login with Nonsubscriber emailid 
Then user back to home


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
@MobileTest @internationuser @ss
Scenario Outline: TV44-International user should not be logged in to Indian App
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with International user email id 
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
 
   