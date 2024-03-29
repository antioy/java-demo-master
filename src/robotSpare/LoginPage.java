import robotSpare;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePageClass{
    public LoginPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateToUrl(){
        Driver().navigate().to(environment);
    }
    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@class='btn btn-primary']");;



    public void Login(String user, String pass){
        findElementWithWait(username).sendKeys(user);
        findElementWithWait(password).sendKeys(pass);
        findElementWithWait(loginButton).click();
    }
}