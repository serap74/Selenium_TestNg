package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utulities.Driver;

public class C02_PageClassKullanim {
    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");

        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);

        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";

        Assert.assertTrue(actualSonuc.contains(arananKelime));

        Driver.closeDriver();








    }
}
