package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPage {
    private WebDriver driver;

    private By checkbox = By.cssSelector("#checkboxes input[type='checkbox']");

    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCheckBox() {
        getCheckBoxList();


    }

    private void getCheckBoxList() {
        List<WebElement> checkBoxesName = driver.findElements(checkbox);
        for (WebElement e : checkBoxesName) {
            System.out.println(e);
        }

    }
}
