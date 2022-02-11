package habilitPro;

import habilitPro.validacoes.ValidaCNPJ;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Hellow World!");
        Scanner ler = new Scanner(System.in);
        // TESTAR CNPJ

        String CNPJ = "14572457000185";
        System.out.printf("Informe um CNPJ: ");
        System.out.println("O CNPJ informado foi "+CNPJ);;

        System.out.printf("\nResultado: ");
        // usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
        if (ValidaCNPJ.isCNPJ(CNPJ) == true)
            System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
        else System.out.printf("Erro, CNPJ inválido !!!\n");

        // TESTAR CPF
        Scanner ler = new Scanner(System.in);
        String CNPJ = "14572457000185";
        System.out.printf("Informe um CNPJ: ");
        System.out.println("O CNPJ informado foi "+CNPJ);;

        System.out.printf("\nResultado: ");
        // usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
        if (ValidaCNPJ.isCNPJ(CNPJ) == true)
            System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
        else System.out.printf("Erro, CNPJ inválido !!!\n");

        //Popular tabela Estado
        // popular tabela Cidade
        // popular tabela segmentoEmpresa
        // popular tabela regionalSenai


    }// FIM MAIN

}//FIM CLASSE MAIN
