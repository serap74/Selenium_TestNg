package tests.day16_Notasyonlar;

import org.testng.annotations.Test;
import utulities.TestBase;
// @BeforeMethod ve @AfterMethod  notasyonlari
// JUnit'deki @Before ve @After gibidir
// her test method'undan once ve sonra calisirlar


public class C01_Before_AfterMethod extends TestBase {
    @Test
    public void amazontesti() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestbuytesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducationtesti() {
        driver.get("https://www.techproeducation.com");
    }
}