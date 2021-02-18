Feature: SunNxt TV Automation

@MobileTest @Hometabs @SS
Scenario Outline: Tv-01&03&04&05-Verify Home tabs
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click HomeTabs

 
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
@MobileTest @Carousals  @abc
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
 
@MobileTest @MobileLogin @sravan @abc
Scenario Outline: TV11-User should be able to Sign in with Mobilenumber 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Home" menu
Given user click one content
Then user Login with Mobilenumber 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @EmailsecondaryprofleLogin @SSS
Scenario Outline: TV-12&13&14-User should be able to Sign in with Email ID
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Home" menu
Given user click one content
Then user Login with emailid  
And user goes to Homescreen and select "Settings" menu
Then user logout


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 

@MobileTest @Nonsub @abc
Scenario Outline: TV-15-User should be able to SIgn in from settings page also
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Settings" menu
Then user Login with Nonsubscriber emailid 

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Nonsubscriber @abc
Scenario Outline: TV-16&17-Non Subscribed user should be able to play Free contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Home" menu
Then user Login with Nonsubscriber and play free contents
And user logout for non subscriberuser

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
@MobileTest @Sundirectuser @abc
Scenario Outline: TV-18-Active Sundirect user should be able to play all types of contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Settings" menu
Then user Login with Sundirectuser
And user goes to Homescreen and select "Home" menu
Then user playback for all Home carousals
Then user Login with Nonsubscriber and play free contents
And user goes to Homescreen and select "Settings" menu
And user logout for non subscriberuser

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Expireduser 
Scenario Outline: TV-19&20-Expired sundirect user should be able to play only free contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Settings" menu
Then user Login with Nonsubscriber emailid 
When user selects "Home" menu 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 

@MobileTest @Switchprofile 
Scenario Outline: TV39-User should be able to do switch profile
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Settings" menu
Then user should be able to do switch profile

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @internationusertv @sssss
Scenario Outline: TV44-International user should not be logged in to Indian App
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user back to home
Given user click one content
Then user Login with International user email id 
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 


 
 
@MobileTest @loginwith9digits 
Scenario Outline: TV55-User login with nine or eleven digits
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with nine digits and eleven digits
When user selects "Home" menu 

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 @MobileTest @loginwith11digits 
Scenario Outline: TV56-User login with nine or eleven digits
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with eleven digits
When user selects "Home" menu 

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @emptypassword 
Scenario Outline: TV57-User login with nine or eleven digits
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with empty password
When user selects "Home" menu 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @Wrongpassword 
Scenario Outline: TV58-User login with nine or eleven digits
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with Wrong password
When user selects "Home" menu 

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 
   