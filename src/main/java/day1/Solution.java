package day1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Scanner scanner0 = new Scanner(System.in).useLocale(Locale.UK);
        double b = scanner0.nextDouble();
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();

        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + "" + st);
        scan.close();
    }
}
