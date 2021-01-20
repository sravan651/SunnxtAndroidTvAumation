package com.sunnxt.stepdefs.android.tv;

import com.sunnxt.locators.android.AndroidLocators.Login;
import com.sunnxt.locators.android.tv.AndroidTVLocators.Languages;
import com.sunnxt.locators.android.tv.AndroidTVLocators.hometabs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.nativekey.AndroidKey;

public class AndroidTVStepdefs extends BizComps {

	@Given("^user click HomeTabs$")
	public void user_click_HomeTabs()
	{
		click(hometabs.Homebtn, "user click Home button");
		delay(5000);
		Back();
		for (int i = 0; i < 8; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(5000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN_LEFT);
		delay(5000);
				
		Back();
		for (int i = 0; i < 6; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_UP);
			delay(2000);
		}
	
	}
	@Given("^user click HomeTab carousals$")
	public void user_click_HomeTab_carousals()
	{
		
		click(hometabs.Homebtn, "user click Home button");
		delay(5000);
		
		for (int i = 0; i < 2; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN_LEFT);
		delay(5000);
				
		Back();
	
	}
	@Given("^user click one content$")
	public void user_click_one_content() {
		click(hometabs.Homebtn, "user click Home button");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN_RIGHT);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		//click(hometabs.Redtrailar, "user click Home button");
		delay(5000);
	}

	@Then("^user Login with email id$")
	public void user_Login_with_email_id() {
		setValue(Login.EmailId_Txt, config.getTDValue("UserID"), "Entered EmailID");
		
		setValue(Login.Password_Txt, config.getTDValue("Password"), "Entered password");
		Back();
		click(Login.loginBtn, "user click login button");
		delay(2000);
		/*delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();*/
		/*executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 7; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		click(hometabs.Settingsbtn, "user click settings button");
		delay(5000);
		for (int i = 0; i < 4; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);*/
	}
	
	@Given("^user click Hometab navigate all carosals$")
	public void user_click_Hometab_navigate_all_carosals()
	{
		click(hometabs.Homebtn, "user click Home button");
		delay(5000);
		
		for (int i = 0; i < 15; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
	}
	@Then("^user click Moviestab navigate all carosals$")
	public void user_click_Moviestab_navigate_all_carosals()
	{
		//launchHomePage();
		delay(5000);
		click(hometabs.Moviesbtn, "user click Home button");
		delay(5000);
		
		    for (int i = 0; i < 15; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
			delay(2000);
		    }
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			for (int i = 0; i < 15; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			}
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			for (int i = 0; i < 10; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			}
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			for (int i = 0; i < 10; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			}
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			for (int i = 0; i < 10; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			}
		Back();
		
	}
	@Then("^user click Tvshowstab navigate all carosals$")
	public void user_click_Tvshowstab_navigate_all_carosals()
	{
		click(hometabs.Tvshowsbtn, "user click Home button");
		delay(5000);
		
		 for (int i = 0; i < 15; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			    }
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 15; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
			Back();
		
	}
	@Then("^user click Livetab navigate all carosals$")
	public void user_click_Livetab_navigate_all_carosals()
	{
		click(hometabs.Livebtn, "user click Home button");
		delay(5000);
		
		 for (int i = 0; i < 15; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			    }
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 15; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
			Back();
	}
	@Then("^user click Musicvideostab navigate all carosals$")
	public void user_click_Musicvideostab_navigate_all_carosals()
	{
		click(hometabs.musicvideosbtn, "user click Home button");
		delay(5000);
		
		 for (int i = 0; i < 15; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			    }
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 15; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
			Back();
		
	}
	@Then("^user click Comedytab navigate all carosals$")
	public void user_click_Comedytab_navigate_all_carosals()
	{
		click(hometabs.comedybtn, "user click Home button");
		delay(5000);
		
		 for (int i = 0; i < 15; i++) {
				executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				delay(2000);
			    }
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 15; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				for (int i = 0; i < 10; i++) {
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
					delay(2000);
				}
			Back();
	}
	@Then("^user Login with Mobilenumber$")
	public void user_Login_with_Mobilenumber() {
		setValue(Login.EmailId_Txt, config.getTDValue("Mobilenumber"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("mobilepassword"), "Entered password");
		click(Login.loginBtn, "user click login button");
		delay(5000);
		Back();
		for (int i = 0; i < 7; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		click(hometabs.Settingsbtn, "user click settings button");
		delay(5000);
		for (int i = 0; i < 4; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	}
	@Then("^user Login with emailid$")
	public void user_Login_with_emailid() {
		setValue(Login.EmailId_Txt, config.getTDValue("EmailID"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Password"), "Entered password");
		click(Login.loginBtn, "user click login button");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	}
		
	@Then("^user logout$")
	public void user_logout()
	{
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 7; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		click(hometabs.Settingsbtn, "user click settings button");
		delay(5000);
		for (int i = 0; i < 3; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 3; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		
	}
		
	
	
	@Then("^user playback for all Home carousals$")
	public void user_playback_for_all_Home_carousals()
	{
		
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	//	Back();
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		delay(1000);
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		delay(1000);
		Back();
		/*executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();*/
		
	}

	@Then("^user playback for all Movie carousals$")
	public void user_playback_for_all_Movie_carousals()
	{
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(5000);
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		/*delay(1000);
		Back();*/
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		
	}

	@Then("^user playback for all Tvshows carousals$")
	public void user_playback_for_all_Tvshows_carousals()
	{
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(5000);
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		/*delay(1000);
		Back();*/
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
	}

	@Then("^user playback for all musicvideos carousals$")
	public void user_playback_for_all_musicvideos_carousals()
	{
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(5000);
		//Back();
		for (int i = 0; i < 4; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		/*delay(1000);
		Back();*/
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		
	}

	@Then("^user playback for all Comedy carousals$")
	public void user_playback_for_all_Comedy_carousals()
	{
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(5000);
		//Back();
		for (int i = 0; i < 5; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		/*delay(1000);
		Back();*/
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		
	}
	@Then("^user Apply filter for genre in movies page$")
	public void user_Apply_filter_for_genre_in_movies_page()
	{
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(5000);
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		for (int i = 0; i < 8; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
	}
	
	@Then("^user Apply filter for genre in TVshows page$")
	public void user_Apply_filter_for_genre_in_TVshows_page()
	{
		
	}
	
	
	@Then("^user Apply filter for genre in MusicVideos page$")
	public void user_Apply_filter_for_genre_in_MusicVideos_page()
	{
		
	}
	
	@Then("^user Apply filter for genre in comedypage page$")
	public void user_Apply_filter_for_genre_in_comedypage_page()
	{
		
	}
	
	
	@Then("^user Verify Live TV section$")
	public void user_Verify_Live_TV_section()
	{
		
	}
	@Then("^user change content language$") 
	public void user_change_content_language()
	{
		Back();
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 7; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		click(hometabs.Settingsbtn, "user click settings button");
		delay(5000);
		for (int i = 0; i < 2; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		
	}
	
	
	@Then("^user verify playback controls$")
	public void user_verify_playback_controls()
	{
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN_RIGHT);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN_RIGHT);
		for (int i = 0; i < 8; i++) {
	
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
			delay(5000);
		}
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 4; i++) {
	
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
			delay(5000);
		}
		Back();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}