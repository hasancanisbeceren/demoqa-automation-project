import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest {

    @Test
    public void check_male_radio_button() {
        PraticeFormPage praticeFormPage = new PraticeFormPage(driver);
        praticeFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(praticeFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male radio button is not checked");
    }
    @Test
    public void check_female_radio_button(){
        PraticeFormPage praticeFormPage = new PraticeFormPage(driver);
        praticeFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(praticeFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not checked");
    }
    @Test
    public void check_other_radio_button(){
        PraticeFormPage praticeFormPage = new PraticeFormPage(driver);
        praticeFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(praticeFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not checked");
    }

}
