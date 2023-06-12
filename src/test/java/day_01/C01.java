package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01 {

    public static void main(String[] args) throws InterruptedException {



        // Pencereyi maximize yapiniz


        // "https://www.amazon.com/" adresine gidiniz.
        // "https://www.n11.com/" adresine gidiniz.
        // amazon adresine geri donunuz
        // n11 adresine ilerleyiniz
        // sayfayi yenileyiniz
        // pencereyi kapat
        // Konsola "HER ŞEY YOLUNDA" yazdir



        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));








        // Pencereyi maximize yapiniz


        driver.manage().window().maximize();











        // "https://www.amazon.com/" adresine gidiniz.


        driver.get("https://www.amazon.com/");


        Thread.sleep(1000);










        // "https://www.n11.com/" adresine gidiniz.


        driver.get("https://www.n11.com/");


        Thread.sleep(1000);












        // amazon adresine geri donunuz


        driver.navigate().back();


        Thread.sleep(1000);











        // n11 adresine ilerleyiniz


        driver.navigate().forward();


        Thread.sleep(1000);













        // sayfayi yenileyiniz


        driver.navigate().refresh();


        Thread.sleep(1000);













        // pencereyi kapat

        driver.close();









        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");





    }


}
