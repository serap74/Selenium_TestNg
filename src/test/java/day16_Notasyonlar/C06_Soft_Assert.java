package day16_Notasyonlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utulities.TestBase;

public class C06_Soft_Assert extends TestBase {
    @Test
    public void test01() {
        /*
Soft Assertion baslangic ve bitis satirlari arasindaki tum assertionlari yapip
bitis satirina geldiginde bize buldugu tum hatalari rapor eder

 */
// SoftAssert"un baslangici obje olusturmadir

        SoftAssert softAssert = new SoftAssert();


        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        softAssert.assertTrue(actualTitle.equals(expectedTitle),"Title amazon icermiyor");

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.isEnabled();


        //4-arama kutusuna Nuella yazıp aratın

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isEnabled(),"Arama kutusuna erisilemniyor");

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonucYaziElementi.getText().contains("Nutella"),"Kutella icermiyor");
        softAssert.assertAll();


        System.out.println("Assertionlardan fail olan olursa burasi calismaz");

        /*
        Softassert un hata bulsa bile calısmaya devam etme ozelligi asserall a kadardır.
        eger assertAll da failed rapor edilirse calısma durur ve claassın kalan kısmı calıstırılmaz
        Yani assertAll HardAssert deli herbir assert gibidir.
        Hatayi yakalarsa calısma durur.
         */
    }

}
