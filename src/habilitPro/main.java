package habilitPro;

import habilitPro.validacoes.ValidaCNPJ;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Hellow World!");

        // TESTAR CNPJ
        Scanner ler = new Scanner(System.in);

        String CNPJ; // CNPJ VALIDO = 14572457000185

        System.out.printf("Informe um CNPJ: ");
        CNPJ = ler.next();

        System.out.printf("\nResultado: ");
        // usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
        if (ValidaCNPJ.isCNPJ(CNPJ) == true)
            System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
        else System.out.printf("Erro, CNPJ inválido !!!\n");
    }// FIM MAIN

}//FIM CLASSE MAIN
