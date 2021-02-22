package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstArticle() {
		return driver.findElement(By.xpath("//*[@class='u-faux-block-link__cta fc-item__headline']"));
	}

	public WebElement getSearchTextbox() {
		return driver.findElement(By.name("q"));
	}

	public WebElement newsicon() {
		return driver.findElement(By.xpath("//a[@class='hide-focus-ring']"));
	}

	public List<WebElement> newslist() {

		return driver.findElements(By.xpath("//*[@class='yr3B8d KWQBje']/div[2]"));

	}
}
