package habilitPro.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidaCampoString {


    public static boolean validaString(String campoString){
       try{
           if (campoString.isEmpty()){
               System.out.println("O campo não estar vazio!");
               return false;}
           campoString = campoString.replaceAll("[^a-zA-Z0-9]", "");
           if(campoString.length() <= 2){
               System.out.println("O campo não pode conter menos de duas letras");
                   return false;}
          if(campoString.matches("[^a-zA-Z]*")) {
               System.out.println("O campo não pode conter numeros!");
               return false;
           }

       }catch (InputMismatchException e){
           System.out.println(e);
       }catch (StringIndexOutOfBoundsException erro){
           System.out.println("O campo tem que conter mais de duas LETRAS! \n"+ erro);
       }

        return true;

    }

//    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite:");
//        String texto = entrada.nextLine();
//        if(ValidaCampoString.validaString(texto) == true){
//            System.out.println("String valida");
//        }
//
//    }
}
