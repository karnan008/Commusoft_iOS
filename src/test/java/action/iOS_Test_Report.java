package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.drivers.ios.IOSDriver;

public class iOS_Test_Report extends Wrapper2{

	//public IOSDriver<MobileElement> kdriver;
	
	
	
	public static DesiredCapabilities getCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Commusoft");
		capabilities.setCapability(MobileCapabilityType.UDID, "d7cbb47d9598a870094d7cd584a35339217a4b09");
		//capabilities.setCapability(MobileCapabilityType.UDID, "00008030-000244A40A20402E");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.commusoft.commusoftv2");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Commusoft");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
		
		System.out.println();
		return capabilities;
	}


	

















	@BeforeTest
	public void setup() throws Exception {
		kdriver = new IOSDriver<MobileElement>((dev), getCapabilities(), "Commusoft iOS Test");
	}




}
