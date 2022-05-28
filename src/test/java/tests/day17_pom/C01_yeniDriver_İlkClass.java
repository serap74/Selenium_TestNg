package tests.day17_pom;

import org.testng.annotations.Test;
import utulities.Driver;

public class C01_yeniDriver_İlkClass {

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        /*
        bugüne kadar TestBase class'ına extends ederek kullandıgımız driver yerine
        bundan sonra Driver class'ından kullanacağımız getDriver static method'unu kullanacağız

        Driver.getDriver()  in
        driver              out
         */

        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");

        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();
    }
}
