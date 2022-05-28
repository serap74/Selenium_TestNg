package tests.day16_Notasyonlar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utulities.TestBase;

import java.time.Duration;


public class C04_DependsOnMethod {
    WebDriver driver;
    @BeforeClass
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void afterClassMethod(){
       driver.close();
    }
    @Test
    public void test01() {
        driver.get("https://www.ramazon1.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));
    }

    @Test(priority=1)
    public void test04() {
        System.out.println("Bak bu calisti");

        /*
DependsOnMethods  test methodlarinin calisma siralamasina karismaz
Sadece bagli olan test, baglandigi testin sonucuna bakar
baglandigi test PASSED olmazsa, baglanan test hic calismaz(ignore)
 */
    }
}
