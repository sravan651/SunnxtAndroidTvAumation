package com.sunnxt.stepdefs.android.tv;

import com.sunnxt.utils.MobileKeywords;

public class BizComps extends MobileKeywords {
	
	public void launchHomePage() {
		execCommand("adb shell am start -n com.suntv.sunnxt/com.androidtv.myplex.ui.activity.MainActivity");
	}
}