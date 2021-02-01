Feature: SunNxt Mobile Automation

@EmailLogin 
Scenario Outline: TV10-User should be able to Sign in with Email ID
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click one content
Then user Login with email id  


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Homecarousals @ssk
Scenario Outline: TV21-User should be able to play contents from each carousal in Home Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user playback for all Home carousals
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 

 
@MobileTest @Moviecarousals  @ssk
Scenario Outline: TV22-User should be able to play contents from each carousal in Movies Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Movies" menu 
Then user playback for all Movie carousals
Then user back to home
 
Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Tvshowscarousals   @sravan
Scenario Outline: TV23-User should be able to play contents from each carousal in TV Shows Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "TV Shows" menu 
Then user playback for all Tvshows carousals
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Musicvideoscarousals  @sravan
Scenario Outline: TV24-User should be able to play contents from each carousal in Music Videos Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Music Videos" menu 
Then user playback for all musicvideos carousals
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Comedycarousals  @sravan
Scenario Outline: TV25-User should be able to play contents from each carousal in Comedy Page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Comedy" menu
Then user playback for all Comedy carousals
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
  
 

 


 
@MobileTest @Moviespage  @sss
Scenario Outline: TV26-User select In Movies page - Select View all Movies - Apply filter for genre and observe the results. play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user Apply filter for genre in movies page
When user click on "VIEW ALL MOVIES" under section "VIEW ALL MOVIES"
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Tvshowspage  @sss
Scenario Outline: TV27-User select In TV shows page - Select View all for Tv shows - Apply filter for Genre and observe the results. play any content from the results 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user Apply filter for genre in TVshows page
When user click on "View All Shows" under section "View All"
Then user back to home

Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Musicvideospage @sss
Scenario Outline: TV28-User select In Music Videos page - Select View all for Music videos  - Apply filter for Musicians and observe the results. play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file 
Then user Apply filter for genre in MusicVideos page
When user click on "VIEW ALL MUSIC VIDEOS" under section "VIEW ALL MUSIC VIDEOS"
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Comedyspage @sss
Scenario Outline: TV29-User select In comedy page - Select view all for comedy - Apply filter for comedians and observe the results. Play any content from the results
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user Apply filter for genre in comedypage page
When user click on "View All" under section "View All"
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @LiveTVpage 
Scenario Outline: TV30-User select Verify Live TV section and play content from catch up section if available
Given Read the test data "<TestData>" and "<TestData1>" from Excel file 
When user selects "Live TV" menu 
Then user Verify Live TV section
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
@MobileTest @Sravan
Scenario Outline: Selecting a video from TV
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click on "Brahmachari (Telugu)" under section "SOUTH LATEST BLOCKBUSTER"
Then user back to home

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication| 

@MobileTest @Search 
Scenario Outline: TV35-search from different sections and play any content from search results 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects Search icon button 
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  

 
@MobileTest @Contentlanguage 
Scenario Outline: TV37&38-User should be able to change content language through settings page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Settings" menu 
Then user change content language
Then user back to home

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @Subtitle 
Scenario Outline: TV41-User should be able to ON/OFF subtitles while playing the conten
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Movies" menu 
Then user play one content
 
 
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
@MobileTest @Myaccounts 
Scenario Outline: TV42-User should be able to check "MY Accounts" from settings page
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user selects "Settings" menu 
Then user click on Myaccount 
 
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  

 
 @MobileTest @Playbackcontrols 
Scenario Outline: TV50-User should be able to Auto play the contents
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Then user verify playback controls 
Then user back to home


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 @MobileTest  
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
Then user back to home


Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 
 
 
 
 
 
 
 
 
 
 
 
