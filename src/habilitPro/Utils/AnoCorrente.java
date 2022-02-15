package habilitPro.Utils;

import java.util.Date;

public class AnoCorrente {

    public static int isAno() {
     Date dt = new Date();
     int year = dt.getYear();
     int current_Year = year + 1900;
     return current_Year;
    }

//    public static void main(String[] args) {
//        System.out.println(AnoCorrente.isAno());
//    }
}
