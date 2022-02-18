package habilitPro.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidaCampoInt {
    public static boolean validaInt(String campoString){
        try{
            if (campoString.isEmpty()){
                System.out.println("O campo não estar vazio!");
                return false;}
            campoString = campoString.replaceAll("[^a-zA-Z0-9]", "");
            if(campoString.matches("[^0-9]*")) {
                System.out.println("O campo não pode conter Letras ou Caracteres especiais!");
                return false;
            }

        }catch (NumberFormatException e){
            System.out.println("Digite um numero inteiro! - " +e);
        }catch (StringIndexOutOfBoundsException erro){
            System.out.println("O campo tem que conter LETRAS! \n"+ erro);
        }

        return true;

    }

//    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite:");
//        String opcao = entrada.nextLine();
//        if(ValidaCampoInt.validaInt(opcao) == true){
//            System.out.println("Inteiro válido");
//        }
//
//    }
}
