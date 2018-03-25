package Mobile_Apps;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;

public class gestures extends ApiDemosBase {
public static void main(String args[]) throws MalformedURLException
{
	AndroidDriver<AndroidElement> driver = Capabilities();
//	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	TouchAction ta = new TouchAction(driver);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Views']")).perform();
	ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
	driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	
	ta.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofMillis(1000)).release().perform();
	System.out.println(driver.findElementById("android:id/title").getText());
	
}
}

