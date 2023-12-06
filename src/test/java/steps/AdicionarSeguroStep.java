package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.GeralPage;
import pages.addInsurantDataPage;
import pages.addVehiclePage;
import runners.RunCucumberTest;

public class AdicionarSeguroStep extends RunCucumberTest {

    GeralPage GeralPage = new GeralPage(driver);
    addVehiclePage addVehiclePage = new addVehiclePage(driver);
    addInsurantDataPage addinsurantPage = new addInsurantDataPage(driver);
    @Dado("^que ja preenchi os dados do veiculo$")
    public void que_ja_preenchi_os_dados_do_veiculo() throws InterruptedException {
        GeralPage.acessarSite();
        addVehiclePage.validaPagina();
        addVehiclePage.preencherCampos();
        addVehiclePage.clicarNext("Veiculo");
    }
    @Dado("^valido que estou na aba de dados do seguro$")
    public void valido_que_estou_na_aba_de_dados_do_seguro(){
        addinsurantPage.validarAbaseguro();
    }
    @Quando("^preencho os campos necessario$")
    public void preencho_os_campos_necessario(){
        addinsurantPage.preencherCamposSeguro();
    }
    @Então("^clico no botao Next$")
    public void clico_no_botao_com_a_informacao_Next() throws InterruptedException {
        addVehiclePage.clicarNext("Seguro");
    }

}
