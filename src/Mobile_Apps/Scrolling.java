package Mobile_Apps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends ApiDemosBase {
public static void main(String args[]) throws MalformedURLException
{
	AndroidDriver<AndroidElement> driver = Capabilities();
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Appium is not supporting any material for scrolling we need to use Android methods.
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	

}
}
