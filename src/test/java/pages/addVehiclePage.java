package pages;

import org.junit.Assert;
import org.openqa.selenium.*;




public class addVehiclePage extends GeralPage {

    //Mapeamento
    public String dadosVeiculo = "//a[@id='entervehicledata']";
    public String modelo = "//select[@id='model']";
    public String cilindrada = "//input[@id='cylindercapacity']";
    public String fabricante = "//select[@id='make']";
    public String potenciaMotor = "//input[@id='engineperformance']";
    public String dataFabricacao = "//input[@id='dateofmanufacture']";
    public String numeroAssentos = "//select[@id='numberofseats']";
    public String numeroAssentosMoto = "//select[@id='numberofseatsmotorcycle']";
    public String tipocombustivel = "//select[@id='fuel']";
    public String cargaUtil = "//input[@id='payload']";
    public String pesoMaximo = "//input[@id='totalweight']";
    public String precoListagem = "//input[@id='listprice']";
    public String milhagemAnual = "//input[@id='annualmileage']";
    public String nextButton = "//button[@id='nextenterinsurantdata']";

    public addVehiclePage(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void validaPagina(){
        String elemento = driver.findElement(By.xpath(dadosVeiculo)).getText();
        String esperado = "Enter Vehicle Data\n12";
        Assert.assertEquals("Não é o site correto", esperado, elemento);
    }

    public void preencherCampos(){
        selecionarOpcao(fabricante, "Renault");
        preencherCampo(potenciaMotor, "37");
        preencherCampo(dataFabricacao, "10/25/2018");
        selecionarOpcao(numeroAssentos, "4");
        selecionarOpcao(tipocombustivel, "Gas");
        preencherCampo(precoListagem, "50000");
        preencherCampo(milhagemAnual, "10000");
    }

    public void clicarNext(String info) throws InterruptedException {
        screenshot();
        switch (info){
            case "Veiculo":
                driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
                break;

            case "Seguro":
                driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
                break;

            case "Produto":
                driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
                break;

            case "Plano":
                driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
                break;

            case "Enviar":
                driver.findElement(By.xpath("//button[@id='sendemail']")).click();

            default:
                break;
        }

    }




}
