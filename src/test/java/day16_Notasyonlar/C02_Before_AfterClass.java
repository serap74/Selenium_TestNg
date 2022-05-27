package day16_Notasyonlar;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utulities.TestBase;
//JUnit te @BeforeClass ve @AfterClass notasyonuna sahip methodlar static olmak zorundaydı
//testNG de bu zorunluluktan bizi kurtarıyor
/*
TestNg bize daha fazla before ve after notasyonlari sunar diger
before/afte notasyonlari tanimlyacagimiz grup  test ve suit den once ve sonra calisirlar
ilerdie xml dosyalari ile birlikte bunu gorecegiz
 */

public class C02_Before_AfterClass extends TestBase {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
    @Test
    public void amazontesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void bestbuytesti() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techproeducationtesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}

