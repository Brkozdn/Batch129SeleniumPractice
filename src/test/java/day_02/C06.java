package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C06 {

    public static void main(String[] args) throws InterruptedException {



        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin
        // pencereyi kapatiniz





        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));








        // https://www.amazon.com/ adresine gidin


        driver.get("https://www.amazon.com/");

        Thread.sleep(2000);











        // arama motorunda nutella yazip aratınız

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella" + Keys.ENTER);








        // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin

        List<WebElement> butonlar = driver.findElements(By.xpath("(//a[@tabindex='0'])[6] | (//a[@tabindex='0'])[7]"));

        for (int i = 0; i <butonlar.size() ; i++) {

            butonlar = driver.findElements(By.xpath("(//a[@tabindex='0'])[6] | (//a[@tabindex='0'])[7]"));

            butonlar.get(i).click();

            if(driver.getTitle().contains("Amazon")){
                System.out.println("TİTLE Amazon İCERİYOR");
            }

            driver.navigate().back();

        }




        /*
        for (int i = 0; i <2 ; i++) {

            List<WebElement> butonlar = driver.findElements(By.xpath("(//a[@tabindex='0'])[6] | (//a[@tabindex='0'])[7]"));
            butonlar.get(i).click();

            if(driver.getTitle().contains("Amazon")){
                System.out.println("TİTLE Amazon İCERİYOR");
            }

            driver.navigate().back();

        }
         */












        // pencereyi kapatiniz

        driver.close();







    }




}
