package argos.frontwebpage.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnTab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WebDriver driver = new FirefoxDriver();
		 * driver.get("http://www.argos.co.uk"); driver.
		 */
		/*
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getPageSource());
		 * System.out.println(driver.getCurrentUrl()); // driver.close();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dannyolu\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://argos.co.uk");
		// sort this by creating a new class
		// and the main class will invoke the new class.ie
		// classobject.methodname.
		// driver1.findElement(By.className("gsfi")).sendKeys("argos");

		// driver1.findElement
		// (By("item_1_3")).click();

		driver1.findElement(By.id("primary_1")).click();

		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);

		}

		catch (Exception e) {
		}
		;

		driver1.findElement(By.className("item_1_3")).click();

		try {

			Thread.sleep(5000);

		}

		catch (Exception e) {
		}

		driver1.close();
	}
}
