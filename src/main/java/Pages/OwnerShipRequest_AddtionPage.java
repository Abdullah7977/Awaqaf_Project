package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OwnerShipRequest_AddtionPage extends PageBase {
    private By AreaField= By.xpath("//select[@name='Area']");
    private By advNo=By.xpath("//input[@name='AdvNo']");
    private By govName=By.xpath("//select[@name='Province']");
    private By markz=By.xpath("//input[@name='Markaz']");
    private By address=By.xpath("//input[@name='Address']");
    private By job=By.xpath("//input[@name='job']");
    private By nationalIdSource=By.xpath("//input[@name='NationalIdSource']");
    private By nationalIdDate=By.xpath("//input[@name='NationalIDDate']");
    //////////////////////////////////////////////////////////////////////////////////////////
    private By rakamMahal=By.xpath("//input[@name='RakamMahal']");
    private By buildingNo=By.xpath("//input[@name='MahalBuildingNo']");
    private By mahalStreet=By.xpath("//input[@name='MahalStreet']");
    private By mahalMarkaz=By.xpath("//input[@name='MahalMarkaz']");
    private By statusOfPayment=By.xpath("//input[@name='StatusOfPayment']");
    private By contractStartDate=By.xpath("//input[@name='ContractStartDate']");
    private By contractEndDate=By.xpath("//input[@name='ContractEndDate']");
    private By textArea=By.xpath("//textarea[@name='Notes']");
    private By attachement=By.xpath("//input[@id='files']");
    private By sendBtn=By.cssSelector("[type='submit']");

    //methods
    public OwnerShipRequest_AddtionPage(WebDriver driver) {
        super(driver);
    }

    public void selectArea(int no){
        selectFromDropDownByIndex(AreaField,no);
    }
    public void setAdvNo(String text){
        setText(advNo,text);
    }
    public void setMarkz(String text){
        setText(markz,text);
    }
    public void selectGovernment(int num){
        selectFromDropDownByIndex(govName,num);
    }
    public void setAddress(String address1){
        setText(address,address1);
    }
    public void setJob(String jobText){
        setText(job,jobText);
    }
    public void setNationalIdSource(String sourceText){
        setText(nationalIdSource,sourceText);
    }
   public void setnationalId_Date(String date){
        setText(nationalIdDate,date);
   }

    public void setRakamMahal(String rakmmahlNo) {
        setText(rakamMahal,rakmmahlNo);
    }
    public void setBuildingNo(String buildingno){
        setText(buildingNo,buildingno);
    }
    public void setstreet(String Street){
        setText(mahalStreet,Street);
    }
    public void setMahalMarkaz(String mahalMarkaz1){
        setText(mahalMarkaz,mahalMarkaz1);
    }
    public void setStatusOfPayment(String status){
        setText(statusOfPayment,status);
    }
    public void setContractStartDate(String sDate){
        setText(contractStartDate,sDate);
    }
    public void setContractEndDate(String eDate){
        setText(contractEndDate,eDate);
    }
    public void setTextArea(String text){
        setText(textArea,text);
    }
    public void upLoadAttachement(String absloutePath){
        WebElement element = driver.findElement(attachement);
        String script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script,element);
        setText(attachement,absloutePath);
    }
    public void sendRequest(){
        WebElement element = driver.findElement(sendBtn);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
}