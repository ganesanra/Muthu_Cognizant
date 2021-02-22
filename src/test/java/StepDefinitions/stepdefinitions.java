package StepDefinitions;

import java.util.List;
import org.openqa.selenium.WebElement;
import PageObjects.HomePage;
import Utility.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitions extends Base {

	String article;
	String ExpectedTitle;
	HomePage h;
	
	@Given("user launches  Guardian website")
	public void user_launches_guardian_website() throws Exception {
		driver = Base.getDriver();
	}

	@When("user launched the website successfully")
	public void user_launched_the_website_successfully() {

		ExpectedTitle = driver.getTitle();
	}

	@Then("user should be able to Validate the title {string}")
	public boolean user_should_be_able_to_read_the_article(String ActualTitle) {

		if (ExpectedTitle.contains(ActualTitle))
			return true;
		else
			return false;
	}

	@And("^user reads the First Article on the page$")
	public void user_reads_the_first_article_on_the_page() throws Throwable {

		h = new HomePage(driver);
		article = h.getFirstArticle().getText();
		System.out.println(article);

	}

	@When("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) throws Throwable {
		driver.navigate().to(url);
		WebElement Search = h.getSearchTextbox();
		Search.sendKeys(article);
		Search.submit();
		h.newsicon().click();

	}

	@Then("^the user validates the article in other source$")
	public void the_user_validates_the_article_in_other_source() throws Throwable {

		List<WebElement> newsheader = h.newslist();
		for (WebElement n1 : newsheader) {
			if (n1.getText().contains("The Guardian"))
				continue;
			else
				System.out.println(n1.getText());
			System.out.println("Articles matched");
			break;

		}

	}
	@After
	public void Aftervaldiation()
	{
		driver.close();
	}

}
