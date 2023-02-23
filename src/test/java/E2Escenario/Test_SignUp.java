package E2Escenario;

import Pages.SignUp_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_SignUp extends TestBases{

    @Test
    public void test_SignUp() throws IOException {
        SignUp_Page signObj=homePage.click_SignUp();
         signObj.setFirstName("abdo");
         signObj.setLastName("ahmed");
         signObj.setEmail("abdo@user325.com");
         signObj.setPassword("AbdoCivil123/");
         signObj.setConfirmPass("AbdoCivil123/");
         signObj.setCaptcha();
    }
}
