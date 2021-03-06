package com.sunnxt.stepdefs.android.tv;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import com.relevantcodes.extentreports.LogStatus;
import com.sunnxt.locators.android.AndroidLocators.Login;
import com.sunnxt.locators.android.tv.AndroidTVLocators.Languages;
import com.sunnxt.locators.android.tv.AndroidTVLocators.hometabs;
import com.sunnxt.locators.android.tv.AndroidTVLocators.playbackcontrols;
import com.sunnxt.utils.ExtTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.nativekey.AndroidKey;

public class AndroidTVStepdefs extends BizComps {

	@Given("^user click HomeTabs$")
	public void user_click_HomeTabs() {
		ExtTest.getTest().log(LogStatus.PASS, "Verify the all tabs");
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
	public void user_click_HomeTab_carousals() {
		ExtTest.getTest().log(LogStatus.PASS, "Verify the HomeTab carousals");
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

	@Given("^user launch homepage$")
	public void user_launch_homepage() {
		delay(2000);
		launchHomePage();
	}

	@Given("^user click one content$")
	public void user_click_one_content() {

		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
	}

	@Then("^user Login with email id$")
	public void user_Login_with_email_id() {
		delay(5000);
		setValue(Login.EmailId_Txt, config.getTDValue("UserID"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Password"), "Entered password");
		Back();
		click(Login.loginBtn, "user click login button");
		delay(2000);

	}

	@Then("^user should be able to do switch profil$")
	public void user_should_be_able_to_do_switch_profil() {
		click(hometabs.SIGNIN, "user click SIgnin button");
		delay(5000);
		setValue(Login.EmailId_Txt, config.getTDValue("UserID"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Password"), "Entered password");
		Back();
		click(Login.loginBtn, "user click login button");
		delay(2000);
		/*
		 * left up down right clickprofile right enter
		 */

	}

	@Given("^user click Hometab navigate all carosals$")
	public void user_click_Hometab_navigate_all_carosals() {
		click(hometabs.Homebtn, "user click Home button");
		delay(5000);

		for (int i = 0; i < 15; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
	}

	@Then("^user click Moviestab navigate all carosals$")
	public void user_click_Moviestab_navigate_all_carosals() {
		launchHomePage();
		ExtTest.getTest().log(LogStatus.PASS, "Verify the Movietabs");
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
	public void user_click_Tvshowstab_navigate_all_carosals() {
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
	public void user_click_Livetab_navigate_all_carosals() {
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
	public void user_click_Musicvideostab_navigate_all_carosals() {
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
	public void user_click_Comedytab_navigate_all_carosals() {
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
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		setValue(Login.EmailId_Txt, config.getTDValue("Mobilenumber"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("mobilepassword"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		delay(2000);
		/*
		 * executeAndroidKeyCodes(AndroidKey.DPAD_LEFT); delay(2000); for (int i = 0; i
		 * < 7; i++) { executeAndroidKeyCodes(AndroidKey.DPAD_DOWN); delay(2000); }
		 * click(hometabs.Settingsbtn, "user click settings button"); delay(5000); for
		 * (int i = 0; i < 4; i++) { executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		 * delay(2000); } executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		 */
	}

	@Then("^user Login with Nonsubscriber emailid$")
	public void user_Login_with_Nonsubscriber_emailid() {
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		setValue(Login.EmailId_Txt, config.getTDValue("Mobilenumber"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("mobilepassword"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);
		/*
		 * for (int i = 0; i < 7; i++) { executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		 * delay(2000); } click(hometabs.Settingsbtn, "user click settings button");
		 * delay(5000); for (int i = 0; i < 4; i++) {
		 * executeAndroidKeyCodes(AndroidKey.DPAD_DOWN); delay(2000); }
		 * executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		 */

	}

	@Then("^user Login with Nonsubscriber and play free contents$")
	public void user_Login_with_Nonsubscriber_and_play_free_contents() {
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(8000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(8000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);

	}

	@Then("^user Login with emailid$")
	public void user_Login_with_emailid() {
		delay(5000);
		setValue(Login.EmailId_Txt, config.getTDValue("EmailID"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Password"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	}

	@Then("^user logout$")
	public void user_logout() {
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	/*	for (int i = 0; i < 7; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		click(hometabs.Settingsbtn, "user click settings button");*/
		delay(5000);
		for (int i = 0; i < 3; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		/*executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 3; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);*/

	}

	@Then("^user back to home$")
	public void user_back_to_home() {
		// execCommand("adb shell am start -n
		// com.suntv.sunnxt/com.androidtv.myplex.ui.activity.MainActivity");
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);

		/*
		 * for (int i = 0; i < 4; i++) { try { Back();
		 * isElementDisplayed(hometabs.Moviesbtn, "Settings pagedisplayed"); break;
		 * 
		 * } catch (NoSuchElementException | TimeoutException e) {
		 * 
		 * }
		 * 
		 * } executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		 */
		/*
		 * for (int j = 0; j < 3; j++) { executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		 * delay(2000); }
		 */
		/*
		 * executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		 * executeAndroidKeyCodes(AndroidKey.DPAD_DOWN); delay(2000);
		 * executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		 */

	}

	@Then("^user Login with nine digits and eleven digits$")
	public void user_Login_with_nine_digits_and_eleven_digits() {

		ExtTest.getTest().log(LogStatus.PASS, "Login with nine digits user id");
		setValue(Login.EmailId_Txt, config.getTDValue("ninedigits"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Internationaluserpassword"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		isElementDisplayed(hometabs.invlid, "showing invalid username&password");
		ExtTest.getTest().log(LogStatus.PASS, "verify nine digits username ");
	}

	@Then("^user Login with eleven digits$")
	public void user_Login_with_eleven_digits_and_eleven_digits() {

		ExtTest.getTest().log(LogStatus.PASS, "Login with eleven digits user id");
		setValue(Login.EmailId_Txt, config.getTDValue("elevendigits"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Internationaluserpassword"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		isElementDisplayed(hometabs.invlid, "showing invalid username&password");
	}

	@Then("^user Login with Wrong password$")
	public void user_Login_with_Wrong_password() {

		ExtTest.getTest().log(LogStatus.PASS, "Login with nine digits user id");
		setValue(Login.EmailId_Txt, config.getTDValue("Mobilenumber"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("wrongpassword"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		isElementDisplayed(hometabs.wrongpassword, "showing Wrong password");
		ExtTest.getTest().log(LogStatus.PASS, "verify Wrong password use case");

	}

	@Then("^user Login with empty password$")
	public void user_Login_with_empty_password() {

		ExtTest.getTest().log(LogStatus.PASS, "Login with nine digits user id");
		setValue(Login.EmailId_Txt, config.getTDValue("Mobilenumber"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("emptypassword"), "Entered empty  password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		isElementDisplayed(hometabs.passwordempty, "showing password empty");
		ExtTest.getTest().log(LogStatus.PASS, "verify empty password use case");

	}

	@Then("^user playback for all Home carousals$")
	public void user_playback_for_all_Home_carousals() {
		ExtTest.getTest().log(LogStatus.PASS, "user playback for all Home carousals");
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		/*
		 * executeAndroidKeyCodes(AndroidKey.DPAD_CENTER); delay(5000);
		 */
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}

		delay(5000);

		//executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}

		delay(5000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);
		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}

		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.BACK);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
			executeAndroidKeyCodes(AndroidKey.BACK);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}

		delay(5000);

	}

	@Then("^user playback for all Movie carousals$")
	public void user_playback_for_all_Movie_carousals() {
		ExtTest.getTest().log(LogStatus.PASS, "user playback for all Movie carousals");
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);
			//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			
		}

		
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);
			//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			
		}

		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			if (getMDriver().findElement(hometabs.Resumebtn).isDisplayed())
				click(hometabs.Resumebtn, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);
			//executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			
		}

		Back();
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);

	}

	@Then("^user playback for all Tvshows carousals$")
	public void user_playback_for_all_Tvshows_carousals() {
		ExtTest.getTest().log(LogStatus.PASS, "user playback for all Tvshows carousals");

		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}

		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		try {
			if (getMDriver().findElement(playbackcontrols.play).isDisplayed())
				click(playbackcontrols.play, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		}
	}

	@Then("^user playback for all musicvideos carousals$")
	public void user_playback_for_all_musicvideos_carousals() {
		ExtTest.getTest().log(LogStatus.PASS, "user playback for all Music videos carousals");
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(1000);
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
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);

	}

	@Then("user play one content")
	public void user_play_one_content() {
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
	}

	@When("^user selects Search icon button$")
	public void user_selects_Search_icon_button() {
		// Back();
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(5000);
		click(hometabs.Searchicon, "user click Search icon button");
		ExtTest.getTest().log(LogStatus.PASS, "click searchicon");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(5000);
		setValue(hometabs.searchedit, config.getTDValue("SearchMovie"), "Entered Movie name");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.ENTER);
		// executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		for (int i = 0; i < 9; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(10000);
		Back();
	}

	@Then("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(1000);
		click(hometabs.Myaccount, "user click my account button");
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
	}

	@Then("^user playback for all Comedy carousals$")
	public void user_playback_for_all_Comedy_carousals() {
		ExtTest.getTest().log(LogStatus.PASS, "user playback for all Comedy carousals");
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(1000);
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
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_UP);
		delay(2000);

	}

	@Then("^user Apply filter for genre in movies page$")
	public void user_Apply_filter_for_genre_in_movies_page() {

		delay(5000);
		/*
		 * executeAndroidKeyCodes(AndroidKey.DPAD_UP); delay(2000);
		 * executeAndroidKeyCodes(AndroidKey.DPAD_DOWN); delay(2000);
		 * executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		 */
		// delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
	}

	@Then("^user Apply filter for genre in TVshows page$")
	public void user_Apply_filter_for_genre_in_TVshows_page() {

		for (int i = 0; i < 2; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		isElementDisplayed(hometabs.Tvshowsbtn, "click Tvshows button");
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		delay(1000);
	}

	@Then("^user Apply filter for genre in MusicVideos page$")
	public void user_Apply_filter_for_genre_in_MusicVideos_page() {
		for (int i = 0; i < 4; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		isElementDisplayed(hometabs.musicvideosbtn, "click music videos button");
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(1000);
	}

	@Then("^user Apply filter for genre in comedypage page$")
	public void user_Apply_filter_for_genre_in_comedypage_page() {
		for (int i = 0; i < 5; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		isElementDisplayed(hometabs.comedybtn, "click Comedy button");
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);

		delay(1000);
	}

	@Then("^user Verify Live TV section$")
	public void user_Verify_Live_TV_section() {

		isElementDisplayed(hometabs.Livebtn, "click Live tv button");
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(1000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
	}

	@Then("^user change content language$")
	public void user_change_content_language() {

		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		delay(5000);
		click(hometabs.Changecontentlanguage, "user click Changecontentlanguage button");

		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(1000);

		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		ExtTest.getTest().log(LogStatus.PASS, "user Selected change content language");
		delay(10000);
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

	@Then("^user click on Myaccounts$")
	public void user_click_on_Myaccounts() {

	}

	@Then("^user verify playback controls for videoqyality$")
	public void user_verify_playback_controls_for_videoqyality() {

		ExtTest.getTest().log(LogStatus.PASS, "user Selected videoqwality");
		for (int i = 0; i < 3; i++) {

			executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
			delay(5000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(10000);
		for (int i = 0; i < 3; i++) {

			executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
			delay(5000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(10000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(10000);
	}

	@Then("^user verify playback controls$")
	public void user_verify_playback_controls() {
		ExtTest.getTest().log(LogStatus.PASS, "user verifed playbackcontrols");

		executeAndroidKeyCodes(AndroidKey.MEDIA_PAUSE);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		for (int i = 0; i < 10; i++) {

			executeAndroidKeyCodes(AndroidKey.DPAD_UP_RIGHT);

		}
		// Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
		for (int i = 0; i < 4; i++) {

			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
			delay(5000);
		}
		Back();
	}

	@Then("^user click on VIEWALLMOVIES$")
	public void user_click_on_VIEWALLMOVIES() {
		Back();
		for (int i = 0; i < 4; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(1000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	}

	@Then("^user play the GENERS contents$")
	public void user_play_the_GENERS_contents() {
		delay(10000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		// click(playbackcontrols.Geners, "user click Geners button");
		delay(2000);
		click(Languages.Action, "user click Action movies");
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		Back();
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(8000);
		Back();
		
		
		try {
			if (getMDriver().findElement(Languages.Animation).isDisplayed())
				click(Languages.Animation, "user play the content");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.BACK);
		}
		
		
	
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		Back();
		Back();

	}

	@Then("^user play the Musicians contents$")
	public void user_play_the_Musicians_contents() {
		delay(10000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		// click(playbackcontrols.Geners, "user click Geners button");
		delay(2000);
		click(Languages.ArRehman, "user click Ar Rehaman musics");
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		Back();
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		try {
			if (getMDriver().findElement(Languages.Achurajamani).isDisplayed()) 
				click(Languages.Achurajamani, "user click Achurajamani musics");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.BACK);
		}
		
				
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		Back();
		Back();

	}

	@Then("^user play the Comedy contents$")
	public void user_play_the_Comedy_contents() {
		delay(10000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		// click(playbackcontrols.Geners, "user click Geners button");
		delay(2000);
		if (getMDriver().findElement(Languages.Brahmanandam).isDisplayed()) {
			click(Languages.Brahmanandam, "user click Bramanandam comedys");

			delay(2000);
		}

		else {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		}
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		Back();
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		try {
			if (getMDriver().findElement(Languages.Innocent).isDisplayed()) 
				click(Languages.Innocent, "user click Innocent comedys");
			delay(5000);
			executeAndroidKeyCodes(AndroidKey.BACK);

		} catch (NoSuchElementException | TimeoutException e) {
			executeAndroidKeyCodes(AndroidKey.BACK);
		}
		
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(2000);
		Back();
		Back();

	}

	@Then("^user Login with International user email id$")
	public void user_Login_with_International_user_email_id() {
		ExtTest.getTest().log(LogStatus.PASS, "Login with International user id");
		setValue(Login.EmailId_Txt, config.getTDValue("InternationaluserID"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("Internationaluserpassword"), "Entered password");
		delay(2000);
		Back();
		click(Login.loginBtn, "user click login button");
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	}

	@When("^user click on \"([^\"]*)\" under section \"([^\"]*)\"$")
	public void user_change_content_language(String vidName, String sectionName) {
		selectAVideo(vidName, sectionName);
		ExtTest.getTest().log(LogStatus.PASS, "Selected:" + sectionName);
	}

	@When("^user click on \"([^\"]*)\" under section a \"([^\"]*)\"$")
	public void user_change_content_lan(String vidName, String sectionName) {
		selectContent(vidName, sectionName);
		ExtTest.getTest().log(LogStatus.PASS, "Selected:" + sectionName);
	}

	@When("^user selects \"([^\"]*)\" menu$")
	public void userSelectsMenu(String menuName) {

		selectHomeMenu();
		ExtTest.getTest().log(LogStatus.PASS, "Selected Menu:" + menuName);
	}

	@When("^user selects Home menu$")
	public void userSelectsHomeMenu() {

		ExtTest.getTest().log(LogStatus.PASS, "Selected Home Menu");
		selectHomeMenu();
	}

	@When("^user goes to Homescreen and select \"([^\"]*)\" menu$")
	public void goToHomeAndSelectMenu(String menuName) {
		goBackToHomeAndSelectAMenu(menuName);
		ExtTest.getTest().log(LogStatus.PASS, "Selected Home Menu");
	}

	@Then("^user Login with Sundirectuser$")
	public void user_Login_with_Sundirectuser() {
		delay(5000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		delay(2000);
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		delay(5000);
		setValue(Login.EmailId_Txt, config.getTDValue("SundirectUserID"), "Entered EmailID");
		setValue(Login.Password_Txt, config.getTDValue("SundirectPassword"), "Entered password");
		Back();
		click(Login.loginBtn, "user click login button");
		delay(2000);
	}

	@And("^user logout for non subscriberuser$")
	public void user_logout_for_non_subscriberuser() {

		/*
		 * for (int i = 0; i < 7; i++) { executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		 * delay(2000); } click(hometabs.Settingsbtn, "user click settings button");
		 */
		delay(5000);
		for (int i = 0; i < 4; i++) {
			executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			delay(2000);
		}
		executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
	}
}