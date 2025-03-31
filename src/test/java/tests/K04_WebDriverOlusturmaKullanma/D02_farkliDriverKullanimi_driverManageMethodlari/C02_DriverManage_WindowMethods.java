package tests.K04_WebDriverOlusturmaKullanma.D02_farkliDriverKullanimi_driverManageMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DriverManage_WindowMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        // 1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Acilista konum : "+ driver.manage().window().getPosition());

        System.out.println("Acilista boyut : "+ driver.manage().window().getSize());

        //Acilista konum : (9, 9)
        //Acilista boyut : (1051, 806)

        // 3. Sayfayi simge durumuna getirin

        driver.manage().window().minimize();


        // 4. Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize konum : "+driver.manage().window().getPosition());

        System.out.println("Maximize boyut : "+ driver.manage().window().getSize());

        //Maximize konum : (-8, -8)
        //Maximize boyut : (1552, 840)


        // 6. Sayfayi fullscreen yapin

        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin

        System.out.println("Fullscreen konum : "+driver.manage().window().getPosition());

        System.out.println("Fullscreen boyut : "+ driver.manage().window().getSize());

        //Fullscreen konum : (0, 0)
        //Fullscreen boyut : (1536, 864)


        // 8. Sayfanin konumunu pixel olarak (200,200)’ye getirin

        driver.manage().window().setPosition(new Point(200,200));
        Thread.sleep(3000);

        // 9. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin

        driver.manage().window().setSize(new Dimension(1000,500));
        Thread.sleep(3000);

        //10. Sayfayi kapatin

        Thread.sleep(1000);
        driver.quit();
    }
}
