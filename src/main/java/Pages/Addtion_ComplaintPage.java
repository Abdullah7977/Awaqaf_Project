package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addtion_ComplaintPage extends PageBase{
    //constructors
    public Addtion_ComplaintPage(WebDriver driver) {
        super(driver);
    }
    //Fields
    private By compliantRadioBtn= By.xpath("//input[@id='ComplainType']");
    private By inquiringRadioBtn=By.xpath("(//input[@id='ComplainType'])[2]");
    private By address=By.xpath("//input[@id='Address']");
    private By mobilePhone=By.xpath("//input[@id='PhoneNo']");
    private By complaintSubject=By.xpath("//textarea[@id='Subject']");
    private By sendCompliant=By.xpath("//button[@type='submit']");
    //methods
    public void createComplaint_request(String address1,String phone,String comp){
        click(compliantRadioBtn);
        setText(address,address1);
        setText(mobilePhone,phone);
        setText(complaintSubject,comp);
    }
    public void send_CompliantRequest(){
        WebElement element = driver.findElement(sendCompliant);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
