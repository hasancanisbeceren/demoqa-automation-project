import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_name_lastname_email extends BaseTest {


    @Test
    public void setName(){
        PraticeFormPage praticeFormPage = new PraticeFormPage(driver);
        praticeFormPage.setName("carlo");
        Assertions.assertEquals("carlo",praticeFormPage.getName(), "Name valuew is not correct!!!");
    }
    @Test
    public void lastName(){
        PraticeFormPage praticeFormPage = new PraticeFormPage(driver);
        praticeFormPage.setLastName("hasan");
        Assertions.assertEquals("hasan",praticeFormPage.getLastName(), "Name valuew is not correct!!!");
    }
    @Test
    public void setEmail(){
        PraticeFormPage praticeFormPage = new PraticeFormPage(driver);
        praticeFormPage.setEmail("hasancanisbeceren@icloud.com");
        Assertions.assertEquals("hasancanisbeceren@icloud.com",praticeFormPage.getEmail(), "Name valuew is not correct!!!");
    }
}
