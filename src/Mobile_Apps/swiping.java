package Mobile_Apps;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swiping extends ApiDemosBase {
public static void main (String args[]) throws MalformedURLException
{
	AndroidDriver<AndroidElement> driver = Capabilities();
//	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	TouchAction ta = new TouchAction(driver);	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']")).perform();
	driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	//Android does not support $ or any other special character in values.
	driver.findElementByXPath("//*[@content-desc='9']").click();
	// for swipping we use move to() i.e. web elem(src).moveTO(dest web elem)
	ta.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofMillis(1000))
	.moveTo(driver.findElementByXPath("//*[@content-desc='45']")).perform();
}
}
