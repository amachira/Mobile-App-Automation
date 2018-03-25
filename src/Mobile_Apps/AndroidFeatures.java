package Mobile_Apps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class AndroidFeatures extends ApiDemosBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	AndroidDriver<AndroidElement> driver = Capabilities();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println(driver.currentActivity());
//	driver.hideKeyboard();
	System.out.println(driver.getContext());
	System.out.println(driver.getOrientation());
	System.out.println(driver.isLocked());
	TouchAction ta = new TouchAction(driver);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Views']")).perform();
	
	driver.pressKeyCode(AndroidKeyCode.BACK);
	driver.pressKeyCode(AndroidKeyCode.HOME);
	
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_MEDIA_AUDIO_TRACK);
	
	
		
	}

}
