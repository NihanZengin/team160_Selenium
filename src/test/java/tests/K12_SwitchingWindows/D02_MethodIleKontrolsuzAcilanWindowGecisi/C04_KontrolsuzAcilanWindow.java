package tests.K12_SwitchingWindows.D02_MethodIleKontrolsuzAcilanWindowGecisi;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase_Each;

import java.util.Set;

public class C04_KontrolsuzAcilanWindow extends TestBase_Each {

    @Test
    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        // sayfadaki elemental selenium linkini tiklayin

        driver.findElement(By.xpath("//*[.='Elemental Selenium']")).click();


        // acilan yeni window'a gecip
        // gecisi yeni window'un title'ini kullanarak yapin

        // 1- acik olan tum window'larin WHD'lerini alip kaydedelim

        Set<String> acikWindowlarinWhdleri=driver.getWindowHandles();

        //[074939BC4B25DC0CE37FF5EA9A9C3485, 3C5E74DA2EE7E4B728276EBF1DD5750B]

        String hedefWinbdowTitel="Home | Elemental Selenium";

        for (String eachWhd:acikWindowlarinWhdleri){
            driver.switchTo().window(eachWhd);
        // gectigimiz windowun titel alip
            //gecmek istedigimizin titel ile esit mi kontrol edelim
        }



        // buyuk basligin "Elemental Selenium" oldugunu test edin

    }
}
