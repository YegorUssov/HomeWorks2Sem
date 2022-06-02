package AISD;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxProfit {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxPersonalProfit;
    int[] prise = new int[n];
    int[] profit = new int[n];

    for (int i = 0; i < prise.length; i++) {
        prise[i] = sc.nextInt();
        }

    int index = 0;
    for (int i = 0; i < prise.length; i++ ) {
        maxPersonalProfit = 0;
        for (int j = i; j <prise.length ; j++) {
            if ((prise[j] - prise[i]) > maxPersonalProfit) {
                maxPersonalProfit = (prise[j] - prise[i]);
                profit[index] = (prise[j] - prise[i]);
                }
            }
        index++;
        maxPersonalProfit = 0;
        }
    int maxProfit = 0;
    for (int i = 0; i <profit.length ; i++) {
        System.out.print(profit[i] + " ");
        if (profit[i] > maxProfit) {
            maxProfit = profit[i];
        }
    }
    System.out.println();
    System.out.println("MaxProfitis:" + maxProfit);
    }
}