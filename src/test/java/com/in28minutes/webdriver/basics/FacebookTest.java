package com.in28minutes.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class FacebookTest extends BasicTests {

    @Test
    public void LoginPage() throws InterruptedException {
        //Get the url
        String url = "https://tr-tr.facebook.com/";
        driver.get(url);

        WebElement userEmail = driver.findElement(By.id("email")); //idLocator
        userEmail.click();
        driver.findElement(By.name("email")).sendKeys("duygubaran1995@gmail.com");
        Thread.sleep(500);

        WebElement userPassword = driver.findElement(By.name("pass")); //nameLocator
        userPassword.click();
        userPassword.sendKeys("123456");
        Thread.sleep(500);

        WebElement button = driver.findElement(By.name("login")); //nameLocator
        button.click();
        Thread.sleep(500);
    }

    @Test
    public void ForgetPassword() throws InterruptedException {
        driver.get("https://tr-tr.facebook.com/");
        Thread.sleep(1000);
        WebElement pdForget = driver.findElement(By.className("_6ltj")); //classNameLocator
        assertEquals(pdForget.getText(),"Şifreni mi Unuttun?");
        Thread.sleep(500);
        pdForget.click();

        WebElement hesapBul = driver.findElement(By.id("identify_email"));
        hesapBul.click();
        hesapBul.sendKeys("duygubaran1995@gmail.com");
        Thread.sleep(500);

        WebElement search = driver.findElement(By.id("did_submit"));
        Thread.sleep(500);
    }

    @Test
    public void CreateAccount () throws InterruptedException {
        //Get the url
        String url = "https://tr-tr.facebook.com/reg/";
        driver.get(url);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.click();
        firstName.sendKeys("Duygu");
        Thread.sleep(500);

        WebElement surname = driver.findElement(By.name("lastname"));
        surname.click();
        surname.sendKeys("Baran");
        Thread.sleep(500);

        WebElement eMail = driver.findElement(By.name("reg_email__"));
        eMail.click();
        eMail.sendKeys("duygubaran-@hotmail.com");
        Thread.sleep(500);

        WebElement cEmail = driver.findElement(By.name("reg_email_confirmation__"));
        cEmail.click();
        cEmail.sendKeys("duygubaran-@hotmail.com");
        Thread.sleep(500);

        WebElement psswrd = driver.findElement(By.id("password_step_input"));
        psswrd.click();
        psswrd.sendKeys("1312950x00");
        Thread.sleep(1000);

        WebElement day = driver.findElement(By.id("day"));
        day.click();
        day.sendKeys("13");
        Thread.sleep(500);
        day.click();

        WebElement month = driver.findElement(By.name("birthday_month"));
        month.click();
        month.sendKeys("Ara");
        Thread.sleep(500);
        month.click();

        WebElement year = driver.findElement(By.id("year"));
        year.click();
        year.sendKeys("1995");
        Thread.sleep(500);
        year.click();

        WebElement sex = driver.findElement(By.xpath("//input[@name='sex' and @value='1']")); //XPathLocator
        sex.click();
        Thread.sleep(500);

        WebElement btn3 = driver.findElement(By.name("websubmit"));
        btn3.click();
        Thread.sleep(1000);
    }

    @Test
    public void alreadyAccount() throws InterruptedException {
        driver.get("https://tr-tr.facebook.com/reg/");
        WebElement alreadyAccount = driver.findElement(By.className("_9bq5")); //classNameLocator
        assertEquals(alreadyAccount.getText(),"Hesabın zaten var mı?");
        Thread.sleep(500);
        alreadyAccount.click();
    }

    @Test
    public void LinkTest() throws InterruptedException {
        driver.get("https://tr-tr.facebook.com/business/help/347839548598012?id=352109282177656");

        WebElement link = driver.findElement(By.linkText("Meta İşletme Yardım Merkezi")); //linkTextLocator
        Thread.sleep(500);
        link.click();

        WebElement link2 = driver.findElement(By.linkText("Destek"));
        Thread.sleep(500);
        link2.click();

        driver.get("https://tr-tr.facebook.com/business/help/347839548598012?id=352109282177656");

        WebElement pLink = driver.findElement(By.partialLinkText("Hesapların Oluşturul")); //partialLİnkTextLocator
        Thread.sleep(500);
        pLink.click();
        driver.getCurrentUrl();
    }

    @Test
    public void CheckBoxTest() throws InterruptedException {

        driver.get("https://www.udemy.com/join/login-popup/?skip_suggest=1&locale=tr_TR&next=https%3A%2F%2Fwww.udemy.com%2Fmobile%2Fipad%2F&response_type=html");
        WebElement e = driver.findElement(By.name("email"));
        e.click();
        e.sendKeys("duygubaran1995@gmail.com");
        WebElement s = driver.findElement(By.id("id_password"));
        s.click();
        s.sendKeys("dbcbsbsb13121995");
        WebElement b = driver.findElement(By.id("submit-id-submit"));
        b.click();

        WebElement ö = driver.findElement(By.xpath("//span[text()='Öğrenim İçeriğim']"));
        ö.click();
        WebElement x = driver.findElement(By.xpath("//strong[text()='Selenium WebDriver and Java - Learn Automation with Selenium']"));
        x.click();

        driver.get("https://www.udemy.com/course/automation-testing-with-selenium-and-java-for-beginners/learn/lecture/11829678#overview");
        WebElement sekme = driver.findElement(By.xpath("//span[text()='Bölüm 30: Appendix - Maven']"));
        sekme.click();
        Thread.sleep(2000);
        //String checkboxId= "F2F_COURSE";
        WebElement checkbox1 = driver.findElement(By.id("checkbox--736"));
        //WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='F2F_COURSE']"));
        boolean cValue= checkbox1.isSelected();
        if (cValue == false) {
            checkbox1.click();
//        }

        }
    }



    @Test
    public void UnCheckAcheckboxTest() throws InterruptedException {

        driver.get("");

        UnCheckAcheckboxTest("");
        Thread.sleep(2000);
        UnCheckAcheckboxTest("");
        Thread.sleep(2000);
    }

    private void UnCheckAcheckboxTest(String CheckboxName) {
        //CheckAcheckboxTest(By.name(CheckboxName), true);
    }

    @Test
    public void singleSelectBox() throws InterruptedException {

        driver.get("");

        WebElement selectElement = driver.findElement(By.id("singleSelectElement"));
        Thread.sleep(1000);
        Select select = new Select(selectElement);
        select.selectByValue("2");
        Thread.sleep(2000);
        select.deselectByVisibleText("four");
        Thread.sleep(2000);
        select.selectByIndex(4);
        Thread.sleep(2000);
    }

    public void multipleSelectBox() throws InterruptedException {

        driver.get("");

        WebElement multipleElement = driver.findElement(By.id("multipleSelectElement"));
        Thread.sleep(1000);
        Select select = new Select(multipleElement);
        select.deselectAll();
        Thread.sleep(2000);
        select.selectByValue("2");
        Thread.sleep(2000);
        select.deselectByVisibleText("four");
        Thread.sleep(2000);
        select.selectByIndex(4);
        Thread.sleep(2000);
    }


}
