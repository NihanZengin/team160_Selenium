package tests.K04_WebDriverOlusturmaKullanma.D01_WebDriverOlusturma_GetVeNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomation {

    public static void main(String[] args) throws InterruptedException {

        // Bir test class'i olusturuldugunda ilk yapilmasi gereken sey
        // WebDriver edinmektir

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
         /**
         istenen Url'e gider
         url yazarken www yazmasak da WebDriver objesi url'e gider
         ANCCAAAK https: yazmazsak kod calismaz
         */


        Thread.sleep(3000);
        driver.close();
    }
}
