package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By emailField= By.xpath("(//input[@id='Email'])[2]");
    private By passwardField=By.xpath("(//input[@id='Password'])[2]");
    private By enterfield=By.xpath("//input[@value='دخول']");
    public void setEmail_login(String EmailText){
        setText(emailField,EmailText);
    }
    public void setPasswardField(String Password){
        setText(passwardField,Password);
    }
    public void click_Login(){
        click(enterfield);
    }
}
