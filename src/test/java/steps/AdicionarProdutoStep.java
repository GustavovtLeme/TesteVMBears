package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.GeralPage;
import pages.addInsurantDataPage;
import pages.addProductDataPage;
import pages.addVehiclePage;
import runners.RunCucumberTest;

public class AdicionarProdutoStep extends RunCucumberTest {

    GeralPage GeralPage = new GeralPage(driver);
    addVehiclePage addVehiclePage = new addVehiclePage(driver);
    addInsurantDataPage addinsurantPage = new addInsurantDataPage(driver);
    addProductDataPage addproductDataPage = new addProductDataPage(driver);
    @Dado("^que ja preenchi os dados do veiculo e do seguro$")
    public void que_ja_preenchi_os_dados_do_veiculo_e_do_seguro() throws InterruptedException {
        GeralPage.acessarSite();
        addVehiclePage.validaPagina();
        addVehiclePage.preencherCampos();
        addVehiclePage.clicarNext("Veiculo");
        addinsurantPage.validarAbaseguro();
        addinsurantPage.preencherCamposSeguro();
        addVehiclePage.clicarNext("Seguro");
    }

    @Dado("^valido que estou na aba de dados do produto$")
    public void valido_que_estou_na_aba_de_dados_do_produto()  {
        addproductDataPage.validaAbaProduto();
    }

    @Quando("^preencho os campos do produto$")
    public void preencho_os_campos_do_produto()  {
        addproductDataPage.preencherCamposProduto();
    }

    @Então("^clico no botao Next para a proxima aba$")
    public void clico_no_botao_Next_para_a_proxima_aba() throws InterruptedException {
        addVehiclePage.clicarNext("Produto");
    }
}
