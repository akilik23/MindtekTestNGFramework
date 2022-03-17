package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreAppLoginPage {
    public StoreAppLoginPage(){

        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="email_create")
    public WebElement registerEmailBox;

    @FindBy(id="SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id="email")
    public WebElement sighInEmailBox;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id="SubmitLogin")
    public WebElement login;

    public void sighIn(String username, String password){
        sighInEmailBox.sendKeys(username);
        this.password.sendKeys(password);
        login.click();

    }

}
