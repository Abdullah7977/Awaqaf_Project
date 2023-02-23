package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PageBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public PageBase(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public static void setText(By element, String text) {

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).sendKeys(text);

    }


    public static void click(By element) {

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element))).click();

    }

    public static void selectFromDropDownByIndex(By element, int index) {

        new Select(wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)))).selectByIndex(index);


    }

    public static List<String> getTextOfWebElemets(List<WebElement> elements) {

        List<String> textofelements = new ArrayList<>();
        for (WebElement element : elements) {

            textofelements.add(wait.until(ExpectedConditions.visibilityOf(element)).getText());

        }


        return textofelements;
    }
}
