package Pages;

import com.asprise.ocr.Ocr;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.URL;
public class SignUp_Page extends PageBase {

    public SignUp_Page(WebDriver driver) {
        super(driver);
    }
    private By firstName= By.id("FirstName");
    private By lastName=By.id("LastName");
    private By email=By.id("Email");
    private By password=By.id("Password");
    private By confirm_password=By.id("ConfirmPassword");
    private By captcha=By.id("CaptchaImage");
    private By captchText=By.id("CaptchaInputText");
    public String getCapatcha() throws IOException {
        String imageUrl=driver.findElement(captcha).getAttribute("src");

        System.out.println("Image source path : \n"+ imageUrl);

        URL url = new URL(imageUrl);

        Image image = ImageIO.read(url);

        String s = new Ocr().recognize((RenderedImage)image,Ocr.RECOGNIZE_TYPE_BARCODE,"");

        System.out.println("Text From Image : \n"+ s);

        System.out.println("Length of total text : \n"+ s.length());
        return s;
    }
    public void setFirstName(String name1){
        setText(firstName,name1);
    }
    public void setLastName(String name2){
        setText(lastName,name2);
    }
    public void setEmail(String emailfield){
        setText(email,emailfield);
    }
    public void setPassword(String passwordtext){
        setText(password,passwordtext);
    }
    public void setConfirmPass(String passwordText){
        setText(confirm_password,passwordText);
    }
    public void setCaptcha() throws IOException {
        String script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script,captchText);
        String captcha= getCapatcha();
        setText(captchText,captcha);
    }
}
