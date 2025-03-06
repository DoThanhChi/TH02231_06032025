import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cau3 {
    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver =new ChromeDriver();
    }

    @Test
    public void test(){
//        chromeDriver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
//        WebElement inputName = chromeDriver.findElement(By.xpath("//input[@id='email']"));
//        inputName.sendKeys("thanhdcth00231@fpt.edu.vn");
//
//        WebElement inputPhone = chromeDriver.findElement(By.xpath("//input[@id='password']"));
//        inputPhone.sendKeys("0123456789");
//
//        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='login']"));
//        inputEmail.sendKeys("ThegTheGod");
//
//        WebElement btnDk = chromeDriver.findElement(By.xpath("//button[@class='js-octocaptcha-load-captcha signup-form-fields__button Button--primary Button--medium Button Button--fullWidth']"));
//        btnDk.click();




        chromeDriver.get("https://github.com/login");
        WebElement inputEmailhoacSDT = chromeDriver.findElement(By.xpath("//input[@id='login_field']"));
        inputEmailhoacSDT.sendKeys("thanhdcth00231@fpt.edu.vn");

        WebElement inputMK = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        inputMK.sendKeys("0123456789");

        WebElement btnDN = chromeDriver.findElement(By.xpath("//input[@name='commit']"));
        btnDN.click();
    }

}
