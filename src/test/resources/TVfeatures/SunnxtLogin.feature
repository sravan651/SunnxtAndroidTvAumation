Feature: SunNxt Mobile Automation

@EmailLogin 
Scenario Outline: TV10-User should be able to Sign in with Email ID
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id  


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Homecarousals  @sa
Scenario Outline: TV21-User should be able to play contents from each carousal in Home Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Home" menu
Then user playback for all Home carousals
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Moviecarousals @sa
Scenario Outline: TV22-User should be able to play contents from each carousal in Movies Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Movies" menu
Then user playback for all Movie carousals

Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Tvshowscarousals  
Scenario Outline: TV23-User should be able to play contents from each carousal in TV Shows Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "TV Shows" menu
Then user playback for all Tvshows carousals


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Musicvideoscarousals 
Scenario Outline: TV24-User should be able to play contents from each carousal in Music Videos Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Music Videos" menu
Then user playback for all musicvideos carousals


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Comedycarousals  @sravan
Scenario Outline: TV25-User should be able to play contents from each carousal in Comedy Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Comedy" menu
Then user playback for all Comedy carousals
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
  
 

@MobileTest @Moviespage  @srav
Scenario Outline: TV26-User select In Movies page - Select View all Movies - Apply filter for genre and observe the results. play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Movies" menu
When user click on "VIEW ALL MOVIES" under section a "VIEW ALL MOVIES"
Then user play the GENERS contents

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Tvshowspage  @srav
Scenario Outline: TV27-User select In TV shows page - Select View all for Tv shows - Apply filter for Genre and observe the results. play any content from the results 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "TV Shows" menu
When user click on "View All Shows" under section a "View All"
Then user play the GENERS contents

Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Musicvideospage  @srav
Scenario Outline: TV28-User select In Music Videos page - Select View all for Music videos  - Apply filter for Musicians and observe the results. play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file 
And user goes to Homescreen and select "Music Videos" menu
When user click on "VIEW ALL MUSIC VIDEOS" under section a "VIEW ALL MUSIC VIDEOS"
Then user play the Musicians contents


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Comedyspage  @srav
Scenario Outline: TV29-User select In comedy page - Select view all for comedy - Apply filter for comedians and observe the results. Play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Comedy" menu
When user click on "View All" under section a "View All"
Then user play the Comedy contents

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @LiveTVpage 
Scenario Outline: TV30-User select Verify Live TV section and play content from catch up section if available
Given Read the test data "<TestData>" and "<TestData1>" from Excel file 
And user goes to Homescreen and select "Live TV" menu
Then user Verify Live TV section


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 


@MobileTest @ContinueWatching
Scenario Outline: TV33-User should be shown similar content in player screen while playing and should be able to select from that and play the content
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click on "Brahmachari (Telugu)" under section "SOUTH LATEST BLOCKBUSTER"
Then user verify playback controls
And user goes to Homescreen and select "Home" menu
When user click on "Brahmachari (Telugu)" under section "CONTINUE WATCHING"

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication| 



@MobileTest @Search 
Scenario Outline: TV35-search from different sections and play any content from search results 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Home" menu
When user selects Search icon button 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  

 
@MobileTest @Contentlanguage 
Scenario Outline: TV37&38-User should be able to change content language through settings page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Settings" menu
Then user change content language

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 

 
@MobileTest @Subtitle 
Scenario Outline: TV41-User should be able to ON/OFF subtitles while playing the conten
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Movies" menu 
Then user play one content
When user selects "Home" menu 
 
 
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
@MobileTest @Myaccounts 
Scenario Outline: TV42-User should be able to check "MY Accounts" from settings page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
And user goes to Homescreen and select "Settings" menu
Then user click on Myaccount 

 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  

 
@MobileTest @Playbackcontrols 
Scenario Outline: TV50-User should be able to Auto play the contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user verify playback controls 
When user selects "Home" menu 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @sam 
Scenario Outline: TV49-User should be able to Auto play the contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user verify playback controls 
Then user back to home


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
@MobileTest @videoquality 
Scenario Outline: TV54-User should be able to change the content quality through setting option in seek bar
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user verify playback controls for videoqyality
When user selects "Home" menu 


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
 @LiveTV  
Scenario Outline: TV31-User should be able to play other channels also when selected from player screen
Given Read the test data "<TestData>" and "<TestData1>" from Excel file 
And user goes to Homescreen and select "Home" menu
When user selects "Live TV" menu 
Then user Verify Live TV section


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 @Contin
Scenario Outline: TV32-Partially played contents should be shown in continue watching section and can be played from that carousal
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click on "Brahmachari (Telugu)" under section "SOUTH LATEST BLOCKBUSTER"
When user selects "Home" menu 

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|  
 
 
 
 
 
 
 
 
 
