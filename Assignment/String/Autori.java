package Assignment.String;

import java.util.Scanner;
/*
 * Autori
 */
public class Autori {
    public static void main(String[] args) {
        // String str = "Pasko-Patak";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(autori(str));
        sc.close();
    }

    static String autori(String str){
        String ans ="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}
