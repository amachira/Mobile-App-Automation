package Mobile_Apps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class dragAndDrop extends ApiDemosBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		TouchAction ta = new TouchAction(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Views']")).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		ta.longPress(driver.findElementsByClassName("android.view.View").get(0)).moveTo(driver.findElementsByClassName("android.view.View").get(1)).release().perform();
		
	}

}
