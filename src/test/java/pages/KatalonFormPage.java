package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class KatalonFormPage {
    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"infoForm\"]/div[3]/div/div/label[2]")
    private WebElement genderInput;

    @FindBy(id = "dob")
    private WebElement dateOfBirthInput;

    @FindBy(id = "address")
    private WebElement addressInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "company")
    private WebElement companyInput;

    @FindBy(id = "role")
    private WebElement roleDropdownInput;

    @FindBy(id = "expectation")
    private WebElement expectationInput;

    @FindBy(id = "comment")
    private WebElement commentInput;


    @FindBys(@FindBy(xpath = "//input[@type='checkbox']"))
    private List<WebElement> waysOfDevelopment;

    @FindBy(id = "submit")
    private WebElement submitBtm;


    public void setFirstName(String firstName ) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public void setGender() {
        genderInput.click();
    }

    public void setDateOfBirth(String dateOfBirth) {
        dateOfBirthInput.clear();
        dateOfBirthInput.sendKeys(dateOfBirth);
    }

    public void setAddress(String address) {
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void setEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void setCompany(String company) {
        companyInput.clear();
        companyInput.sendKeys(company);
    }

    public void setRoleDropdown(String roleInDropdown) {
        Select roleDropdown = new Select(roleDropdownInput);
        roleDropdown.selectByVisibleText(roleInDropdown);


    }

    public void setThreeExpectations(String expectation1, String expectation2, String expectation3) {
        Select expectation = new Select(expectationInput);
        expectation.selectByVisibleText(expectation1);
        expectation.selectByVisibleText(expectation2);
        expectation.selectByVisibleText(expectation3);
    }

    public void selectThreeRandomWaysOfDevelopment() {
        waysOfDevelopment.clear();
        Random random = new Random();
        HashSet<Integer> set = new HashSet<Integer>(3);
        while (set.size() < 3) {
            set.add(random.nextInt(waysOfDevelopment.size()));
        }
        System.out.println(set);
        for (int i : set) {
            waysOfDevelopment.get(i).click();
        }
    }

    public void setComment(String comment) {
        commentInput.clear();
        commentInput.sendKeys(comment);
    }


    public void submitForm() throws InterruptedException {
        submitBtm.click();
        Thread.sleep(3000);
    }

    public KatalonFormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
