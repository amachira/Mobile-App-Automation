package Mobile_Apps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosBase {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
System.out.println("Mobile Application");
File f = new File("src");
File fs= new File(f,"ApiDemos-debug.apk");
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo3");
cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
//AndroidDriver ad = new AndroidDriver(connectiontoserverlink.cap);
AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
return driver;
    }

	
}
