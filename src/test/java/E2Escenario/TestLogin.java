package E2Escenario;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestBases{
    @Test
    public void testLogin(){
        LoginPage login_Obj=homePage.click_Login();
        login_Obj.setEmail_login("abdo.ahmed@user.com");
        login_Obj.setPasswardField("AbdoCivil7412*");
        login_Obj.click_Login();
       String actualResult= homePage.getText();
        Assert.assertEquals(actualResult,"مرحبا :");
    }
}
