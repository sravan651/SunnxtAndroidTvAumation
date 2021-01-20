package com.sunnxt.stepdefs.android;

import com.relevantcodes.extentreports.LogStatus;
import com.sunnxt.utils.ConfigReader;
import com.sunnxt.utils.ExtReport;
import com.sunnxt.utils.ExtTest;
import com.sunnxt.utils.GlobalParams;
import com.sunnxt.utils.GlobalUtil;
import com.sunnxt.utils.HTMLReportUtil;
import com.sunnxt.utils.KeywordUtil;
import com.sunnxt.utils.LogUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	String imagePath;
	String pathForLogger;
	String testCaseDescription;

	@Before
	public void beforeMobileMethod(Scenario scenario) {
		if (scenario.getName().contains("_"))
			testCaseDescription = scenario.getName().split("_")[1];
		else
			testCaseDescription = scenario.getName();
		String testName = testCaseDescription + "_" + new GlobalParams().getDeviceName();
		ExtTest.setTest(ExtReport.getReport().startTest(testName));
		LogUtil.infoLog(getClass(),
				"\n+----------------------------------------------------------------------------------------------------------------------------+");
		LogUtil.infoLog(getClass(), "Mobile Tests Started: " + scenario.getName());

		LogUtil.infoLog("Mobile Test Environment",
				"Mobile Test is executed in OS: " + GlobalUtil.getCommonSettings().getAndroidName());
	}

	@After
	public void afterMobileMethod(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				String scFileName = "ScreenShot_" + System.currentTimeMillis();
				String screenshotFilePath = new ConfigReader().getValue("screenshotPath") + "/" + scFileName + ".png";
				imagePath = HTMLReportUtil.testFailMobileTakeScreenshot(screenshotFilePath);
				pathForLogger = ExtTest.getTest().addScreenCapture(imagePath);
				ExtTest.getTest().log(LogStatus.FAIL,
						HTMLReportUtil.failStringRedColor("Failed at point: " + pathForLogger));
				byte[] screenshot = KeywordUtil.takeMobileScreenshot(screenshotFilePath);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			LogUtil.infoLog("TestEnded",
					"Test has ended closing Application: " + GlobalUtil.getCommonSettings().getAndroidName());
		}
		ExtReport.getReport().endTest(ExtTest.getTest());
	}
}