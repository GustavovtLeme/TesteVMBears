package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pages.GeralPage;
import pages.addVehiclePage;
import runners.RunCucumberTest;

public class AdicionarVeiculoStep extends RunCucumberTest {

    GeralPage GeralPage = new GeralPage(driver);
    addVehiclePage addVehiclePage = new addVehiclePage(driver);



    //Passos para adicao de veiculo
    @Dado("^que acesso o site$")
    public void que_acesso_o_site() {
        GeralPage.acessarSite();
    }

    @Dado("^valido que estou na aba de adicao de veiculo$")
    public void valido_que_estou_na_aba_de_adicao_de_veiculo() {
        addVehiclePage.validaPagina();
    }

    @Dado("^preencho os campos solicitados$")
    public void preencho_os_campos_solicitados() {
        addVehiclePage.preencherCampos();
    }

    @Então("^clico no botao com a informacao Next$")
    public void clico_no_botao_com_a_informacao_Next() throws InterruptedException {
        addVehiclePage.clicarNext();
    }
}
