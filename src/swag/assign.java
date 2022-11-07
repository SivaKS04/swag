package swag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class assign {
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
      @Test
      public void f() {
    	  driver.get("https://www.saucedemo.com/");
    	  driver.findElement(By.name("user-name")).sendKeys("standard_user");
    	  driver.findElement(By.name("password")).sendKeys("secret_sauce");
    	  driver.findElement(By.name("login-button")).click();
    	  driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
    	  driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    	  driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
    	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    	  driver.findElement(By.name("checkout")).click();
    	  driver.findElement(By.id("first-name")).sendKeys("Sivak");
    	  driver.findElement(By.id("last-name")).sendKeys("S");
    	  driver.findElement(By.id("postal-code")).sendKeys("600087");
    	  driver.findElement(By.name("continue")).click();
    	  driver.findElement(By.name("finish")).click();
      }

      @AfterTest
      
      public void afterTest() {
    	  driver.close();
		}
	
}

