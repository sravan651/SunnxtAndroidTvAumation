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
	}

	public void selectAVideo(String videoTitle, String section) {
		delay(10000);
		executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
	
		for (int i = 0; i < 45; i++) {
			try {
				if (!getMDriver()
						.findElement(By.xpath(
								"(//*[@focused='true']//ancestor::androidx.recyclerview.widget.RecyclerView)[2]"))
						                .getAttribute("content-desc").equals(section))
					
					executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				//delay(10000);
				else 
					break;
			}
			 catch (NoSuchElementException | TimeoutException e) {
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
						.findElement(By.xpath("//android.widget.FrameLayout[@focused='true']"));
				if (!videoTile.findElement(By.className("android.widget.TextView")).getAttribute("text")
						.equals(videoTitle))
					executeAndroidKeyCodes(AndroidKey.DPAD_RIGHT);
				else {
					executeAndroidKeyCodes(AndroidKey.DPAD_CENTER);
					break;
				}
			}
		}
	}
	

	public void selectMenu(String menuName) {
		delay(10000);
		
		executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
		for (int i = 0; i < 7; i++) {
			try {
				//androidx.recyclerview.widget.RecyclerView[@content-desc="Navigation menu"]

				if (!getMDriver().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc='Navigation menu']//android.widget.TextView[@text='"+ menuName + "']"))
						.getAttribute("focused").equals("true"))
					executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
				
				else {
					//executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
					break;
				}
			} catch (NoSuchElementException | TimeoutException e) {
				executeAndroidKeyCodes(AndroidKey.DPAD_DOWN);
			}
		}
	}
}