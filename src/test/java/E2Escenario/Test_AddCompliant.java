package E2Escenario;

import Pages.Addtion_ComplaintPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class Test_AddCompliant extends TestBases{
    @Test
    public void TestAdd_Compliant(){
        LoginPage login_Obj=homePage.click_Login();
        login_Obj.setEmail_login("abdo.ahmed@user.com");
        login_Obj.setPasswardField("AbdoCivil7412*");
        login_Obj.click_Login();
        Addtion_ComplaintPage newCompliantObj =homePage.moveToAddComplaint();
        newCompliantObj.createComplaint_request("shoubra","01221765034","you should check validation of phone");
        newCompliantObj.send_CompliantRequest();

    }
}
