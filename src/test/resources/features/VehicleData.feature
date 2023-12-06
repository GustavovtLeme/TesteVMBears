#language: pt

  Funcionalidade: Adicionar um veiculo
    Adiciona um veiculo na aba Enter Vehicle Data e vai para o proxima aba do projeto

    @Adicionar_veiculo @ignore
    Cenario: Adicionar dados do veiculo
      Dado que acesso o site
      E valido que estou na aba de adicao de veiculo
      E preencho os campos solicitados
      Então clico no botao com a informacao Next

    @Adicionar_dados_seguro @ignore
    Cenario: Adicionar dados do seguro
      Dado que ja preenchi os dados do veiculo
      E valido que estou na aba de dados do seguro
      Quando preencho os campos necessario
      Então clico no botao Next

    @Adicionar_dados_produto
    Cenario: Adiconar dados do produto
      Dado que ja preenchi os dados do veiculo e do seguro
      E valido que estou na aba de dados do produto
      Quando preencho os campos do produto
      Então clico no botao Next para a proxima aba

    @Selecionar_plano @ignore
    Cenario: Selecionar um plano
      Dado que ja preenchi todos os campos anteriores
      E valido que estou na aba de planos
      Quando seleciono um plano
      Então clico em Next

    @Enviar_solicitacao @ignore
    Cenario:  Envio do email com os dados informados
      Dado que ja preenchi todos os dados solicitados anteriormente
      E validei que estou na pagina correta
      Quando preencho os campos necessario para envio do email
      Então clico no botao Send