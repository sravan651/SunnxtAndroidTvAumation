package com.sunnxt.locators.android.tv;

import org.openqa.selenium.By;

public class AndroidTVLocators {
	public static class SampleClass {
		public static By sampleTxt = By.id("test");
	}
	
	public static class hometabs
	{
		public static By Homebtn = By.xpath("(//*[@text='Home'])");
		
		public static By Redtrailar = By.xpath("(//*[@text='Red Trailer'])");
		public static By Moviesbtn = By.xpath("(//*[@text='Movies'])");
		public static By Tvshowsbtn = By.xpath("(//*[@text='TV Shows'])");
		public static By Livebtn = By.xpath("(//*[@text='Live TV'])");
		public static By musicvideosbtn = By.xpath("(//*[@text='Music Videos'])");
		public static By comedybtn = By.xpath("(//*[@text='Comedy'])");
		public static By Settingsbtn = By.xpath("(//*[@text='Settings'])");
		public static By Searchbtn = By.xpath("//android.widget.ImageView[@content-desc=\"Search Action\"]");
	}
	
	public static class TvLogin
	{
		public static By Enterusername = By.id("com.suntv.sunnxt:id/uname_text");
		public static By Enteruserpassword = By.id("com.suntv.sunnxt:id/pwd_text");
		public static By clicklogin = By.id("com.suntv.sunnxt:id/login_button");
		public static By loginQRcode = By.id("com.suntv.sunnxt:id/qr_code_button");
		
		
	}
	public static class Languages
	{
		public static By Telugu = By.xpath("(//*[@text='Telugu'])");
		public static By Tamil = By.xpath("(//*[@text='Telugu'])");
		public static By malayalam = By.xpath("(//*[@text='malayalam'])");
		public static By Bengali = By.xpath("(//*[@text='Bengali'])");
		public static By ok = By.xpath("(//*[@text='OK'])");
		

	}
	public static class playbackcontrols
	{
		public static By play = By.xpath("(//*[@text='PLAY'])");
		public static By Fastfarward = By.xpath("//android.widget.ImageView[@content-desc=\"Fast Forward\"]");
		public static By Rewind = By.xpath("//android.widget.ImageView[@content-desc=\"Rewind\"]");
		public static By Skipnext = By.xpath("//android.widget.ImageView[@content-desc=\"Skip Next\"]");

		
		
	}
}
