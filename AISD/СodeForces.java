package AISD;

import java.util.Scanner;

public class СodeForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chislo = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < chislo.length()/2; i++) {
                if ((chislo.charAt(i) == '2' && chislo.charAt(chislo.length() - i - 1) == '5') || (chislo.charAt(i) == '5' && chislo.charAt(chislo.length() - i - 1) == '2') ||
                    (chislo.charAt(i) == '0' && chislo.charAt(chislo.length() - i - 1) == '0') || (chislo.charAt(i) == '8' && chislo.charAt(chislo.length() - i - 1) == '8') ||
                        (chislo.charAt(i) == '3' && chislo.charAt(chislo.length() - i - 1) == 'E') || (chislo.charAt(i) == 'E' && chislo.charAt(chislo.length() - i - 1) == '3')) {
                        flag = true;
                } else {
                    flag = false;
                    break;
                }
        }
        if (flag == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

