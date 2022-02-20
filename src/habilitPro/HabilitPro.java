package habilitPro;

import habilitPro.Utils.*;
import habilitPro.enums.EnumTotal;

import javax.naming.ldap.StartTlsRequest;
import javax.swing.plaf.synth.Region;
import java.sql.SQLOutput;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class HabilitPro {

    // ARRAYS PARA TESTE
    public static ArrayList<Cidade> cidades = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Estado> estados = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<RegionalSenai> regionais = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<SegmentoEmpresa> segmentos = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Empresa> empresas = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Trabalhador> trabalhadores = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Trilha> trilhas = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Modulo> modulos = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Perfil> perfis = new ArrayList<>();// BANCO DE DADOS
    public static ArrayList<Usuario> usuarios = new ArrayList<>();// BANCO DE DADOS
    // FIM ARRAYS TESTE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // VARIAVEIS UTILs++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Scanner entrada = new Scanner(System.in);
    LimparTela limpatela = new LimparTela();

    public static void main(String[] args) {

        //POPULAR ARRAY Estado
        Estado.serialEstado++;
        Estado est1 = new Estado(Estado.serialEstado,"Santa Catarina","SC");
        estados.add(est1);
        System.out.println("teste estado:"+ estados);
        //POPULAR ARRAY Cidade
        Cidade.serialCidade++;
        Cidade cid1 = new Cidade(Cidade.serialCidade,"Florianópolis",est1);
        cidades.add(cid1);
        //POPULAR ARRAY Regional
        RegionalSenai.serialRegional++;
        RegionalSenai reg1 = new RegionalSenai(RegionalSenai.serialRegional,"Litoral Sul");
        regionais.add(reg1);
        //POPULAR ARRAY Segmento Senai
        SegmentoEmpresa.serialSegmento++;
        SegmentoEmpresa seg1 = new SegmentoEmpresa(SegmentoEmpresa.serialSegmento,"Alimentos e Bebidas");
        SegmentoEmpresa seg2 = new SegmentoEmpresa(SegmentoEmpresa.serialSegmento++,"Celulose e Papel");
        SegmentoEmpresa seg3 = new SegmentoEmpresa(SegmentoEmpresa.serialSegmento++,"Construção");
        SegmentoEmpresa seg4 = new SegmentoEmpresa(SegmentoEmpresa.serialSegmento++,"Equipamentos elétricos");
        SegmentoEmpresa seg5 = new SegmentoEmpresa(SegmentoEmpresa.serialSegmento++,"Fumo");
        segmentos.add(seg1);
        segmentos.add(seg2);
        segmentos.add(seg3);
        segmentos.add(seg4);
        segmentos.add(seg5);
        //POPULAR ARRAY Empresa
        Empresa.serialEmpresa++;
        Empresa emp1 = new Empresa(Empresa.serialEmpresa, "Copos SA","CNPJEmpresa",EnumTotal.MATRIZ.getValue(),seg1,cid1,reg1);
        empresas.add(emp1);
        Empresa.serialEmpresa++;
        Empresa emp2 = new Empresa(Empresa.serialEmpresa++,"Latas SA","CNPJEmpresa",EnumTotal.FILIAL.getValue(),"Filial - Norte",seg2,cid1,reg1);
        empresas.add(emp2);
        //POPULAR ARRAY Trabalhador
        Trabalhador.serialTrabalhador++;
        Trabalhador trab1 = new Trabalhador(Trabalhador.serialTrabalhador, "Jair Silva","12346578910","Aux Escritório");
        trabalhadores.add(trab1);
        //POPULAR ARRAY Trilha
        Trilha.serialTrilha++;
        Trilha tri = new Trilha(Trilha.serialTrilha,emp2,"Auxiliar","nomeTrilha","apelidoTrilha",1,"Anotações da trilha teste");
        trilhas.add(tri);
        //POPULAR ARRAY Módulo
        Modulo.serialModulo++;
        Modulo mod1 = new Modulo(Modulo.serialModulo,tri,"nomemodulo","Habilidades descritas no Modulo", "tarefa de Validação do Modulo",50,EnumTotal.NAOINICIADO.getDisplayName());
        modulos.add(mod1);
        //POPULAR ARRAY Perfil
        Perfil.serialPerfil++;
        Perfil per1 = new Perfil(Perfil.serialPerfil, "Administrativo","Realizar cadastros gerais, parametrizações e emissão de relatórios");
        perfis.add(per1);
        Perfil.serialPerfil++;
        Perfil per2 = new Perfil(Perfil.serialPerfil, "Operacional","Realizar processo de avaliação e emissão de relatórios");
        perfis.add(per2);
        Perfil.serialPerfil++;
        Perfil per3 = new Perfil(Perfil.serialPerfil, "EquipeRH","Acompanhar processo de avaliação e emissão de relatórios");
        perfis.add(per3);
        //POPULAR ARRAY Usuário
        Usuario.serialUsuario++;
        Usuario usu1 = new Usuario(Usuario.serialUsuario, "Usuario Admin","10987654321","admin@admin.com","Admin@123");
        usuarios.add(usu1);
        Usuario.serialUsuario++;
        Usuario usu2 = new Usuario(Usuario.serialUsuario, "Usuario Oper","10987654321","admin@admin.com","Admin@123");
        usuarios.add(usu2);
        Usuario.serialUsuario++;
        Usuario usu3 = new Usuario(Usuario.serialUsuario, "Usuario RH","10987654321","admin@admin.com","Admin@123");
        usuarios.add(usu3);

        HabilitPro mainTestes = new HabilitPro();
        mainTestes.menuPrincipal();
    }

    // método que exibe o menu principal do sistema
    public void menuPrincipal(){

        while(true){
            System.out.println("--------------------------------------------------");
            System.out.println("::              H A B I L I T  P R O            ::");
            System.out.println("--------------------------------------------------");
            System.out.println("\nBem-vindo(a) ao sistema. Escolha a opção desejada");
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
            //limpatela.limparTela();
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

                case 4:
                    menuGerenciarSegmento();
                    break;

                case 5:
                    menuGerenciarEmpresa();
                    break;

                case 6:
                    // chama o menu de gerenciamento de multas
                    menuGerenciarTrabalhador();
                    break;
                case 7:
                    // chama o menu de gerenciamento de multas
                    menuGerenciarTrilha();
                    break;
                case 8:
                    // chama o menu de gerenciamento de modulos
                    menuGerenciarModulo();
                    break;
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
            //limpatela.limparTela();

            switch (opcao){
                case 1: // vamos cadastrar um novo autor
                    System.out.print("\nDescrição do Estado: ");
                    String descEstado = entrada.nextLine();
                    //TODO: EXEMPLO DE VALIDAÇÂO DE ENTRADA DE STRING, SE DER TEMPO COLOCO NOS OUTROS CAMPOS
                    while(ValidaCampoString.validaString(descEstado) == false){
                        System.out.print("\nDigite uma descrição do Estado válida: ");
                        descEstado = entrada.nextLine();
                    }
                    System.out.print("UF do Estado: ");
                    String ufEstado= entrada.nextLine();

                    Estado.serialEstado++;
                    Estado est = new Estado(Estado.serialEstado, descEstado,ufEstado);
                    estados.add(est);
                    System.out.println("--------------------------------------------------");
                    System.out.println("-      O Estado foi cadastrado com sucesso!      -");
                    System.out.println("--------------------------------------------------");

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
                        System.out.print("Informe o UF ou nome do Estado: ");
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
                    System.out.print("\nInforme o ID ou nome da Cidade: ");
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
                    System.out.print("\nInforme o ID ou nome da cidade a ser excluída: ");
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
                    System.out.print("\nInforme o ID ou nome da cidade a ser atualizada: ");
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
        //TODO: [RN01-05] = cadastra cada regional
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
                    if (temp == null) { // não encontrado
                        System.out.println("\nA Regional não foi encontrado.");
                    } else {
                        regionais.remove(temp);
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

    private int menuGerenciarSegmento() {
        SegmentoEmpresa temp;
        String pesquisaSegmento;
        while (true) {
            System.out.println("\n:: G E R E N C I A R   S E G M E N T O ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Nova Segmento");
            System.out.println("2 - Listar Segmentos");
            System.out.println("3 - Pesquisar Segmento");
            System.out.println("4 - Excluir Segmentos");
            System.out.println("5 - Atualizar Segmento");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao) {
                case 1:
                    System.out.print("\nDescrição: ");
                    String descSegmento = entrada.nextLine();
                    SegmentoEmpresa.serialSegmento++;
                    SegmentoEmpresa seg = new SegmentoEmpresa(SegmentoEmpresa.serialSegmento, descSegmento);
                    segmentos.add(seg);
                    System.out.println("\nO Segmento foi cadastrado com sucesso");
                    break;

                case 2:
                    if (segmentos.isEmpty()) {
                        System.out.println("\nNão há nenhuma Segmento cadastrado.");
                    } else {
                        for (int i = 0; i < segmentos.size(); i++) {
                            temp = segmentos.get(i); // obtém o autor da iteração atual
                            System.out.println("\nId:         \t" + temp.getIdSegmentoEmpresa());
                            System.out.println("Descrição:    \t" + temp.getDescricaoSegmento());
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme O ID ou descrição da Segmento: ");
                    pesquisaSegmento = entrada.nextLine();
                    // método que pesquisa
                    temp = pesquisarSegmento(pesquisaSegmento);
                    if (temp == null) {
                        System.out.println("\nA Segmento não foi encontrada.");
                    } else {
                        // mostra o Segmento
                        System.out.println("\nId:         \t" + temp.getIdSegmentoEmpresa());
                        System.out.println("Descrição:    \t" + temp.getDescricaoSegmento());
                    }

                    break;
                case 4:
                    System.out.print("\nInforme o ID ou descricao da Segmento a ser excluído: ");
                    pesquisaSegmento = entrada.nextLine();
                    temp = pesquisarSegmento(pesquisaSegmento);
                    if (temp == null) { // autor não encontrado
                        System.out.println("\nA Segmento não foi encontrado.");
                    } else {
                        segmentos.remove(temp);
                        System.out.println("\nA Segmento foi excluída com sucesso.");
                    }
                    break;

                case 5: // Atualizar
                    System.out.print("\nInforme O ID ou descricao da Segmento a ser atualizado: ");
                    pesquisaSegmento = entrada.nextLine();
                    // chamamos o método que pesquisa o estaDO
                    temp = pesquisarSegmento(pesquisaSegmento);
                    if (temp == null) { // não encotrado
                        System.out.println("\nA Segmento " + pesquisaSegmento + " não foi encontrado.");
                    } else {
                        // mostra o estado encontrado
                        System.out.println("\nDados atuais desta Segmento:");
                        System.out.println("Id:          \t" + temp.getIdSegmentoEmpresa());
                        System.out.println("Descrição:   \t" + temp.getDescricaoSegmento());

                        System.out.println("\nInforme os novos dados:");
                        System.out.print("\nNova Descrição da Segmento da empresa: ");
                        String novaDescSegmento = entrada.nextLine();
                        // atualizar os dados no ArrayList
                        temp.setDescricaoSegmento(novaDescSegmento);
                        System.out.println("\nA Segmento foi atualizada com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }

    }
    private SegmentoEmpresa pesquisarSegmento(String pesquisaSegmento) {
        SegmentoEmpresa seg = null;

        // verifica
        for(int i = 0; i < segmentos.size(); i++){
            // pesquisa
            if(Integer.toString(segmentos.get(i).getIdSegmentoEmpresa()).equals(pesquisaSegmento)){
                return segmentos.get(i);
            }
            // pesquisar por desc
            else if(segmentos.get(i).getDescricaoSegmento().contains(pesquisaSegmento)){
                return segmentos.get(i);
            }
        }

        return seg;
    }

    private int menuGerenciarEmpresa() {
        Empresa temp; // serve para várias operações neste menu
        String pesquisaEmpresa;
        String tipoEmpresa;
        String nomeFilial = "Não tem filial";
        while (true) { // mostra o menu de forma repetitiva até o usuário usar a opção de sair
            System.out.println("\n:: G E R E N C I A R   E M P R E S A ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Nova Empresa");
            System.out.println("2 - Listar Empresas");
            System.out.println("3 - Pesquisar Empresa");
            //System.out.println("4 - Excluir Empresa");
            System.out.println("5 - Associar Trilha a Empresa");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine()); // lê a opção do usuário
            limpatela.limparTela();
            switch (opcao) {
                case 1:
                    System.out.print("\nNome da Empresa: ");
                    String nomeEmpresa = entrada.nextLine();
                    System.out.print("\nCNPJ da Empresa: ");
                    String CNPJEmpresa = entrada.nextLine();
                    //TODO: [RN01-01] = ok CNPJ teste 14572457000185
                    while(ValidaCNPJ.isCNPJ(CNPJEmpresa) == false){
                        System.out.println("\nO CNPJ digitado é inválido!!");
                        System.out.print("\nDigite um CNPJ válido: ");
                        CNPJEmpresa = entrada.nextLine();
                    }
                    System.out.printf("\nCNPJ digitado: "+ ValidaCNPJ.imprimeCNPJ(CNPJEmpresa));
                    //TODO: [RN01-03] = OK
                    System.out.print("\nTipo da Empresa:\n 1 - Matriz \n 2 - Filial ");
                    int optipoEmpresa = entrada.nextInt();
                    entrada.nextLine();
                    if (optipoEmpresa == 1){
                        tipoEmpresa = EnumTotal.MATRIZ.getDisplayName();
                    }else{
                        tipoEmpresa = EnumTotal.FILIAL.getDisplayName();
                        System.out.print("\nNome da Filial da Empresa: ");
                        nomeFilial = entrada.nextLine();
                    }

                    // para cadastrar uma nova EMPRESA precisa de uma cidade
                    Cidade cidade = null; // CIDADE
                    while (cidade == null) {
                        System.out.println("Para cadastrar uma nova EMPRESA precisa de uma cidade");
                        System.out.print("Informe o id ou nome da Cidade: ");
                        String pesquisaCidade = entrada.nextLine();
                        // chamamos o método que pesquisa o autor
                        cidade = pesquisarCidade(pesquisaCidade);
                        if (cidade == null) { // Estado não encotrado
                            System.out.print("\nEstado não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Cidade selecionada: " + cidade.getDescCidade() + " - " + cidade.getEstado().getUfEstado());

                    // fim para encontrar SEGMENTO
                    // TODO: [RN01-02] = pesquisa o segmento previamente cadastrado
                    SegmentoEmpresa segmento = null; // SEGmento
                    while (segmento == null) {
                        System.out.print("Informe o id ou nome o Segmento: ");
                        String pesquisaSegmento = entrada.nextLine();
                        // chamamos o método que pesquisa o autor
                        segmento = pesquisarSegmento(pesquisaSegmento);
                        if (segmento == null) { // Estado não encotrado
                            System.out.print("\nSegmmento não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Cidade selecionada: " + cidade.getDescCidade() + " - " + cidade.getEstado().getUfEstado());
                    System.out.println("Segmento selecionada: " + segmento.getDescricaoSegmento());
                    // fim para encontrar estado
                    // contador de cidade
                    // TODO: [RN01-05] = pesquisa a regional previamente cadastrado
                    RegionalSenai regional = null; // REGIONAL
                    while (regional == null) {
                        System.out.print("Informe o id ou nome da Regional: ");
                        String pesquisaRegional = entrada.nextLine();
                        // chamamos o método que pesquisa o autor
                        regional = pesquisarRegionais(pesquisaRegional);
                        if (regional == null) { // Estado não encotrado
                            System.out.print("\nRegional não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Cidade selecionada: " + cidade.getDescCidade() + " - " + cidade.getEstado().getUfEstado());
                    System.out.println("Segmento selecionada: " + segmento.getDescricaoSegmento());
                    System.out.println("Regional selecionada: " + regional.getDescRegionalSenai());
                    // fim para encontrar estado


                    Trilha trilha = null; // TRILHA
                    while (trilha == null) {
                        System.out.print("Informe o id ou nome da Trilha: ");
                        String pesquisaTrilha = entrada.nextLine();
                        // chamamos o método que pesquisa o autor
                        trilha = pesquisarTrilha(pesquisaTrilha);
                        if (trilha == null) { // Estado não encotrado
                            System.out.print("\nRegional não encontrado.\n\nDigite 1 para pesquisar novamente\n2 para voltar ao menu anterior");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("Cidade selecionada:    \t" + cidade.getDescCidade() + " - " + cidade.getEstado().getUfEstado());
                    System.out.println("Segmento selecionada:  \t" + segmento.getDescricaoSegmento());
                    System.out.println("Regional selecionada:  \t" + regional.getDescRegionalSenai());
                    System.out.println("Trilha Selecionada:    \t" + trilha.getNome());
                    Empresa.serialEmpresa++;
                    Empresa emp;
                    if(tipoEmpresa.equals(EnumTotal.MATRIZ.getDisplayName())){
                        emp = new Empresa(Empresa.serialEmpresa, nomeEmpresa,CNPJEmpresa,EnumTotal.MATRIZ.getDisplayName(),segmento,cidade,regional);
                    }else {
                        emp = new Empresa(Empresa.serialEmpresa,nomeEmpresa,CNPJEmpresa,EnumTotal.FILIAL.getDisplayName(),nomeFilial,segmento,cidade,regional);
                    }

                    // e o adiciona no ArrayList de cidades
                    empresas.add(emp);

                    System.out.println("\nA Empresa cadastrada com sucesso");

                    break;
                case 2:// lista
                    if (empresas.isEmpty()) {
                        System.out.println("\nNão há nenhum empresa registrado.");
                    } else {
                        for (int i = 0; i < empresas.size(); i++) {
                            temp = empresas.get(i); // obtém o empréstimo da iteração atual
                            System.out.println("\nId:             \t" + temp.getIdEmpresa());
                            System.out.println("Nome da Empresa:  \t" + temp.getNomeEmpresa());
                            System.out.println("CNPJ:             \t" + temp.getCNPJEmpresa());
                            if (temp.getTipoEmpresa().equals(EnumTotal.MATRIZ)) {
                                System.out.println("Tipo :            \t" + temp.getTipoEmpresa());
                            } else {
                                System.out.println("Tipo :            \t" + temp.getTipoEmpresa());
                                System.out.println("Nome Filial       \t" + temp.getNomeFilial());
                            }
                            System.out.println("Segmento Empresa: \t" + (temp.getSegmentoEmpresa().getDescricaoSegmento()));
                            System.out.println("Cidade:           \t" + (temp.getCidadeEmpresa().getDescCidade()));
                            System.out.println("Estado:           \t" + (temp.getCidadeEmpresa().getEstado().getUfEstado()));
                            System.out.println("Regional SENAI:   \t" + (temp.getRegionalSenai().getDescRegionalSenai()));
                            System.out.println("Trilha            \t") ;
                                for( int j =0; j< temp.getTrilhaEmp().size(); j++){
                                  System.out.print(temp.getTrilhaEmp().get(j).getNome()+" | ");
                                };
                            System.out.println("\n------------------------------------------");
                        }
                    }
                    break;
                case 3:// pesquisa
                    System.out.print("\nInforme o ID, CNPJ ou Nome da Empresa: ");
                    pesquisaEmpresa = entrada.nextLine();
                    // chamamos o método que pesquisa
                    temp = pesquisarEmpresa(pesquisaEmpresa);
                    if(temp == null){ // empréstimo não encontrado
                        System.out.println("\nO empréstimo náo foi encontrado.");
                    }else {
                        System.out.println("\nId:             \t" + temp.getIdEmpresa());
                        System.out.println("Nome da Empresa:  \t" + temp.getNomeEmpresa());
                        System.out.println("CNPJ:             \t" + temp.getCNPJEmpresa());
                        if (temp.getTipoEmpresa().equals(EnumTotal.MATRIZ)) {
                            System.out.println("Tipo :            \t" + temp.getTipoEmpresa());
                        } else {
                            System.out.println("Tipo :            \t" + temp.getTipoEmpresa());
                            System.out.println("Nome Filial       \t" + temp.getNomeFilial());
                        }
                        System.out.println("Segmento Empresa: \t" + (temp.getSegmentoEmpresa().getDescricaoSegmento()));
                        System.out.println("Cidade:           \t" + (temp.getCidadeEmpresa().getDescCidade()));
                        System.out.println("Estado:           \t" + (temp.getCidadeEmpresa().getEstado().getUfEstado()));
                        System.out.println("Regional SENAI:   \t" + (temp.getRegionalSenai().getDescRegionalSenai()));
                        System.out.println("Trilha            \t");
                        for( int j =0; j< temp.getTrilhaEmp().size(); j++){
                            System.out.print(temp.getTrilhaEmp().get(j).getNome()+" | ");
                        };
                        System.out.println("\n------------------------------------------");
                    }

                    break;
                case 4:// excluir
                    System.out.println("Informa o ID da Empresa a ser excluido:");
                    pesquisaEmpresa = entrada.nextLine();
                    System.out.print("\nInforme o ID, CNPJ ou Nome da Empresa: ");
                    pesquisaEmpresa = entrada.nextLine();
                    // chamamos o método que pesquisa
                    temp = pesquisarEmpresa(pesquisaEmpresa);
                    if(temp == null){ // empréstimo não encontrado
                        System.out.println("\nO empréstimo náo foi encontrado.");
                    }else {
                        // vamos excluir este Empresa. Atenção: Se houver Cidades relacionadas
                        // a este Estado, então a exclusão destes deverá ser feita primeiro
                        if(temp.getTrilhaEmp() != null){
                            System.out.println("\nOps! Esta empresa está relacionado a uumma ou mais trilhas. Exclua eles primeiro.");
                        }
                        else{
                            estados.remove(temp);
                            System.out.println("\nEstado foi excluído com sucesso.");
                        }
                    }
                    break;
                case 5:
                    System.out.print("\nInforme a ID ou descricao da Empresa a ser associada: ");
                    pesquisaEmpresa = entrada.nextLine();
                    // chamamos o método que pesquisa o Usuario
                    temp = pesquisarEmpresa(pesquisaEmpresa);
                    if(temp == null){ // não encotrado
                        System.out.println("\nA empresa "+pesquisaEmpresa+" não foi encontrada.");
                    }
                    else {
                        // mostra a encontrado
                        System.out.println("\nDados atuais desta Empresa:");
                        System.out.println("\nId:             \t" + temp.getIdEmpresa());
                        System.out.println("Nome da Empresa:  \t" + temp.getNomeEmpresa());
                        System.out.println("CNPJ:             \t" + temp.getCNPJEmpresa());
                        if (temp.getTipoEmpresa().equals(EnumTotal.MATRIZ)) {
                            System.out.println("Tipo :            \t" + temp.getTipoEmpresa());
                        } else {
                            System.out.println("Tipo :            \t" + temp.getTipoEmpresa());
                            System.out.println("Nome Filial       \t" + temp.getNomeFilial());
                        }
                        System.out.println("Segmento Empresa: \t" + (temp.getSegmentoEmpresa().getDescricaoSegmento()));
                        System.out.println("Cidade:           \t" + (temp.getCidadeEmpresa().getDescCidade()));
                        System.out.println("Estado:           \t" + (temp.getCidadeEmpresa().getEstado().getUfEstado()));
                        System.out.println("Regional SENAI:   \t" + (temp.getRegionalSenai().getDescRegionalSenai()));
                        System.out.println("Trilha            \t" + temp.getTrilhaEmp());
                        //System.out.println("Qt Perfil:    \t" + temp.getPerfilUsu().size());
                        System.out.println("==========================================================");

                        System.out.println("Vamos adicionar uma Trilha a empresa "+temp.getNomeEmpresa());

                        Trilha trilhaList = null; // trilha
                        if (trilhas.isEmpty()) {
                            System.out.println("\nNão há nenhuma trilha cadastrado.");
                        } else {
                            for (int i = 0; i < trilhas.size(); i++) {
                                trilhaList = trilhas.get(i); //
                                System.out.println(trilhaList.getIdTrilha() + " - Trilha: " + trilhaList.getNome());
                            }
                        }
                        System.out.print("Informe o numero da trilha: ");
                        int trilhaNova = entrada.nextInt();
                        entrada.nextLine();
                        trilhaNova--;
                        System.out.println("Trilha selecionado: " + trilhas.get(trilhaNova));
                        // fim para encontrar estado
                        //TODO: [RN05-04] = OK
                        Trilha tril = new Trilha(trilhas.get(trilhaNova).getIdTrilha(),trilhas.get(trilhaNova).getEmpresa(),
                                trilhas.get(trilhaNova).getOcupacao(),trilhas.get(trilhaNova).getNome(),trilhas.get(trilhaNova).getApelido());
                        temp.getTrilhaEmp().add(tril);

                        System.out.println("\nTrilha "+tril.getNome()+" Associada A empres "+ tril.getEmpresa().getNomeEmpresa()+" com sucesso!");
                    }
                    break;
                case 6:
                    return 0;

            }
        }

    }
    private Empresa pesquisarEmpresa(String pesquisaEmpresa) {
        Empresa emp = null;
        // verifica
        for(int i = 0; i < empresas.size(); i++){
            // pesquisa por ID
            if(Integer.toString(empresas.get(i).getIdEmpresa()).equals(pesquisaEmpresa)){
                return empresas.get(i);
            }
            // pesquisar por nome
            else if(empresas.get(i).getNomeEmpresa().contains(pesquisaEmpresa)){
                return empresas.get(i);
            }
            // pesquisar por nome
            else if(empresas.get(i).getCNPJEmpresa().contains(pesquisaEmpresa)){
                return empresas.get(i);
            }
        }

        return emp;
    }

    private int menuGerenciarTrilha() {
        Trilha temp; // serve para várias operações neste menu
        String pesquisaTrilha;
        int novoSatisfacao;
        int opSat =0;

        while (true) { // mostra o menu de forma repetitiva até o usuário usar a opção de sair
            System.out.println("\n:: G E R E N C I A R   T R I L H A ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Nova Trilha");
            System.out.println("2 - Listar Trilha");
            System.out.println("3 - Pesquisar Trilha");
            System.out.println("4 - Excluir Trilha");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine()); // lê a opção do usuário
            limpatela.limparTela();
            switch (opcao) {
                case 1:
                   // para cadastrar uma nova trilha precisa de uma Empresa
                    Empresa empresa = null; // empresa
                    while (empresa == null) {
                        System.out.println("Para cadastrar uma nova trilha precisa de uma Empresa");
                        System.out.println("Informe o id, CNPJ ou nome da Empresa: ");
                        String pesquisaEmpresa = entrada.nextLine();
                        // método pesquisa
                        empresa = pesquisarEmpresa(pesquisaEmpresa);
                        if (empresa == null) { // Estado não encotrado
                            System.out.print("\nEmpresa não encontrada. Digite:\n 1 para pesquisar novamente\n 2 para voltar ao menu anterior: ");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Empresa selecionado: " + empresa.getNomeEmpresa()+ " - " + empresa.getCNPJEmpresa());
                    // fim para encontrar estado

                    System.out.println("Digite o cargo/Ocupação:");
                    String ocupacao= entrada.nextLine();

                    Trilha.serialTrilha++;
                    String nomeTrilha = (ocupacao+empresa.getNomeEmpresa()+Trilha.serialOcupacao+AnoCorrente.isAno());
                    nomeTrilha = nomeTrilha.replaceAll(" ", "");
                    Trilha.serialOcupacao++;
                    String apelidoTrilha = (ocupacao+Trilha.serialOcupacao);

                    Trilha tri = new Trilha(Trilha.serialTrilha,empresa,ocupacao,nomeTrilha,apelidoTrilha,0,"");

                    // e o adiciona no ArrayList de trilhas
                    trilhas.add(tri);

                    System.out.println("\nA trilha foi cadastrada com sucesso");

                    break;
                case 2: //listar trilllhas
                    if (trilhas.isEmpty()) {
                        System.out.println("\nNão há nenhuma Trilha cadastrada!");
                    } else {
                        for (int i = 0; i < trilhas.size(); i++) {
                            temp = trilhas.get(i);
                            System.out.println("Id:                \t" + temp.getIdTrilha());
                            System.out.println("Nome Empresa:      \t" + temp.getEmpresa().getNomeEmpresa());
                            System.out.println("CNPJ Empresa:      \t" + temp.getEmpresa().getCNPJEmpresa());
                            System.out.println("Ocupação:          \t" + temp.getOcupacao());
                            System.out.println("Nome da Tilha      \t" + temp.getNome());
                            System.out.println("Apelido da Tilha   \t" + temp.getApelido());
                            System.out.println("Grau de Satisfação \t" + temp.getSatisfacao());
                            System.out.println("Anotações da Tilha \t" + temp.getAnotacoes());
                            System.out.println("-------------------------------------------------------\n");
                        }
                    }
                    break;

                case 3: // vamos pesquisar
                    System.out.print("\nInforme o ID ou nome da trilha: ");
                    pesquisaTrilha = entrada.nextLine();
                    // metodo pesquisa
                    temp = pesquisarTrilha(pesquisaTrilha);
                    if (temp == null) {
                        System.out.println("\nA trilha não foi encontrado.");
                    } else {
                        // mostra encontrado
                        System.out.println("Id:                \t" + temp.getIdTrilha());
                        System.out.println("Nome Empresa:      \t" + temp.getEmpresa().getNomeEmpresa());
                        System.out.println("CNPJ Empresa:      \t" + temp.getEmpresa().getCNPJEmpresa());
                        System.out.println("Ocupação:          \t" + temp.getOcupacao());
                        System.out.println("Nome da Tilha      \t" + temp.getNome());
                        System.out.println("Apelido da Tilha   \t" + temp.getApelido());
                        System.out.println("Grau de Satisfação \t" + temp.getSatisfacao());
                        System.out.println("Anotações da Tilha \t" + temp.getAnotacoes());
                    }

                    break;

                case 4: //excluir
                    System.out.print("\nInforme o ID ou nome da trilha: ");
                    pesquisaTrilha = entrada.nextLine();
                    // metodo pesquisa
                    temp = pesquisarTrilha(pesquisaTrilha);
                    if (temp == null) {
                        System.out.println("\nA trilha não foi encontrado.");
                    } else {
                        trilhas.remove(temp);
                        System.out.println("\nTrilha excluída com sucesso!");
                    }
                    break;

                case 5: //atualizar cidade
                    Usuario usuarioTrilha = null;
                    String novasatisfacao;
                    String novaanotacoesTrilha;
                    System.out.print("\nInforme o ID ou nome da trilha: ");
                    pesquisaTrilha = entrada.nextLine();
                    // metodo pesquisa
                    temp = pesquisarTrilha(pesquisaTrilha);
                    if (temp == null) {
                        System.out.println("\nA trilha não foi encontrado.");
                    } else {
                        // mostra o encontrado
                        System.out.println("Id:                \t" + temp.getIdTrilha());
                        System.out.println("Nome Empresa:      \t" + temp.getEmpresa().getNomeEmpresa());
                        System.out.println("CNPJ Empresa:      \t" + temp.getEmpresa().getCNPJEmpresa());
                        System.out.println("Ocupação:          \t" + temp.getOcupacao());
                        System.out.println("Nome da Tilha      \t" + temp.getNome());
                        System.out.println("Apelido da Tilha   \t" + temp.getApelido());
                        System.out.println("Grau de Satisfação \t" + temp.getSatisfacao());
                        System.out.println("Anotações da Tilha \t" + temp.getAnotacoes());
                        System.out.println("===========================================================");
                        System.out.print("\nNovo Nome da Cidade: ");
                        String novoDescCidade = entrada.nextLine();

                        // para cadastrar uma nova trilha precisa de uma Empresa
                        empresa = null; // empresa
                        while (empresa == null) {
                            System.out.print("Informe o id, CNPJ ou nome da Empresa: ");
                            String pesquisaEmpresa = entrada.nextLine();
                            // método pesquisa
                            empresa = pesquisarEmpresa(pesquisaEmpresa);
                            if (empresa == null) { // Estado não encotrado
                                System.out.print("\nEmpresa não encontrada.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                                int opcaoTemp = Integer.parseInt(entrada.nextLine());
                                if (opcaoTemp == 2) {
                                    return 1; // volta para o menu anterior
                                }
                            }
                        }
                        System.out.println("Empresa selecionado: " + empresa.getNomeEmpresa()+ " - " + empresa.getCNPJEmpresa());
                        // fim para encontrar estado

                        System.out.println("Digite o cargo/Ocupação:");
                        String novaocupacao= entrada.nextLine();
                        System.out.print("Digite o Grau de Satisfação:\n1 - 2 - 3 - 4 - 5");
                        novasatisfacao = entrada.nextLine();
                        //TODO: [RN02-05] = OK
//                        if(usuarioTrilha.getPerfilUsu()).equals("Operacional")){
                            //TODO [RN02-04] = OK
//                            while(ValidaCampoInt.validaInt(novasatisfacao)  == false){
//                                System.out.println("\nO valor digitado é inválido!!");
//                                System.out.print("\nDigite um valor válido: ");
//                                novasatisfacao = entrada.nextLine();
//                            }
//
//                            System.out.println("Digite Anotações");
//                            novaanotacoesTrilha = entrada.nextLine();
//                            temp.setAnotacoes(novaanotacoesTrilha);
//                            temp.setSatisfacao(Integer.parseInt(novasatisfacao));
//                        }

                        // atualiza
                        temp.setOcupacao(novaocupacao);

                        System.out.println("\nA Trilha atualizada com sucesso");
                    }
                    break;
                case 6:
                    return 1;
            }
        }

    }
    private Trilha pesquisarTrilha(String pesquisaTrilha) {
        Trilha tri = null;
        // verifica
        for(int i = 0; i < trilhas.size(); i++){
            // pesquisa por ID
            if(Integer.toString(trilhas.get(i).getIdTrilha()).equals(pesquisaTrilha)){
                return trilhas.get(i);
            }
            // pesquisar por nome
            else if(trilhas.get(i).getNome().contains(pesquisaTrilha)){
                return trilhas.get(i);
            }
            // pesquisar por nome
            else if(trilhas.get(i).getApelido().contains(pesquisaTrilha)){
                return trilhas.get(i);
            }
        }

        return tri;
    }

    private int menuGerenciarTrabalhador() {
        Trabalhador temp;
        String pesquisaTrabalhador;
        while (true) {
            System.out.println("\n:: G E R E N C I A R   R E G I O N A I S ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Novo Trabalhador");
            System.out.println("2 - Listar Trabalhadores");
            System.out.println("3 - Pesquisar Trabalhador");
            System.out.println("4 - Excluir Trabalhador");
            System.out.println("5 - Atualizar Trabalhador");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao) {
                case 1:
                    System.out.print("\nNome: ");
                    String nomeTrabalhador = entrada.nextLine();
                    System.out.print("\nCPF: ");
                    String CPFTrabalhador = entrada.nextLine();
                    //TODO : valida CPF ( RN04-016)
                    while(ValidarCPF.isCPF(CPFTrabalhador) == false){
                        System.out.println("\nO CPF digitado é inválido!!");
                        System.out.print("\nDigite um CPF válido: ");
                        CPFTrabalhador = entrada.nextLine();
                    }
                    System.out.printf("\nCPF digitado: "+ ValidarCPF.imprimeCPF(CPFTrabalhador));
                    System.out.print("\nFunção: ");
                    String funcaoTrabalhador = entrada.nextLine();

                    Trabalhador.serialTrabalhador++;
                    Trabalhador trab = new Trabalhador(Trabalhador.serialTrabalhador, nomeTrabalhador,CPFTrabalhador,funcaoTrabalhador);
                    trabalhadores.add(trab);
                    System.out.println("\nO Trabalhador foi cadastrado com sucesso");
                    break;

                case 2:// listar
                    if (trabalhadores.isEmpty()) {
                        System.out.println("\nNão há nenhuma trabalhador cadastrado.");
                    } else {
                        for (int i = 0; i < trabalhadores.size(); i++) {
                            temp = trabalhadores.get(i); // obtém o autor da iteração atual
                            System.out.println("\nId:   \t" + temp.getIdTrabalhador());
                            System.out.println("Nome:   \t" + temp.getNome());
                            System.out.println("CPF:    \t" + temp.getCPF());
                            System.out.println("Função: \t" + temp.getFuncao());
                        }
                    }
                    break;

                case 3: //pesquisar
                    System.out.print("\nInforme O ID ou descrição da Regional: ");
                    pesquisaTrabalhador = entrada.nextLine();
                    // método que pesquisa o Estado
                    temp = pesquisarTrabalhador(pesquisaTrabalhador);
                    if (temp == null) {
                        System.out.println("\nA trabalhador náo foi encontrada.");
                    } else {
                        // mostra o trabalhador
                        System.out.println("\nId:   \t" + temp.getIdTrabalhador());
                        System.out.println("Nome:   \t" + temp.getNome());
                        System.out.println("CPF:    \t" + temp.getCPF());
                        System.out.println("Função: \t" + temp.getFuncao());
                    }

                    break;
                case 4:// excluir
                    System.out.print("\nInforme o ID , nome ou CPF do trabalhador a ser excluído: ");
                    pesquisaTrabalhador = entrada.nextLine();
                    temp = pesquisarTrabalhador(pesquisaTrabalhador);
                    if (temp == null) { // não encontrado
                        System.out.println("\nTrabalhador não encontrado.");
                    } else {
                        System.out.println("Trabalhador excluido:"+temp.getNome());
                        trabalhadores.remove(temp);
                        System.out.println("\nTrabalhador foi excluída com sucesso.");
                    }

                    break;

                case 5: // Atualizar
                    System.out.print("\nInforme o ID , nome ou CPF do trabalhador a ser excluído: ");
                    pesquisaTrabalhador = entrada.nextLine();
                    temp = pesquisarTrabalhador(pesquisaTrabalhador);
                    if (temp == null) { // não encontrado
                        System.out.println("\nTrabalhador não encontrado.");
                    } else {
                        // mostra o estado encontrado
                        System.out.println("\nDados atuais desta Regional:");
                        System.out.println("\nId:   \t" + temp.getIdTrabalhador());
                        System.out.println("Nome:   \t" + temp.getNome());
                        System.out.println("CPF:    \t" + temp.getCPF());
                        System.out.println("Função: \t" + temp.getFuncao());

                        System.out.println("\nInforme os novos dados:");
                        System.out.print("\nNome: ");
                        String novonomeTrabalhador = entrada.nextLine();
                        System.out.print("\nCPF: ");
                        String novoCPFTrabalhador = entrada.nextLine();
                        System.out.print("\nFunção: ");
                        String novofuncaoTrabalhador = entrada.nextLine();
                        // atualizar os dados no ArrayList
                        temp.setNome(novonomeTrabalhador);
                        temp.setCPF(novoCPFTrabalhador);
                        temp.setFuncao(novofuncaoTrabalhador);
                        System.out.println("\nTrabalhador foi atualizada com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }
    }
    private Trabalhador pesquisarTrabalhador(String pesquisatrabalhador) {
        Trabalhador tra = null;
        // verifica
        for(int i = 0; i < trabalhadores.size(); i++){
            // pesquisa por ID
            if(Integer.toString(trabalhadores.get(i).getIdTrabalhador()).equals(pesquisatrabalhador)){
                return trabalhadores.get(i);
            }
            // pesquisar por nome
            else if(trabalhadores.get(i).getNome().contains(pesquisatrabalhador)){
                return trabalhadores.get(i);
            }
            // pesquisar por nome
            else if(trabalhadores.get(i).getCPF().contains(pesquisatrabalhador)){
                return trabalhadores.get(i);
            }
        }

        return tra;
    }

    private int menuGerenciarModulo() {
        Modulo temp;
        String pesquisaTrabalhador;
        String novostatusmodulo = null;
        while (true) {
            System.out.println("\n:: G E R E N C I A R   M Ó D U L O S ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Novo Módulo");
            System.out.println("2 - Listar Módulos");
            System.out.println("3 - Pesquisar Módulos");
            System.out.println("4 - Excluir Módulo");
            System.out.println("5 - Atualizar Módulor");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao) {
                case 1:// cadastrar
                        // para cadastrar um novo modulo precisa de uma trilha
                        Trilha trilha = null; // USUARIO
                        while (trilha == null) {
                            System.out.print("Informe o id, apelido ou nome da Trilha: ");
                            String pesquisaTrilha = entrada.nextLine();
                            // chamamos o método que pesquisa o autor
                            trilha = pesquisarTrilha(pesquisaTrilha);
                            if (trilha == null) { // perfil não encotrado
                                System.out.print("\nTrilha não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                                int opcaoTemp = Integer.parseInt(entrada.nextLine());
                                if (opcaoTemp == 2) {
                                    return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Trilha selecionada: " + trilha.getNome());
                    // fim para encontrar estado

                    System.out.print("Nome: ");
                    String nomemodulo= entrada.nextLine();
                    System.out.print("\nDescreva as habilidades do módulo: ");
                    String habModulo = entrada.nextLine();
                    System.out.print("\nDescreva qual a Tarefa de Validação do módulo: ");
                    String tarValModulo = entrada.nextLine();
                    System.out.print("\nPrazo Limite (em dias): ");
                    int prazoLimiteModulo = entrada.nextInt();



                    Modulo.serialModulo++;
                    //TODO:
                    Modulo mod = new Modulo(Modulo.serialModulo,trilha,nomemodulo,habModulo, tarValModulo,prazoLimiteModulo,EnumTotal.NAOINICIADO.getDisplayName());
                    modulos.add(mod);

                    System.out.println("\nO Módulo foi cadastrado com sucesso");
                    entrada.nextLine();

                    break;
                case 2:// listar
                    if(modulos.isEmpty()){
                        System.out.println("\nNão há nenhum Módulo cadastrado.");
                    }
                    else{
                        for(int i = 0; i < modulos.size(); i++){
                            temp = modulos.get(i); //
                            System.out.println("Id:              \t" + temp.getIdModulo());
                            System.out.println("Nome:            \t" + temp.getNome());
                            System.out.println("Status:          \t" + temp.getStatus());
                            System.out.println("Habilidades:     \t" + temp.getHabilidades());
                            System.out.println("Tarefa:          \t" + temp.getTarefaValidacao());
                            System.out.println("Prazo Limite     \t" + temp.getPrazoLimite());
                            System.out.println("Data-Hora Início \t" + temp.getDataHoraInicio());
                            System.out.println("Data-Hora Fim    \t" + temp.getDataHoraFim());
                        }
                    }
                    break;

                case 3: // pesquisar
                    System.out.print("\nInforme a ID ou Nome do Usuario: ");
                    String pesquisaModulo = entrada.nextLine();
                    // método que pesquisa o Usuario
                    temp = pesquisarModulo(pesquisaModulo);
                    if(temp == null){
                        System.out.println("\nO Módulo não foi encontrado.");
                    }
                    else{
                        // mostra o Usuario
                        System.out.println("Id:           \t" + temp.getIdModulo());
                        System.out.println("Nome:         \t" + temp.getNome());
                        System.out.println("Status:       \t" + temp.getStatus());
                        System.out.println("Habilidades:  \t" + temp.getHabilidades());
                        System.out.println("Tarefa:       \t" + temp.getTarefaValidacao());
                        System.out.println("Prazo Limite  \t" + temp.getPrazoLimite());
                        System.out.println("Prazo Limite  \t" + temp.getDataHoraInicio());
                        System.out.println("Prazo Limite  \t" + temp.getDataHoraFim());
                    }

                    break;
                case 4:// deletar
                    System.out.print("\nInforme a ID ou Nome do Usuario: ");
                    pesquisaModulo = entrada.nextLine();
                    // método que pesquisa o Usuario
                    temp = pesquisarModulo(pesquisaModulo);
                    if(temp == null){
                        System.out.println("\nO Módulo não foi encontrado.");
                    }
                    else{
                            modulos.remove(temp);
                            System.out.println("\nMódulo foi excluído com sucesso.");
                    }

                    break;

                case 5: //atualizar
                    System.out.print("\nInforme a ID ou Nome do Usuario: ");
                    pesquisaModulo = entrada.nextLine();
                    // método que pesquisa o Usuario
                    temp = pesquisarModulo(pesquisaModulo);
                    if(temp == null){
                        System.out.println("\nO Módulo "+pesquisaModulo+" não foi encontrado.");
                    }
                    else{
                        // mostra o Usuario encontrado
                        System.out.println("\nDados atuais deste Usuário:");
                        System.out.println("Id:           \t" + temp.getIdModulo());
                        System.out.println("Nome:         \t" + temp.getNome());
                        System.out.println("Status:       \t" + temp.getStatus());
                        System.out.println("Habilidades:  \t" + temp.getHabilidades());
                        System.out.println("Tarefa:       \t" + temp.getTarefaValidacao());
                        System.out.println("Prazo Limite  \t" + temp.getPrazoLimite());
                        System.out.println("Prazo Limite  \t" + temp.getDataHoraInicio());
                        System.out.println("Prazo Limite  \t" + temp.getDataHoraFim());
                        System.out.println("==========================================================");
                        System.out.println("\nInforme os novos dados:");
                        System.out.print("Nome: ");
                        String novonomemodulo= entrada.nextLine();
                       System.out.print("\nDescreva as habilidades do módulo: ");
                        String novohabModulo = entrada.nextLine();
                        System.out.print("\nDescreva qual a Tarefa de Validação do módulo: ");
                        String novotarValModulo = entrada.nextLine();
                        System.out.print("\nPrazo Limite (em dias): ");
                        int novoprazoLimiteModulo = entrada.nextInt();

                        System.out.print("Digite o Status atual:\n1 - Curso não iniciado\n2 - Curso em adamento\n3 - Em fase de avaliação\n4 - Fase de avaliação finalizada\n");

                        int opStatus = entrada.nextInt();
                        entrada.nextLine();
                            if(opStatus == 1){
                                temp.setStatus(EnumTotal.NAOINICIADO.getDisplayName());
                            }else if(opStatus == 2){
                                temp.setStatus(EnumTotal.EMANDAMENTO.getDisplayName());
                            }else if(opStatus == 3){
                                temp.setStatus(EnumTotal.FASEAVALIACAO.getDisplayName());
                            }else if(opStatus == 4){
                                temp.setStatus(EnumTotal.AVALIACAOFINALIZADA.getDisplayName());
                            }

                        // atualizar os dados no ArrayList
                        temp.setNome(novonomemodulo);

                        temp.setHabilidades(novohabModulo);
                        temp.setTarefaValidacao(novotarValModulo);
                        temp.setPrazoLimite(novoprazoLimiteModulo);
                        if (temp.getStatus().equals(EnumTotal.EMANDAMENTO.getDisplayName())){
                            temp.setDataHoraInicio(OffsetDateTime.now());

                        }
                        if (temp.getStatus().equals(EnumTotal.AVALIACAOFINALIZADA.getDisplayName())){
                            temp.setDataHoraFim(OffsetDateTime.now());
                        }


                        System.out.println("\nUsuario atualizado com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }

    }
    private Modulo pesquisarModulo(String pesquisaModulo) {
        Modulo mod = null;

        // verifica
        for(int i = 0; i < modulos.size(); i++){
            // pesquisa
            if(Integer.toString(modulos.get(i).getIdModulo()).equals(pesquisaModulo)){
                return modulos.get(i);
            }
            // pesquisar por desc
            else if(modulos.get(i).getNome().contains(pesquisaModulo)){
                return modulos.get(i);
            }
        }

        return mod;
    }

    private int menuGerenciarUsuarios() {
        Usuario temp;
        String pesquisaUsuario;
        while (true){
            System.out.println("\n:: G E R E N C I A R   P E R F I L ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Novo Usuario");
            System.out.println("2 - Listar Perfis");
            System.out.println("3 - Pesquisar Perfis");
            System.out.println("4 - Excluir Usuario");
            System.out.println("5 - Adicionar Perfil ao Usuario");
            System.out.println("6 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            limpatela.limparTela();

            switch (opcao){
                case 1: // vamos cadastrar um novo autor
                    System.out.print("Nome: ");
                    String nomeUsuario= entrada.nextLine();

                    System.out.print("\nCPF: ");
                    String cpfUsuario = entrada.nextLine();
                    //TODO: [RN05-01] = OK
                    while(ValidarCPF.isCPF(cpfUsuario) == false){
                        System.out.println("\nO CPF digitado é inválido!!");
                        System.out.print("\nDigite um CPF válido: ");
                        cpfUsuario = entrada.nextLine();
                    }
                    System.out.printf("\nCPF digitado: "+ ValidarCPF.imprimeCPF(cpfUsuario));
                    System.out.print("\nE-mail: ");
                    String emailUsuario = entrada.nextLine();
                    //TODO: [RN05-02] = OK
                    while(ValidaEmail.isEmail(emailUsuario) == false){
                        System.out.println("\nO EMAIL digitado é inválido!!");
                        System.out.print("\nDigite um EMAIL válido: ");
                        emailUsuario = entrada.nextLine();
                    }
                    System.out.print("\nSenha: ");
                    String senhaUsuario = entrada.nextLine();
                    //TODO: [RN05-03] = ok
                    while(ValidaSenha.isSenha(senhaUsuario) == false){
                        System.out.println("\nA senha digitado é inválido!!");
                        System.out.print("\nDigite uma Senha: \n - com 8 caracteres ou mais\n - deve conter letras\n - deve conter numeros");
                        senhaUsuario = entrada.nextLine();
                    }
                    // para cadastrar um novo usuario precisa de um Perfil
                    System.out.println("Para cadastrar um novo usuario precisa de um Perfil");
//                    Perfil perfilList = null; // USUARIO
//                    if(perfis.isEmpty()){
//                        System.out.println("\nNão há nenhum Perfil cadastrado.");
//                    }
//                    else{
//                        for(int i = 0; i < perfis.size(); i++){
//                            perfilList = perfis.get(i); //
//                            System.out.println("ID: "+perfilList.getIdPerfil()+" - Perfil: " + perfilList.getNomePerfil());
//                        }
//                    }
//                    System.out.print("Informe o numero do Perfil: ");
//                    int perfilEntrada = entrada.nextInt();
//                    entrada.nextLine();

                    String pesquisaPerfil = null;
                    Perfil perfil = null; // USUARIO
                    while (perfil == null) {
                        System.out.println("Lista de Perfil");
                        for(int i = 0; i < perfis.size(); i++){
                            System.out.println("Nome Perfil: "+perfis.get(i).getIdPerfil()+" - "+perfis.get(i).getNomePerfil());
                        }
                        System.out.print("Informe o numero do Perfil: ");
                        pesquisaPerfil = entrada.nextLine();
                        // chamamos o método que pesquisa o autor
                        perfil = pesquisarPerfil(pesquisaPerfil);
                        if (perfil == null) { // perfil não encotrado
                            System.out.print("\nPerfil não encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                            int opcaoTemp = Integer.parseInt(entrada.nextLine());
                            if (opcaoTemp == 2) {
                                return 1; // volta para o menu anterior
                            }
                        }
                    }
                    System.out.println("Perfil selecionado: " + perfil.getNomePerfil());
                    int perfilEntrada =Integer.parseInt(pesquisaPerfil);
                    perfilEntrada--;
                    // fim para encontrar estado

                    Usuario.serialUsuario++;
                    Usuario usu = new Usuario(Usuario.serialUsuario, nomeUsuario,cpfUsuario,emailUsuario,senhaUsuario);
                    usuarios.add(usu);
                    //TODO : [RN05-04] = ok
                    Perfil per = new Perfil(perfis.get(perfilEntrada).getIdPerfil(),perfis.get(perfilEntrada).getNomePerfil(),perfis.get(perfilEntrada).getDescricaoPerfil());
                    usu.getPerfilUsu().add(per);

                    System.out.println("\nO Usuario foi cadastrado com sucesso");

                    break;

                case 2:
                    if(usuarios.isEmpty()){
                        System.out.println("\nNão há nenhum Usuario cadastrado.");
                    }
                    else{
                        for(int i = 0; i < usuarios.size(); i++){
                            temp = usuarios.get(i); //
                            System.out.println("Id:           \t" + temp.getIdUsuario());
                            System.out.println("Nome:         \t" + temp.getNome());
                            System.out.println("CPF:          \t" + temp.getCPF());
                            System.out.println("E-mail:       \t" + temp.getEmail());
                            System.out.print("Descrição:  \t");
                                                for( int j =0; j< temp.getPerfilUsu().size(); j++){
                                                    System.out.print(temp.getPerfilUsu().get(j).getNomePerfil()+"|");
                                                };

                            System.out.println("\n------------------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme a ID ou Nome do Usuario: ");
                    pesquisaUsuario = entrada.nextLine();
                    // método que pesquisa o Usuario
                    temp = pesquisarUsuario(pesquisaUsuario);
                    if(temp == null){
                        System.out.println("\nO Usuario náo foi encontrado.");
                    }
                    else{
                        // mostra o Usuario
                        System.out.println("Id:           \t" + temp.getIdUsuario());
                        System.out.println("Nome:         \t" + temp.getNome());
                        System.out.println("CPF:          \t" + temp.getCPF());
                        System.out.println("E-mail:       \t" + temp.getEmail());
                    }

                    break;

                case 4:
                    System.out.print("\nInforme a ID ou Nome do Usuario a ser excluído: ");
                    pesquisaUsuario = entrada.nextLine();
                    temp = pesquisarUsuario(pesquisaUsuario);
                    if(temp == null){ // não encontrado
                        System.out.println("\nO Usuario não foi encontrado.");
                    }
                    else{
                           usuarios.remove(temp);
                           System.out.println("\nUsuario foi excluído com sucesso.");
                    }
                    break;

                case 5: //atualizar
                    System.out.print("\nInforme a ID ou descricao do Usuario a ser atualizado: ");
                    pesquisaUsuario = entrada.nextLine();
                    // chamamos o método que pesquisa o Usuario
                    temp = pesquisarUsuario(pesquisaUsuario);
                    if(temp == null){ // não encotrado
                        System.out.println("\nO Usuario "+pesquisaUsuario+" não foi encontrado.");
                    }
                    else{
                        // mostra o Usuario encontrado
                        System.out.println("\nDados atuais deste Usuário:");
                        System.out.println("Id:           \t" + temp.getIdUsuario());
                        System.out.println("Nome:         \t" + temp.getNome());
                        System.out.println("CPF:          \t" + temp.getCPF());
                        System.out.println("E-mail:       \t" + temp.getEmail());
                        //System.out.println("Qt Perfil:    \t" + temp.getPerfilUsu().size());
                        System.out.println("==========================================================");
//                        System.out.println("\nInforme os novos dados:");
//                        System.out.print("Nome: ");
//                        String novoNomeUsuario= entrada.nextLine();
//                        System.out.print("\nCPF: ");
//                        String novocpfUsuario = entrada.nextLine();
//                        System.out.print("\nE-mail: ");
//                        String novoEmailUsuario = entrada.nextLine();
//                        System.out.print("\nSenha: ");
//                        String novaSenhaUsuario = entrada.nextLine();

                        System.out.println("Vamos adicionar um Perfil");

                        Perfil perfilList = null; // USUARIO
                        if(perfis.isEmpty()){
                            System.out.println("\nNão há nenhum Perfil cadastrado.");
                        }
                        else{
                            for(int i = 0; i < perfis.size(); i++){
                                perfilList = perfis.get(i); //
                                System.out.println(i+" - Perfil: " + perfilList.getNomePerfil());
                            }
                        }
                        System.out.print("Informe o numero do Perfil: ");
                        int perfilNovo = entrada.nextInt();
                        entrada.nextLine();


                        System.out.println("Perfil selecionado: " + perfilNovo);
                        // fim para encontrar estado
                        // atualizar os dados no ArrayList
//                        temp.setNome(novoNomeUsuario);
//                        temp.setCPF(novocpfUsuario);
//                        temp.setEmail(novoEmailUsuario);
//                        temp.setSenha(novaSenhaUsuario);
                        //TODO: [RN05-04] = OK
                        Perfil perf = new Perfil(perfis.get(perfilNovo).getIdPerfil(),perfis.get(perfilNovo).getNomePerfil(),perfis.get(perfilNovo).getDescricaoPerfil());
                        temp.getPerfilUsu().add(perf);

                        System.out.println("\nUsuario atualizado com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }

    }
    private Usuario pesquisarUsuario(String pesquisaUsuario) {
        Usuario usu = null;

        // verifica
        for(int i = 0; i < usuarios.size(); i++){
            // pesquisa por ID
            if(Integer.toString(usuarios.get(i).getIdUsuario()).equals(pesquisaUsuario)){
                return usuarios.get(i);
            }
            // pesquisar por nome
            else if(usuarios.get(i).getNome().contains(pesquisaUsuario)){
                return usuarios.get(i);
            }
            // pesquisar por nome
            else if(usuarios.get(i).getCPF().contains(pesquisaUsuario)){
                return usuarios.get(i);
            }
        }

        return usu;
    }

    private int menuGerenciarPerfil() {
        //TODO: [RF06] = OK
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
                            temp = perfis.get(i); //
                            System.out.println("Id:           \t" + temp.getIdPerfil());
                            System.out.println("Nome:         \t" + temp.getNomePerfil());
                            System.out.println("Descrição:    \t" + temp.getDescricaoPerfil());
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme a ID ou descrição do Perfil: ");
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
                    System.out.print("\nInforme a ID ou descricao do Perfil a ser excluído: ");
                    pesquisaPerfil = entrada.nextLine();
                    temp = pesquisarPerfil(pesquisaPerfil);
                    if(temp == null){ // não encontrado
                        System.out.println("\nO Perfil não foi encontrado.");
                    }
                    else{
                            perfis.remove(temp);
                            System.out.println("\nPerfil foi excluído com sucesso.");
                        }

                    break;

                case 5: // atualizar um perfil
                    System.out.print("\nInforme a ID ou descricao do Perfil a ser atualizado: ");
                    pesquisaPerfil = entrada.nextLine();
                    // chamamos o método que pesquisa o Perfil
                    temp = pesquisarPerfil(pesquisaPerfil);
                    if(temp == null){ // não encotrado
                        System.out.println("\nO Perfil "+pesquisaPerfil +" não foi encontrado.");
                    }
                    else{
                        // mostra o Perfil encontrado
                        System.out.println("\nDados atuais deste autor:");
                        System.out.println("\nId:           \t" + temp.getIdPerfil());
                        System.out.println("Nome:           \t" + temp.getNomePerfil());
                        System.out.println("Descrição:      \t" + temp.getDescricaoPerfil());
                        System.out.println("==========================================================");
                        System.out.println("\nInforme os novos dados:");
                        System.out.print("\nNovo Nome do Perfil: ");
                        String novaNomePerfil = entrada.nextLine();
                        System.out.print("Nova Descrição do Perfil: ");
                        String novoDescPerfil = entrada.nextLine();

                        // atualizar os dados no ArrayList
                        temp.setNomePerfil(novaNomePerfil);
                        temp.setDescricaoPerfil(novoDescPerfil);
                        System.out.println("\nPerfil atualizado com sucesso!");
                    }

                    break;

                case 6:
                    return 0; // volta para o menu principal
            }
        }


    }
    private Perfil pesquisarPerfil(String pesquisaPerfil) {
        Perfil perf = null;

        // verifica
        for(int i = 0; i < perfis.size(); i++){
            // pesquisa
            if(Integer.toString(perfis.get(i).getIdPerfil()).equals(pesquisaPerfil)){
                return perfis.get(i);
            }
            // pesquisar por desc
            else if(perfis.get(i).getDescricaoPerfil().contains(pesquisaPerfil)){
                return perfis.get(i);
            }
        }

        return perf;
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
//
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




