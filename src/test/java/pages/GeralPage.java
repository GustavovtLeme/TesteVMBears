package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class GeralPage {

    public GeralPage(WebDriver driver) {
        this.driver = driver;
    }
    public Integer i = 1;
    //variaveis
    public String site = "https://sampleapp.tricentis.com/101/app.php";

    //Webdriver
    WebDriver driver;

    public void acessarSite() {
        driver.get(site);

    }
    public void screenshot(){

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            java.nio.file.Files.copy(screenshotFile.toPath(), new File("src/test/java/screenshots/screenshot\n" + i + ".png").toPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        i++;
    }
    public void selecionarOpcao(String xpath, String valor){
        WebElement dropDown = driver.findElement(By.xpath(xpath));
        Select seletor = new Select(dropDown);
        seletor.selectByValue(valor);
    }
    public void preencherCampo(String xpath, String valor){
        driver.findElement(By.xpath(xpath)).sendKeys(valor);
    }

    public void clicarCheckbox(String xpath){
        driver.findElement(By.xpath(xpath)).click();

    }


}
