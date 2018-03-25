package Mobile_Apps;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomatorTest extends ApiDemosBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//use UiSelector() for working on the properties. and not the attribures and values
		int clicksize = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println(clicksize);
	}
}
