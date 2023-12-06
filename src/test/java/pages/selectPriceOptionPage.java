package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectPriceOptionPage extends addProductDataPage{

    public selectPriceOptionPage(WebDriver driver) {
        super(driver);
    }

    public String opcaoPreco = "//*[@id=\"priceTable\"]/tfoot/tr/th[1]";
    public String opcaoRadioButton = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span";

    public void validarAbaOpcaoPreco(){
        WebElement element = driver.findElement(By.xpath(opcaoPreco));
        Assert.assertTrue("Nao esta na pagina correta", element.isDisplayed());
    }

    public void selecionarOpcaoPreco(){
        clicarCheckbox(opcaoRadioButton);
    }
}
