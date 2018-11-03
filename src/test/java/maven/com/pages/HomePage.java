package maven.com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
WebDriver driver=null;





@FindBy(how=How.ID,using="openwindow")
@CacheLookup
WebElement openwind;
//Select 
@FindBy(how=How.ID, using ="dropdown-class-example")
WebElement drop;


public HomePage(WebDriver ldriver) {
	//this.driver=ldriver;
	PageFactory.initElements(ldriver, this);
}

//Function for select drop down
public void selectFunction() {
	Select sel = new Select(drop);
	sel.selectByValue("option1");
}


//function for Open window
public void OpenWindow() {
openwind.sendKeys(Keys.RETURN);	
}

}