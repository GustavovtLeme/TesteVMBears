package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendQuotePage extends selectPriceOptionPage{
    public sendQuotePage(WebDriver driver) {
        super(driver);
    }
    public String email = "//input[@id='email']";
    public String usuario = "//input[@id='username']";
    public String senha = "//input[@id='username']";
    public String confirmarSenha = "//input[@id='confirmpassword']";

    public void validarAbaEmail(){
        WebElement element = driver.findElement(By.xpath(email));
        Assert.assertTrue("Nao esta na pagina correta", element.isDisplayed());
    }

    public void preencherCamposEmail(){
        preencherCampo(usuario, "jose");
        preencherCampo(senha, "123456");
        preencherCampo(confirmarSenha, "123456");
    }
}
