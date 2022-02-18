package habilitPro.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaSenha {
    public static boolean isSenha(String senha) {

        if(senha.length() < 8){
            return false;
        }
        if(senha.isEmpty()){
            return false;
        }
        boolean achouNumero = false;
        boolean achouLetra = false;

        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                achouNumero = true;
            } else if (c >= 'A' && c <= 'Z') {
                achouLetra = true;
            } else if (c >= 'a' && c <= 'z') {
                achouLetra = true;
            }
        }
        return achouNumero && achouLetra;

    }

//    public static void main(String[] args) {
//        // Test Case 1:
//        String str1 = "A18oa548";
//        System.out.println(isSenha(str1));
//
//        // Test Case 2:
//        String str2 = "";
//        System.out.println(isSenha(str2));
//
//        // Test Case 3:
//        String str3 = "Geeks@portal9";
//        System.out.println(isSenha(str3));
//    }
}
