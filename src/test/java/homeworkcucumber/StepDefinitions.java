package homeworkcucumber;


import dataProvider.ConfigFileReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StepDefinitions {

     WebDriver driver;


    @Given("user goes to the {string}")
    public void userGoesToThe(String pageUrl) {
        driver.get(pageUrl);

    }
    @Then("user waits for 5 seconds")
    public void userWaitsForFiveSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @And("verifies that the page title contains the word {string}")
    public void verifyPageTitle(String title) {
        String pageTitle = driver.getTitle();
        Assertions.assertTrue(pageTitle.contains(title));
    }
  @Before
    public void openBrowser(){
      driver = new ChromeDriver();
      driver.manage().window().maximize();

    }
    @And("closes the page")
    public void closePage(){
        driver.close();
    }
}




