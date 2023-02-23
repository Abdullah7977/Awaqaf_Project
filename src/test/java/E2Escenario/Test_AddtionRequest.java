package E2Escenario;

import Pages.LoginPage;
import Pages.OwnerShipRequest_AddtionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_AddtionRequest extends TestBases {
    @Test
    public void TestAdd_Request(){
        LoginPage login_Obj=homePage.click_Login();
        login_Obj.setEmail_login("abdo.ahmed@user.com");
        login_Obj.setPasswardField("AbdoCivil7412*");
        login_Obj.click_Login();
        OwnerShipRequest_AddtionPage requestObj =homePage.moveTOAddOwnerShipRequest();
        requestObj.selectArea(2);
        requestObj.setAdvNo("4");
        requestObj.selectGovernment(6);
        requestObj.setMarkz("cairo");
        requestObj.setAddress("cairo");
        requestObj.setJob("tester");
        requestObj.setNationalIdSource("cairo");
        requestObj.setnationalId_Date("9/9/2020");
        requestObj.setRakamMahal("10");
        requestObj.setBuildingNo("9");
        requestObj.setstreet("street2");
        requestObj.setMahalMarkaz("shoubra");
        requestObj.setContractStartDate("8/20/2022");
        requestObj.setContractEndDate("12/8/2022");
        requestObj.setTextArea("لقد الاختبار اتوماتيكي");
        requestObj.upLoadAttachement("D:\\Awakaf_project\\attachements\\RELATIONSHIPLETTER.pdf");
        requestObj.sendRequest();
        String actualResult= homePage.getText();
        Assert.assertEquals(actualResult,"مرحبا :");
    }
}
