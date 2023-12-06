package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class addVehiclePage {
    
    public addVehiclePage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    //Campos
    public String dadosVeiculo = "//a[@id='entervehicledata']";
    public String fabricante = "//select[@id='make']";
    public String potenciaMotor = "//input[@id='engineperformance']";
    public String dataFabricacao = "//input[@id='dateofmanufacture']";
    public String numeroAssentos = "//select[@id='numberofseats']";
    public String tipocombustivel = "//select[@id='fuel']";
    public String precoListagem = "//input[@id='listprice']";
    public String milhagemAnual = "//input[@id='annualmileage']";
    public String nextButton = "//button[@id='nextenterinsurantdata']";

    //Metodos
    public void validaPagina(){
        String elemento = driver.findElement(By.xpath(dadosVeiculo)).getText();
        String esperado = "Enter Vehicle Data\n12";
        Assert.assertEquals("Não é o site correto", esperado, elemento);
    }

    public void preencherCampos(){
        selecionarOpcao(fabricante, "Renault");
        driver.findElement(By.xpath(potenciaMotor)).sendKeys("37");
        driver.findElement(By.xpath(dataFabricacao)).sendKeys("10/25/2018");
        driver.findElement(By.xpath(numeroAssentos)).sendKeys("4");
        driver.findElement(By.xpath(tipocombustivel)).sendKeys("Gas");
        driver.findElement(By.xpath(precoListagem)).sendKeys("50000");
        driver.findElement(By.xpath(milhagemAnual)).sendKeys("10000");
    }

    public void clicarNext() throws InterruptedException {
        screenshot();
        driver.findElement(By.xpath(nextButton)).click();
        Thread.sleep(50000);
    }

    public void selecionarOpcao(String xpath, String valor){
        WebElement dropDown = driver.findElement(By.xpath(xpath));
        Select seletor = new Select(dropDown);
        seletor.selectByValue(valor);
    }
    public void screenshot(){

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        jsExecutor.executeScript("window.scrollTo(0, 0);");

        Integer i = 1;

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            java.nio.file.Files.copy(screenshotFile.toPath(), new File("src/test/java/screenshots/screenshot" + i + ".png").toPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        i++;
    }

}
