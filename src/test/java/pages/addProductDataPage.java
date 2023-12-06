package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addProductDataPage extends addInsurantDataPage{
    public addProductDataPage(WebDriver driver) {
        super(driver);
    }

    //Mapeamento
    public String dataInicial = "//input[@id='startdate']";
    public String somaSeguro = "//select[@id='insurancesum']";
    public String classificacaoMerito = "//select[@id='meritrating']";
    public String seguroDano = "//select[@id='damageinsurance']";
    public String produtosOpcionais1 = "//label[text()='Euro Protection']/span";
    public String produtosOpcionais2 = "//label[text()='Legal Defense Insurance']/span";
    public String carroCortesia = "//select[@id='courtesycar']";

    public void validaAbaProduto(){
        WebElement element = driver.findElement(By.xpath(dataInicial));
        Assert.assertTrue("Nao esta na pagina correta", element.isDisplayed());
    }

    public void preencherCamposProduto(){
        preencherCampo(dataInicial, "05/05/2024");
        selecionarOpcao(somaSeguro, "7000000");
        selecionarOpcao(classificacaoMerito, "Malus 10");
        selecionarOpcao(seguroDano, "Full Coverage");
        clicarCheckbox(produtosOpcionais1);
        clicarCheckbox(produtosOpcionais2);
        selecionarOpcao(carroCortesia, "Yes");
    }

}
