Feature: SunNxt Mobile Automation
@MobileTest @Hometabs @sravan
Scenario Outline: Tv-01&03&04&05-Verify Home tabs
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click HomeTabs
 
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
@MobileTest @Carousals @AndroidTV @sravan
Scenario Outline: TV06&07-User should be able to navigate between carousal in each page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then  user click Moviestab navigate all carosals
Then  user click Tvshowstab navigate all carosals  
Then  user click Livetab navigate all carosals
Then  user click Musicvideostab navigate all carosals
Then  user click Comedytab navigate all carosals

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
@MobileTest @EmailLogin @AndroidTV @sravan
Scenario Outline: TV10-User should be able to Sign in with Email ID
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id  


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
@MobileTest @MobileLogin @AndroidTV
Scenario Outline: TV11-User should be able to Sign in with Mobilenumber 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with Mobilenumber 

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
@MobileTest @EmailsecondaryprofleLogin @AndroidTV
Scenario Outline: TV-12&13&14-User should be able to Sign in with Email ID
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with emailid  


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
   
 

@MobileTest @Homecarousals @AndroidTV
Scenario Outline: TV21-User should be able to play contents from each carousal in Home Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user playback for all Home carousals

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 

 
@MobileTest @Moviecarousals @AndroidTV
Scenario Outline: TV22-User should be able to play contents from each carousal in Movies Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user playback for all Movie carousals
 
Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Tvshowscarousals @AndroidTV
Scenario Outline: TV23-User should be able to play contents from each carousal in TV Shows Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user playback for all Tvshows carousals

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Musicvideoscarousals @AndroidTV
Scenario Outline: TV24-User should be able to play contents from each carousal in Music Videos Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user playback for all musicvideos carousals

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Comedycarousals @AndroidTV
Scenario Outline: TV25-User should be able to play contents from each carousal in Comedy Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user playback for all Comedy carousals

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
 
@MobileTest @Moviespage @AndroidTV
Scenario Outline: TV26-User select In Movies page - Select View all Movies - Apply filter for genre and observe the results. play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user Apply filter for genre in movies page

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Tvshowspage @AndroidTV
Scenario Outline: TV27-User select In TV shows page - Select View all for Tv shows - Apply filter for Genre and observe the results. play any content from the results 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user Apply filter for genre in TVshows page

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Musicvideospage @AndroidTV
Scenario Outline: TV28-User select In Music Videos page - Select View all for Music videos  - Apply filter for Musicians and observe the results. play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with emailid 
Then user Apply filter for genre in MusicVideos page

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Comedyspage @AndroidTV
Scenario Outline: TV29-User select In comedy page - Select view all for comedy - Apply filter for comedians and observe the results. Play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with emailid 
Then user Apply filter for genre in comedypage page

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @LiveTVpage @AndroidTV
Scenario Outline: TV30-User select Verify Live TV section and play content from catch up section if available
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with emailid 
Then user Verify Live TV section

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
 
 
@MobileTest @Contentlanguage @AndroidTV
Scenario Outline: TV37&38-User should be able to change content language through settings page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user change content language
#Then user observe content language changed or not

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
 @MobileTest @Playbackcontrols @AndroidTV
Scenario Outline: TV50-User should be able to Auto play the contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user verify playback controls 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 @MobileTest @fg @AndroidTV
Scenario Outline: TV49-User should be able to Auto play the contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id 
Then user verify playback controls 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
 
 
 
 
 
 
 
 
 
 
 
 
