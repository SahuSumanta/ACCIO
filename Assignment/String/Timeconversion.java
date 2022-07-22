package Assignment.String;

import java.util.Scanner;

public class Timeconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        sc.close();
        // splitting the string in parts when we encounter ":" in the string
        String tArr[] = time.split(":");
        String AmPm = tArr[2].substring(2, 4);
        int hh, mm, ss;
        // converting the strings to integers
        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0, 2));

        String checkPM = "PM", checkAM = "AM";

        if (AmPm.equals(checkAM) && hh == 12) {
            hh = 0;
        } else if (AmPm.equals(checkPM) && hh < 12) {
            hh += 12;
        }

        System.out.printf("%02d:%02d:%02d", hh, mm, ss);
    }
}
