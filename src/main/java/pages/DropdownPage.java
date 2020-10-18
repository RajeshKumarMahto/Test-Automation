package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        findDropDownElements().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedDropdownElements = findDropDownElements().getAllSelectedOptions();
        return selectedDropdownElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElements() {
        return new Select(driver.findElement(dropdown));
    }
}
