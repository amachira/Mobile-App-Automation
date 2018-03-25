package Mobile_Apps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApiDemos1 extends ApiDemosBase{
	
	public static void main(String args[]) throws MalformedURLException
	{
	AndroidDriver<AndroidElement> driver = Capabilities();
	driver.findElement(By.xpath("//android.widget.TextView[@text='API Demos']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
	driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Hello");
	//driver.findElementsByAndroidUIAutomator("class('android.widget.Button')").get(2).click();	
	driver.findElementsByClassName("android.widget.Button").get(1).click();
	}
}
