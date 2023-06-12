package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02 {


    public static void main(String[] args) throws InterruptedException {


        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        // Add Element butonuna basınız
        // Delete butonunun gorunur oldugunu test edin
        // Delete butonuna basın
        // "Add/Remove Elements" yazısının gorunur oldugunu test edin
        // sayfayı kapatınız


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");



        // Add Element butonuna basınız
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        Thread.sleep(2000);


        // Delete butonunun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if(deleteButonu.isDisplayed()){
            System.out.println("Delete Butonu Gorunur");
        }else{
            System.out.println("Delete Butonu Gorunur Degil");
        }


        // Delete butonuna basın
        deleteButonu.click();
        Thread.sleep(2000);


        // "Add/Remove Elements" yazısının gorunur oldugunu test edin

        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));

        if(addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add Remove Elements Gorunur");
        }else{
            System.out.println("Add Remove Elements Gorunur Degil");
        }



        // sayfayı kapatınız
        driver.close();





    }
}
