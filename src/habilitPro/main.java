package habilitPro;

import com.sun.tools.javac.Main;
import habilitPro.Utils.LimparTela;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    // ARRAYS PARA TESTE
    private static ArrayList<Cidade> cidades = new ArrayList<>();// BANCO DE DADOS
    private static ArrayList<Estado> estados = new ArrayList<>();// BANCO DE DADOS
    private static ArrayList<RegionalSenai> regionais = new ArrayList<>();// BANCO DE DADOS
    private static ArrayList<SegmentoEmpresa> segmentos = new ArrayList<>();// BANCO DE DADOS
    private static ArrayList<Perfil> perfis = new ArrayList<>();// BANCO DE DADOS
    private static ArrayList<Usuario> usuarios = new ArrayList<>();// BANCO DE DADOS
    // FIM ARRAYS TESTE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // VARIAVEIS UTILs++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Scanner entrada = new Scanner(System.in);
    LimparTela limpatela = new LimparTela();

    public static void main(String[] args) {
        main mainTestes = new main();
        mainTestes.menuPrincipal();
    }

    // método que exibe o menu principal do sistema
    public void menuPrincipal(){

        while(true){

            limpatela.limparTela();
            System.out.println("\n:: H A B I L I T  P R O ::\n");
            System.out.println("Bem-vindo(a) ao sistema.\nEscolha a opção desejada");
            System.out.println("1 - Estado");
            System.out.println("2 - Cidade");
            System.out.println("3 - Regional");
            System.out.println("4 - Segmento da Empresa");
            System.out.println("5 - Empresa");
            System.out.println("6 - Trabalhador");
            System.out.println("7 - Trilha");
            System.out.println("8 - Módulo");
            System.out.println("9 - Usuário");
            System.out.println("10 - Perfil");
            System.out.println("00 - Sair");
            System.out.print("Sua opção: ");
            // lê a opção do usuário
            int opcao = Integer.parseInt(entrada.nextLine());

            switch(opcao){
                case 1:
                    menuGerenciarEstados();
                    break;

                case 2:
                    menuGerenciarCidades();
                    break;

                case 3:
                    menuGerenciarRegional();
                    break;

//                case 4:
//                    // chama o menu de gerenciamento de usuários
//                    menuGerenciarUsuarios();
//                    break;
//
//                case 5:
//                    // chama o menu de gerenciamento de emprestimos
//                    menuGerenciarEmprestimos();
//                    break;
//
//                case 6:
//                    // chama o menu de gerenciamento de multas
//                    menuGerenciarMultas();
//                    break;
//                case 7:
//                    // chama o menu de gerenciamento de multas
//                    menuGerenciarMultas();
//                    break;
//                case 8:
//                    // chama o menu de gerenciamento de multas
//                    menuGerenciarMultas();
//                    break;
                  case 9:
                    // chama o menu de gerenciamento de usuários
                    menuGerenciarUsuarios();
                    break;
                case 10:
                    // chama o menu de gerenciamento de Perfil
                    menuGerenciarPerfil();
                    break;

                case 00:
                    System.out.println("\nObrigado por usar o Sistema Habilit Pro\n");
                            System.exit(0);
            }
        }
    }



    // METODOS DO MENU

    private int menuGerenciarEstados() {
        Estado temp;
        String pesquisaEstado;

        while (true){

            System.out.println("\n:: G E R E N C I A R   E S T A D O S ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Novo Estado");
            System.out.println("2 - Listar Estados");
            System.out.println("3 - Pesquisar Estados");
            System.out.println("4 - Excluir Estado");
            System.out.println("5 - Atualizar Estado");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao){
                case 1: // vamos cadastrar um novo autor
                    System.out.print("\nDescrição: ");
                    String descEstado = entrada.nextLine();
                    System.out.print("UF: ");
                    String ufEstado= entrada.nextLine();

                    Estado.serialEstado++;
                    Estado est = new Estado(Estado.serialEstado, descEstado,ufEstado);
                    estados.add(est);

                    System.out.println("\nO Estado foi cadastrado com sucesso");

                    break;

                case 2:
                    if(estados.isEmpty()){
                        System.out.println("\nNão há nenhum Estado cadastrado.");
                    }
                    else{
                        for(int i = 0; i < estados.size(); i++){
                            temp = estados.get(i); // obtém o autor da iteração atual
                            System.out.println("\nId:         \t" + temp.getIdEstado());
                            System.out.println("Descrição:    \t" + temp.getDescEstado());
                            System.out.println("UF:           \t" + temp.getUfEstado());
                            System.out.println("Quant Cidades:\t" + temp.getCidades(cidades).size());
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme a UF ou descrição do Estado: ");
                    pesquisaEstado = entrada.nextLine();
                    // método que pesquisa o Estado
                    temp = pesquisarEstado(pesquisaEstado);
                    if(temp == null){
                        System.out.println("\nO Estado náo foi encontrado.");
                    }
                    else{
                        // mostra o estado
                        System.out.println("\nId:         \t" + temp.getIdEstado());
                        System.out.println("Descrição:    \t" + temp.getDescEstado());
                        System.out.println("UF:           \t" + temp.getUfEstado());
                        System.out.println("Quant Cidades:\t" + temp.getCidades(cidades).size());
                    }

                    break;
                case 4:
                    System.out.print("\nInforme a UF ou descricao do Estado a ser excluído: ");
                    pesquisaEstado = entrada.nextLine();
                    temp = pesquisarEstado(pesquisaEstado);
                    if(temp == null){ // autor não encontrado
                        System.out.println("\nO Estado não foi encontrado.");
                    }
                    else{
                        // vamos excluir este Estado. Atenção: Se houver Cidades relacionadas
                        // a este Estado, então a exclusão destes deverá ser feita primeiro
                        if(temp.getCidades(cidades).size() > 0){
                            System.out.println("\nOps! Este Estado está relacionado a " + temp.getCidades(cidades).size() + ". Exclua eles primeiro.");
                        }
                        else{
                            estados.remove(temp);
                            System.out.println("\nEstado foi excluído com sucesso.");
                        }
                    }

                    break;

                case 5: // vamos atualizar um autor
                    System.out.print("\nInforme a UF ou descricao do Estado a ser atualizado: ");
                    pesquisaEstado = entrada.nextLine();
                    // chamamos o método que pesquisa o estaDO
                    temp = pesquisarEstado(pesquisaEstado);
                    if(temp == null){ // não encotrado
                        System.out.println("\nO eSTADO "+temp.getDescEstado() +" não foi encontrado.");
                    }
                    else{
                        // mostra o estado encontrado
                        System.out.println("\nDados atuais deste autor:");
                        System.out.println("\nId:         \t" + temp.getIdEstado());
                        System.out.println("Descrição:    \t" + temp.getDescEstado());
                        System.out.println("UF:           \t" + temp.getUfEstado());
                        System.out.println("Quant Cidades:\t" + temp.getCidades(cidades).size());

                        System.out.println("\nInforme os novos dados:");
                        System.out.print("\nNova Descrição do Estado: ");
                        String novaDescEstado = entrada.nextLine();
                        System.out.print("Nova UF do Estado: ");
                        String novoUF = entrada.nextLine();

                        // atualizar os dados no ArrayList
                        temp.setDescEstado(novaDescEstado);
                        temp.setUfEstado(novoUF);
                        System.out.println("\nESTADO atualizado com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }

    }
    // metodo de pesquisa estado
    private Estado pesquisarEstado(String pesquisaEstado) {
        Estado a = null;

        // verifica
        for(int i = 0; i < estados.size(); i++){
            // pesquisa pelo UF
            if((estados.get(i).getUfEstado()).equals(pesquisaEstado)){
                return estados.get(i);
            }
            // pesquisar por desc
            else if(estados.get(i).getDescEstado().contains(pesquisaEstado)){
                return estados.get(i);
            }
        }

        return a;
    }

    private int menuGerenciarCidades() {
        Cidade temp;
        String pesquisaCidade;

        while (true) { // mostra o menu para o usuário

            System.out.println("\n:: G E R E N C I A R   C I D A D E S ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Nova Cidade");
            System.out.println("2 - Listar Cidades");
            System.out.println("3 - Pesquisar Cidade");
            System.out.println("4 - Excluir Cidade");
            System.out.println("5 - Atualizar Cidade");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine()); // lê a opção do usuário
            limpatela.limparTela();
            switch (opcao) {
                case 1: // vamos cadastrar uma cidade
                    System.out.print("\nNome da Cidade: ");
                    String descCidade = entrada.nextLine();

                    // para cadastrar uma nova cidade precisa de um ESTADO
                    Estado estado = null; // ESTADO
                    while (estado == null) {
                        System.out.print("Informe o id ou nome do Estado: ");
                        String pesquisaEstado = entrada.nextLine();
                        // chamamos o método que pesquisa o autor
                        estado = pesquisarEstado(pesquisaEstado);
                        if (estado == null) { // Estado não encotrado
                            System.out.print("\nEstado não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Estado selecionado: " + estado.getDescEstado() + " - " + estado.getUfEstado());
                    // fim para encontrar estado
                    // contador de cidade
                    Cidade.serialCidade++;
                    Cidade cid = new Cidade(Cidade.serialCidade, descCidade, estado);
                    // e o adiciona no ArrayList de cidades
                    cidades.add(cid);

                    System.out.println("\nA Cidade cadastrada com sucesso");
                    break;

                case 2: //listar cidades
                    if (cidades.isEmpty()) {
                        System.out.println("\nNão há nenhuma Cidade cadastrada!");
                    } else {
                        for (int i = 0; i < cidades.size(); i++) {
                            temp = cidades.get(i);
                            System.out.println("Id:          \t" + temp.getIdCidade());
                            System.out.println("Nome Cidade: \t" + temp.getDescCidade());
                            System.out.println("UF:          \t" + temp.getEstado().getUfEstado());
                        }
                    }
                    break;

                case 3: // vamos pesquisar cidade
                    System.out.print("\nInforme o UF ou nome da Cidade: ");
                    pesquisaCidade = entrada.nextLine();
                    // metodo pesquisa
                    temp = pesquisarCidade(pesquisaCidade);
                    if (temp == null) {
                        System.out.println("\nA cidade não foi encontrado.");
                    } else {
                        // mostra o usuário encontrado
                        System.out.println("Id:          \t" + temp.getIdCidade());
                        System.out.println("Nome Cidade: \t" + temp.getDescCidade());
                        System.out.println("UF:          \t" + temp.getEstado().getUfEstado());
                    }

                    break;

                case 4: //excluir cidade
                    System.out.print("\nInforme o UF ou nome da cidade a ser excluída: ");
                    pesquisaCidade = entrada.nextLine();
                    temp = pesquisarCidade(pesquisaCidade);
                    if(temp == null){ // cidade nao encontrada
                        System.out.println("\nCidade não foi encontrado.");
                    }
                    else{
                        cidades.remove(temp);
                        System.out.println("\nCidade excluída com sucesso!");
                    }
                     break;

                case 5: //atualizar cidade
                    System.out.print("\nInforme o UF ou nome da cidade a ser atualizada: ");
                    pesquisaCidade = entrada.nextLine();
                    temp = pesquisarCidade(pesquisaCidade);
                    if(temp == null){ // cidade nao encontrada
                        System.out.println("\nCidade não foi encontrado.");
                    }
                    else{
                        // mostra o usuário encontrado
                        System.out.println("Id:          \t" + temp.getIdCidade());
                        System.out.println("Nome Cidade: \t" + temp.getDescCidade());
                        System.out.println("UF:          \t" + temp.getEstado().getUfEstado());
                        System.out.println("===========================================================");
                        System.out.print("\nNovo Nome da Cidade: ");
                        String novoDescCidade = entrada.nextLine();

                        // para cadastrar uma nova cidade precisa de um ESTADO
                        Estado novoEstado = null; // ESTADO
                        while (novoEstado == null) {
                            System.out.print("Informe o id, UF ou nome do Estado: ");
                            String pesquisaEstado = entrada.nextLine();
                            // método que pesquisa
                            novoEstado = pesquisarEstado(pesquisaEstado);
                            if (novoEstado == null) { // Estado não encotrado
                                System.out.print("\nEstado não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                                int opcaoTemp = Integer.parseInt(entrada.nextLine());
                                if (opcaoTemp == 2) {
                                    return 1; // volta para o menu anterior
                                }
                            }
                        }
                        System.out.println("Novo Estado selecionado: " + novoEstado.getDescEstado() + " - " + novoEstado.getUfEstado());
                        // fim para encontrar estado
                        // atualiza
                        temp.setDescCidade(novoDescCidade);
                        temp.setEstado(novoEstado);
                        System.out.println("\nA Cidade atualizada com sucesso");
                    }
                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }
    }
    private Cidade pesquisarCidade(String pesquisaCidade) {
        Cidade cidade = null;

        // existe?
        for(int i = 0; i < cidades.size(); i++){
            // pesquisa pelo id
            if(Integer.toString(cidades.get(i).getIdCidade()).equals(pesquisaCidade)){
                return cidades.get(i);
            }
            // pesquisar por nome
            else if(cidades.get(i).getDescCidade().contains(pesquisaCidade)){
                return cidades.get(i);
            }
        }
         return cidade;
    }

    private int menuGerenciarRegional() {
        RegionalSenai temp;
        String pesquisaRegional;
        while (true) {
            System.out.println("\n:: G E R E N C I A R   R E G I O N A I S ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Nova Regional");
            System.out.println("2 - Listar Reginais");
            System.out.println("3 - Pesquisar Reginais");
            System.out.println("4 - Excluir Reginais");
            System.out.println("5 - Atualizar Reginais");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao) {
                case 1:
                    System.out.print("\nDescrição: ");
                    String descRegional = entrada.nextLine();
                    RegionalSenai.serialRegional++;
                    RegionalSenai reg = new RegionalSenai(RegionalSenai.serialRegional, descRegional);
                    regionais.add(reg);
                    System.out.println("\nO Regional foi cadastrado com sucesso");
                    break;

                case 2:
                    if (regionais.isEmpty()) {
                        System.out.println("\nNão há nenhuma Regional cadastrado.");
                    } else {
                        for (int i = 0; i < regionais.size(); i++) {
                            temp = regionais.get(i); // obtém o autor da iteração atual
                            System.out.println("\nId:         \t" + temp.getIdRegionalSenai());
                            System.out.println("Descrição:    \t" + temp.getDescRegionalSenai());
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme O ID ou descrição da Regional: ");
                    pesquisaRegional = entrada.nextLine();
                    // método que pesquisa o Estado
                    temp = pesquisarRegionais(pesquisaRegional);
                    if (temp == null) {
                        System.out.println("\nA Regional náo foi encontrada.");
                    } else {
                        // mostra o Regional
                        System.out.println("\nId:         \t" + temp.getIdRegionalSenai());
                        System.out.println("Descrição:    \t" + temp.getDescRegionalSenai());
                    }

                    break;
                case 4:
                    System.out.print("\nInforme o ID ou descricao da Regional a ser excluído: ");
                    pesquisaRegional = entrada.nextLine();
                    temp = pesquisarRegionais(pesquisaRegional);
                    if (temp == null) { // autor não encontrado
                        System.out.println("\nA Regional não foi encontrado.");
                    } else {
                            estados.remove(temp);
                            System.out.println("\nA Regional foi excluída com sucesso.");
                    }

                    break;

                case 5: // Atualizar
                    System.out.print("\nInforme O ID ou descricao da Regional a ser atualizado: ");
                    pesquisaRegional = entrada.nextLine();
                    // chamamos o método que pesquisa o estaDO
                    temp = pesquisarRegionais(pesquisaRegional);
                    if (temp == null) { // não encotrado
                        System.out.println("\nA Regional " + temp.getDescRegionalSenai() + " não foi encontrado.");
                    } else {
                        // mostra o estado encontrado
                        System.out.println("\nDados atuais desta Regional:");
                        System.out.println("Id:          \t" + temp.getIdRegionalSenai());
                        System.out.println("Descrição:   \t" + temp.getDescRegionalSenai());

                        System.out.println("\nInforme os novos dados:");
                        System.out.print("\nNova Descrição dA Regional SENAI: ");
                        String novaDescRegional = entrada.nextLine();
                        // atualizar os dados no ArrayList
                        temp.setDescRegionalSenai(novaDescRegional);
                        System.out.println("\nA Regional foi atualizada com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }
    }
    private RegionalSenai pesquisarRegionais(String pesquisaRegional) {
        RegionalSenai reg = null;

        // verifica
        for(int i = 0; i < regionais.size(); i++){
            // pesquisa pelo UF
            if(Integer.toString(regionais.get(i).getIdRegionalSenai()).equals(pesquisaRegional)){
                return regionais.get(i);
            }
            // pesquisar por desc
            else if(regionais.get(i).getDescRegionalSenai().contains(pesquisaRegional)){
                return regionais.get(i);
            }
        }

        return reg;
    }

    private int menuGerenciarPerfil() {
        Perfil temp;
        String pesquisaPerfil;
        while (true){
            System.out.println("\n:: G E R E N C I A R   P E R F I L ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Novo Perfil");
            System.out.println("2 - Listar Perfis");
            System.out.println("3 - Pesquisar Perfis");
            System.out.println("4 - Excluir Perfil");
            System.out.println("5 - Atualizar Perfil");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao){
                case 1: // vamos cadastrar um novo autor
                    System.out.print("Nome: ");
                    String nomePerfil= entrada.nextLine();

                    System.out.print("\nDescrição: ");
                    String descPerfil = entrada.nextLine();

                    Perfil.serialPerfil++;
                    Perfil per = new Perfil(Perfil.serialPerfil, nomePerfil,descPerfil);
                    perfis.add(per);

                    System.out.println("\nO Perfil foi cadastrado com sucesso");

                    break;

                case 2:
                    if(perfis.isEmpty()){
                        System.out.println("\nNão há nenhum Perfil cadastrado.");
                    }
                    else{
                        for(int i = 0; i < perfis.size(); i++){
                            temp = perfis.get(i); // obtém o autor da iteração atual
                            System.out.println("Id:           \t" + temp.getIdPerfil());
                            System.out.println("Nome:         \t" + temp.getNomePerfil());
                            System.out.println("Descrição:    \t" + temp.getDescricaoPerfil());
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme a UF ou descrição do Perfil: ");
                    pesquisaPerfil = entrada.nextLine();
                    // método que pesquisa o Perfil
                    temp = pesquisarPerfil(pesquisaPerfil);
                    if(temp == null){
                        System.out.println("\nO Perfil náo foi encontrado.");
                    }
                    else{
                        // mostra o Perfil
                        System.out.println("Id:           \t" + temp.getIdPerfil());
                        System.out.println("Nome:         \t" + temp.getNomePerfil());
                        System.out.println("Descrição:    \t" + temp.getDescricaoPerfil());
                    }

                    break;
                case 4:
                    System.out.print("\nInforme a UF ou descricao do Perfil a ser excluído: ");
                    pesquisaPerfil = entrada.nextLine();
                    temp = pesquisarPerfil(pesquisaPerfil);
                    if(temp == null){ // autor não encontrado
                        System.out.println("\nO Perfil não foi encontrado.");
                    }
                    else{
                        // vamos excluir este Perfil. Atenção: Se houver Cidades relacionadas
                        // a este Perfil, então a exclusão destes deverá ser feita primeiro
                        if(temp.getCidades(cidades).size() > 0){
                            System.out.println("\nOps! Este Perfil está relacionado a " + temp.getCidades(cidades).size() + ". Exclua eles primeiro.");
                        }
                        else{
                            Perfils.remove(temp);
                            System.out.println("\nPerfil foi excluído com sucesso.");
                        }
                    }

                    break;

                case 5: // vamos atualizar um autor
                    System.out.print("\nInforme a UF ou descricao do Perfil a ser atualizado: ");
                    pesquisaPerfil = entrada.nextLine();
                    // chamamos o método que pesquisa o Perfil
                    temp = pesquisarPerfil(pesquisaPerfil);
                    if(temp == null){ // não encotrado
                        System.out.println("\nO Perfil "+temp.getDescPerfil() +" não foi encontrado.");
                    }
                    else{
                        // mostra o Perfil encontrado
                        System.out.println("\nDados atuais deste autor:");
                        System.out.println("\nId:         \t" + temp.getIdPerfil());
                        System.out.println("Descrição:    \t" + temp.getDescPerfil());
                        System.out.println("UF:           \t" + temp.getUfPerfil());
                        System.out.println("Quant Cidades:\t" + temp.getCidades(cidades).size());

                        System.out.println("\nInforme os novos dados:");
                        System.out.print("\nNova Descrição do Perfil: ");
                        String novaDescPerfil = entrada.nextLine();
                        System.out.print("Nova UF do Perfil: ");
                        String novoUF = entrada.nextLine();

                        // atualizar os dados no ArrayList
                        temp.setDescPerfil(novaDescPerfil);
                        temp.setUfPerfil(novoUF);
                        System.out.println("\nPerfil atualizado com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }


    }

//    public static void main(String[] args) {
//        // chama o menu principal do sistema
//        Main m = new Main();
//        m.menuPrincipal();
//
//        // TESTAR CNPJ

//        String CNPJ = "14572457000185";
//        System.out.printf("Informe um CNPJ: ");
//        System.out.println("O CNPJ informado foi "+CNPJ);;
//
//        System.out.printf("\nResultado: ");
//        // usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
//        if (ValidaCNPJ.isCNPJ(CNPJ) == true)
//            System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
//        else System.out.printf("Erro, CNPJ inválido !!!\n");

//        // TESTAR CPF
//        //Scanner ler = new Scanner(System.in);
//        String CPF = "56562632900";
//        System.out.printf("Informe um CPF: ");
//        System.out.println("O CPF informado foi "+ CPF);;
//
//        System.out.printf("\nResultado: ");
//        // usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
//        if (ValidarCPF.isCPF(CPF) == true)
//            System.out.printf("%s\n", ValidarCPF.imprimeCPF(CPF));
//        else System.out.printf("Erro, CPF inválido !!!\n");

//        //Popular tabela Estado
//
//        Cidade cid1 = new Cidade(1,"Florianópolis");
//
//        Estado.serialEstado++; //incrementar o contador de contas
//        Estado est = new Estado(Estado.serialEstado,"Santa Catarina","SC",);
//        estados.add(est); //adiciona no ArrayList de contas
//        // e finalmente mostramos uma mensagem de sucesso.
//        System.out.println("\nEstado cadastrado com sucesso");
//        System.out.println(estados);

        // popular tabela Cidade
        // popular tabela segmentoEmpresa
        // popular tabela regionalSenai


    //}// FIM MAIN

}//FIM CLASSE MAIN




