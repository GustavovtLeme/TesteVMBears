package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.*;
import runners.RunCucumberTest;

public class SelecionarPlanoStep extends RunCucumberTest {

    GeralPage GeralPage = new GeralPage(driver);
    addVehiclePage addVehiclePage = new addVehiclePage(driver);
    addInsurantDataPage addinsurantPage = new addInsurantDataPage(driver);
    addProductDataPage addproductDataPage = new addProductDataPage(driver);
    selectPriceOptionPage selectpriceoptionpage = new selectPriceOptionPage(driver);

    @Dado("^que ja preenchi todos os campos anteriores$")
    public void que_ja_preenchi_todos_os_campos_anteriores(){
        addVehiclePage.preencherCampos();
        addinsurantPage.preencherCamposSeguro();
        addproductDataPage.preencherCamposProduto();

    }

    @Dado("^valido que estou na aba de planos$")
    public void valido_que_estou_na_aba_de_planos(){
        selectpriceoptionpage.validarAbaOpcaoPreco();
    }

    @Quando("^seleciono um plano$")
    public void seleciono_um_plano(){
        selectpriceoptionpage.selecionarOpcaoPreco();
    }

    @Então("^clico em Next$")
    public void clico_em_Next() throws Throwable {
        addVehiclePage.clicarNext("Plano");
    }

}
