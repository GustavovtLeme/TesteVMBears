package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.*;
import runners.RunCucumberTest;

public class EnviarEmailStep extends RunCucumberTest {
    GeralPage GeralPage = new GeralPage(driver);
    addVehiclePage addVehiclePage = new addVehiclePage(driver);
    addInsurantDataPage addinsurantPage = new addInsurantDataPage(driver);
    addProductDataPage addproductDataPage = new addProductDataPage(driver);
    selectPriceOptionPage selectpriceoptionpage = new selectPriceOptionPage(driver);
    sendQuotePage sendquotePage = new sendQuotePage(driver);

    @Dado("^que ja preenchi todos os dados solicitados anteriormente$")
    public void que_ja_preenchi_todos_os_dados_solicitados_anteriormente(){
        addVehiclePage.preencherCampos();
        addinsurantPage.preencherCamposSeguro();
        addproductDataPage.preencherCamposProduto();
        selectpriceoptionpage.selecionarOpcaoPreco();
    }
    @Dado("^validei que estou na pagina correta$")
    public void validei_que_estou_na_pagina_correta(){
        sendquotePage.validarAbaEmail();
    }
    @Quando("^preencho os campos necessario para envio do email$")
    public void preencho_os_campos_necessario_para_envio_do_email(){
        sendquotePage.preencherCamposEmail();
    }

    @Então("^clico no botao Send$")
    public void clico_no_botao_Send() throws InterruptedException {
        addVehiclePage.clicarNext("Enviar");
    }

}
