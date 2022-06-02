package AISD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> blue = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            blue.add(sc.nextInt());
        }
        HashSet<Integer> blueSet = new HashSet<>(blue);
        ArrayList<Integer> green = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            green.add(sc.nextInt());
        }
        HashSet<Integer> greenSet = new HashSet<>(green);
        ArrayList<Integer> red = new ArrayList<>(t);
        for (int i = 0; i < t; i++) {
            red.add(sc.nextInt());
        }
        HashSet<Integer> redSet = new HashSet<>(red);



        int ans = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) {
                break;
            }
            if (blue.get(i)*blue.get(i) >= k) {
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (blue.get(i)*blue.get(i) + green.get(j)*green.get(j) >= k || flag) {
                    break;
                }
                int num = k - blue.get(i)*blue.get(i) - green.get(j)*green.get(j);
                if ( ((int)Math.sqrt(num))*((int)Math.sqrt(num)) == num ) {
                    int ind = red.indexOf(num);
                    if (ind != -1) {
                        System.out.println( (i+1) + " " + (j+1) + " " + (ind+1) );
                        flag = true;
                        ans++;
                        break;
                    }
                }
            }
        }
        if (ans == 0) {
            System.out.println(-1);
        }

    }
}