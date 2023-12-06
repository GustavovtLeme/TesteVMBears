package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class GeralPage {

    public GeralPage(WebDriver driver) {
        this.driver = driver;
    }

    //variaveis
    public String site = "https://sampleapp.tricentis.com/101/app.php";

    //Webdriver
    WebDriver driver;

    public void acessarSite(){
        driver.get(site);

    }




}
