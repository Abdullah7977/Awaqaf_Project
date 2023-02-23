package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageBase {
    //fields
      private By register_btn= By.xpath("//nav[@id='navbar']/ul/li[10]/button/span");
      private By login_btn=By.xpath("//div[@id='exampleModal']/div/div/div/div/ul/li[2]/a");
      private By welcomeField=By.xpath("//form[@id='logoutForm']/li[4]/span");

      private By electronicServices=By.xpath("//nav[@id='navbar']/ul/li[4]/a");
      private By addOwnerShip_Request=By.xpath("//nav[@id='navbar']/ul/li[4]/ul/li[2]/a");
      private By addCompliant=By.xpath("//nav[@id='navbar']/ul/li[4]/ul/li[4]/a");
   //constructors
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //methods
    public SignUp_Page click_SignUp(){
        click(register_btn);
        return new SignUp_Page(driver);
    }
    public LoginPage click_Login(){
          click(register_btn);
          click(login_btn);
          return new LoginPage(driver);
    }
    public String getText(){
        String actualtext=driver.findElement(welcomeField).getText();
        return actualtext;
    }
    public OwnerShipRequest_AddtionPage moveTOAddOwnerShipRequest(){
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(electronicServices)).build().perform();
        click(addOwnerShip_Request);
        return new OwnerShipRequest_AddtionPage(driver);
    }
    public Addtion_ComplaintPage moveToAddComplaint(){
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(electronicServices)).build().perform();
        click(addCompliant);
        return new Addtion_ComplaintPage(driver);
    }

}
