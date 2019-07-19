package StepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.KatalonFormPage;

public class MyStepdefs {
    KatalonFormPage katalonFormPage;
    WebDriver driver;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkalra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        katalonFormPage = new KatalonFormPage(driver);
    }



    @Given("^user navigates to the page$")
    public void userNavigatesToThePage() {
        driver.get("http:\\katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @When("^user fills the first name \"([^\"]*)\"$")
    public void userFillsTheFirsName(String firstName) throws Throwable {
        katalonFormPage.setFirstName(firstName);

    }

    @And("^user fills the last name \"([^\"]*)\"$")
    public void userFillsTheLastName(String lastName) throws Throwable {
        katalonFormPage.setLastName(lastName);

    }

    @And("^user fills the gender$")
    public void userFillsTheGender() {
        katalonFormPage.setGender();

    }

    @And("^user fills the date of birth \"([^\"]*)\"$")
    public void userFillsTheDateOfBirth(String dob) throws Throwable {
        katalonFormPage.setDateOfBirth(dob);

    }

    @And("^user fills the address$")
    public void userFillsTheAddress() {
        katalonFormPage.setAddress("2319 w Warren blvd");

    }

    @And("^user fills the email$")
    public void userFillsTheEmail() {
        katalonFormPage.setEmail("Rviko131@gmail.com");

    }

    @And("^user fills the password$")
    public void userFillsThePassword() {
        katalonFormPage.setPassword("smart");

    }

    @And("^user fills company$")
    public void userFillsCompany() {
        katalonFormPage.setCompany("Google");

    }

    @And("^user select role$")
    public void userSelectRole() {
        katalonFormPage.setRoleDropdown("QA");

    }

    @And("^user select job expectations$")
    public void userSelectJobExpectations() {
        katalonFormPage.setThreeExpectations("Good teamwork", "High salary", "Challenging");

    }

    @And("^user select ways of development$")
    public void userSelectWaysOfDevelopment() {
        katalonFormPage.selectThreeRandomWaysOfDevelopment();

    }

    @And("^user fills comment$")
    public void userFillsComment() {
        katalonFormPage.setComment("I'm the best candidate for this position");

    }

    @And("^user click submit button$")
    public void userClickSubmitButton() throws InterruptedException {
        katalonFormPage.submitForm();
    }

    @Then("^form is submitted$")
    public void formIsSubmitted() {
        WebElement checkMessage = driver.findElement(By.id("submit-msg"));
        Assert.assertTrue(checkMessage.isDisplayed());

    }

    @After
    public void closing(){
        driver.quit();
    }



}
