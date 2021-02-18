package com.sunnxt.stepdefs.android.tv;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import com.sunnxt.utils.MobileKeywords;

import io.appium.java_client.android.nativekey.AndroidKey;

public class BizComps extends MobileKeywords {

	public void launchHomePage() {
		execCommand("adb shell am start -n com.suntv.sunnxt/com.androidtv.myplex.ui.activity.MainActivity");
		 delay(5000);
	}

	public void selectAVideo(String videoTitle, String section) {
		delay(10000);
		Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);

		for (int i = 0; i < 45; i++) {
			try {
				if (!getMDriver()
						.findElement(By.xpath(
								"(//*[@focused='true']//ancestor::androidx.recyclerview.widget.RecyclerView)[2]"))
						.getAttribute("content-desc").equals(section))

					executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				// delay(10000);
				else
					break;
			} catch (NoSuchElementException | TimeoutException e) {
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			}
		}

		if (section.equalsIgnoreCase("VIEW ALL MOVIES")) {
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		}
		if (section.equalsIgnoreCase("View All")) {
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		}
		if (section.equalsIgnoreCase("VIEW ALL MUSIC VIDEOS")) {
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		} else {
			for (int i = 0; i < 20; i++) {
				WebElement videoTile = getMDriver()
						.findElement(By.xpath("//android.widget.FrameLayout[@focused='false']"));
				if (!videoTile.findElement(By.className("android.widget.TextView")).getAttribute("text")
						.equals(videoTitle))
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				  
				else {
					executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
					break;
				}
			}
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		}
	}

	public void selectContent(String videoTitle, String section) {
		delay(10000);
		//Back();
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);

		for (int i = 0; i < 45; i++) {
			try {
				if (!getMDriver()
						.findElement(By.xpath(
								"(//*[@focused='true']//ancestor::androidx.recyclerview.widget.RecyclerView)[2]"))
						.getAttribute("content-desc").equals(section))

					executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				// delay(10000);
				else
					break;
			} catch (NoSuchElementException | TimeoutException e) {
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			}
		}

		if (section.equalsIgnoreCase("VIEW ALL MOVIES")) {
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		}
		if (section.equalsIgnoreCase("View All")) {
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		}
		if (section.equalsIgnoreCase("VIEW ALL MUSIC VIDEOS")) {
			executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
		} /*else {
			for (int i = 0; i < 20; i++) {
				WebElement videoTile = getMDriver()
						.findElement(By.xpath("//android.widget.FrameLayout[@focused='false']"));
				if (!videoTile.findElement(By.className("android.widget.TextView")).getAttribute("text")
						.equals(videoTitle))
					executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);*/
				else {
					executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
					//break;
				}
			}
		
	
	public void selectMenu(String menuName) {
		delay(10000);
		try {
			if (getMDriver().findElements(By.xpath(
					"//androidx.recyclerview.widget.RecyclerView[@content-desc='Navigation menu']//android.widget.TextView[@text='Music Videos']"))
					.size() == 0)
				executeAndroidKeyCodes(AndroidKey.BACK);
		} catch (NoSuchElementException e) {
		}
		for (int i = 0; i < 7; i++) {
			try {
				if (!getMDriver().findElement(By.xpath(
						"//androidx.recyclerview.widget.RecyclerView[@content-desc='Navigation menu']//android.widget.TextView[@text='"
								+ menuName + "']"))
						.getAttribute("focused").equals("true"))
					executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				else {
					break;
				}
			} catch (NoSuchElementException | TimeoutException e) {
			}
		}
	}

	public void goBackToHomeAndSelectAMenu(String menuName) {
		for (int i = 0; i < 7; i++) {
			try {
				if (getMDriver().findElements(By.xpath(
						"//androidx.recyclerview.widget.RecyclerView[@content-desc='Navigation menu']//android.widget.TextView[@text='Music Videos']"))
						.size() == 0)
					executeAndroidKeyCodes(AndroidKey.BACK);
				else {
					break;
				}
			} catch (NoSuchElementException | TimeoutException e) {
				executeAndroidKeyCodes(AndroidKey.BACK);
			}
		}
		selectMenu(menuName);
		delay(10000);
	}

	public void selectHomeMenu() {
		delay(10000);

		// executeAndroidKeyCodes(AndroidKey.BACK);
		for (int i = 0; i < 7; i++) {
			try {

				if (!getMDriver().findElement(By.xpath(
						"//androidx.recyclerview.widget.RecyclerView[@content-desc='Navigation menu']//android.widget.TextView[@text='Movies']"))
						.getAttribute("focused").equals("false"))
					executeAndroidKeyCodes(AndroidKey.BACK);
				// Back();
				else {
					break;
				}
			} catch (NoSuchElementException | TimeoutException e) {
				executeAndroidKeyCodes(AndroidKey.DPAD_UP);
				delay(2000);
				executeAndroidKeyCodes(AndroidKey.DPAD_UP);
				delay(2000);
				executeAndroidKeyCodes(AndroidKey.DPAD_LEFT);
				delay(2000);
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				delay(2000);

			}
		}

	}

	public void Homepage(String videoTitle, String section) {
		delay(10000);
		// executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
		Back();

		for (int i = 0; i < 45; i++) {
			try {
				if (!getMDriver()
						.findElement(By.xpath(
								"(//*[@focused='true']//ancestor::androidx.recyclerview.widget.RecyclerView)[2]"))
						.getAttribute("content-desc").equals(section))

					executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				// delay(10000);
				else
					break;
			} catch (NoSuchElementException | TimeoutException e) {
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			}
		}
	}
}