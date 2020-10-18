package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelctOption(){
        String option = "Option 1";
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1,"Incorrect number of Selection");
        Assert.assertTrue(selectedOptions.contains(option), "Option did not selected");
    }
}
