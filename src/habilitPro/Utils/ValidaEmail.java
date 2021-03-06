package habilitPro.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaEmail {
    public static boolean isEmail(String email) {
        boolean isEmailValido = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailValido = true;
            }
        }
        return isEmailValido;
    }
}
