package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addInsurantDataPage extends addVehiclePage{

    //Mapeamento
    public String nome = "//input[@id='firstname']";
    public String sobrenome = "//input[@id='lastname']";
    public String nascimento = "//input[@id='birthdate']";
    public String pais = "//select[@id='country']";
    public String codigoPostal = "//input[@id='zipcode']";
    public String ocupacao = "//select[@id='occupation']";
    public String hobbieSpeeding = "//label[text()=' Speeding']/span[@class='ideal-check']";
    public String nextButtonSeguro = "//button[@id='nextenterproductdata']";
    public addInsurantDataPage(WebDriver driver) {
        super(driver);
    }

    public void validarAbaseguro(){
        WebElement element = driver.findElement(By.xpath(nome));
        Assert.assertTrue("Nao esta na pagina correta", element.isDisplayed());
    }

    public void preencherCamposSeguro(){
        preencherCampo(nome, "jose");
        preencherCampo(sobrenome, "silva");
        preencherCampo(nascimento, "10/10/1980");
        selecionarOpcao(pais, "Brazil");
        preencherCampo(codigoPostal, "12900000");
        selecionarOpcao(ocupacao, "Farmer");
        clicarCheckbox(hobbieSpeeding);
    }
}
