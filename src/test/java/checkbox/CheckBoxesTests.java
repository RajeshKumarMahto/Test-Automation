package checkbox;

import base.BaseTests;
import org.testng.annotations.Test;

public class CheckBoxesTests extends BaseTests {

    @Test
    public void verifyCheckboxSelected(){
        var checkBoxesPage = homePage.clickOnCheckboxesLink();
        checkBoxesPage.selectCheckBox();

    }
}
