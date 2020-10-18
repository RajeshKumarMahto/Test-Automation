package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
//    private By formAuthentivationLink = By.linkText("Form Authentication");

    public  HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickOnLink("form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clickOnLink("Dropdown");
        return new DropdownPage(driver);
    }
    public CheckBoxesPage clickOnCheckboxesLink(){
        clickOnLink("Checkboxes");
        return new CheckBoxesPage(driver);
    }
    private void clickOnLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
