package tests.K04_WebDriverOlusturmaKullanma.D02_farkliDriverKullanimi_driverManageMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FarkliWebDriverKullanma {
    public static void main(String[] args) throws InterruptedException {

       /// WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.testotomasyonu.com");


        Thread.sleep(2000);
        driver.quit();
    }
}
