package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {


    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        // sayfayi kapatiniz








        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));








        // https://www.amazon.com/ adresine gidin


        driver.get("https://www.amazon.com/");












        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz


        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));





        String expectedTagName = "input";


        String actuelTagName = aramaKutusu.getTagName();



        if(expectedTagName.equals(actuelTagName)){
            System.out.println("TagName input");
        }else{
            System.out.println("TagName input degil");
        }












        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin


        String expectedNameDegeri = "field-keywords";

        String actuelNameDegeri = aramaKutusu.getAttribute("name");




        if(expectedNameDegeri.equals(actuelNameDegeri)){
            System.out.println("name attribute'nun degeri field-keyword");
        }else{
            System.out.println("name attribute'nun degeri field-keyword degil");
        }










        // sayfayi kapatiniz

        driver.close();

    }
}
