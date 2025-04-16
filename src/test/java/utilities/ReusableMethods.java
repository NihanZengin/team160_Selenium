package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    public static void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep komutu calismadi");
        }
    }

    public static List<String> stringListeDondur(List<WebElement> webElementListesi){

        List<String> stringList = new ArrayList<>();

        for ( WebElement eachElement : webElementListesi){

            stringList.add( eachElement.getText() );
        }

        return stringList;
    }

    public static void titleIleWindowGecisYap(WebDriver driver, String hedefWindowTitle ){

        // 1- acik olan tum window'larin WHD'lerini alip kaydedelim

        Set<String> acikWindowlarinWhdleri=driver.getWindowHandles();

        //[074939BC4B25DC0CE37FF5EA9A9C3485, 3C5E74DA2EE7E4B728276EBF1DD5750B]

        for (String eachWhd:acikWindowlarinWhdleri){
            driver.switchTo().window(eachWhd);
            // gectigimiz windowun titel alip
            //gecmek istedigimizin titel ile esit mi kontrol edelim

            if (driver.getTitle().equals(hedefWindowTitle)){
                //dogru window'dayiz demektir,burada kalabiliriz
                break;
            }
        }
    }

    public static void urlIleWindowGecisYap(WebDriver driver,String hedefUrl){
        //1. adim acik tum windowlarin WindowHandleDegerlerini alip kaydedelim

        Set<String> acikTumWindowlarinWhdSeti=driver.getWindowHandles();

        for (String eachWhd:acikTumWindowlarinWhdSeti){
            driver.switchTo().window(eachWhd);
            if (driver.getCurrentUrl().equals(hedefUrl)){
                //actual Url, hedef url'e esit ise
                //dogru yerdeyiz demektir, orada kalalim
                break;
            }
        }

    }
}
