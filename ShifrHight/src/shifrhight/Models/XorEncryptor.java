/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shifrhight.Models;

/**
 *
 * @author volgin
 */
public class XorEncryptor {

    public String encrypt(String Text, String key) {
        int i, j;
        String result = "";
        String Text_Vhods = Text;
        char[] Text_Vhod;
        Text_Vhod = Text_Vhods.toCharArray();
        String Kods = key;
        char[] Kod;
        Kod = Kods.toCharArray();
        for (i = 0; i < Text_Vhods.length(); i++) {
            if (i < Kods.length()) {
                j = i;
            } else {
                j = i % Kods.length();
            }
            if (Text_Vhod[i] == '0') {
                if (Kod[j] == '0') {
                    result = result + '0';
                }
                if (Kod[j] == '1') {
                    result = result + '1';
                }
            }
            if (Text_Vhod[i] == '1') {
                if (Kod[j] == '0') {
                    result = result + '1';
                }
                if (Kod[j] == '1') {
                    result = result + '0';
                }
            }
        }
//        String s=result;
//        String resultt="";
//        String[] substr = new String[s.length()/8];
//        if (s.length() %8 != 0)
//            System.out.println("введенная строка не кратна 8");
//        else {
//            substr = s.split("(?<=\\G.{8})");
// 
//            for (String substr1 : substr) {
//                int count = Integer.parseInt(substr1, 2);
//                String aChar = new Character((char)count).toString();
//                resultt=aChar+resultt;
//            }
//        }
//        String r = result;
//        String resultt="";
//        for (String s : r.split("(?<=\\G\\d{4})")) {
//            resultt = (char) Integer.parseInt(s, 2) + resultt;
//            System.out.print(resultt);
//        }
        return result;

    }
}
