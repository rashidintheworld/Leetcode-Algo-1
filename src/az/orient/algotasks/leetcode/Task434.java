package az.orient.algotasks.leetcode;

import java.util.Scanner;
//https://leetcode.com/problems/number-of-segments-in-a-string/
public class Task434 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.isBlank() || s.isEmpty()) {
            System.out.println("Bosh daxil etdiniz!");
            return;
        } else {
            Task434 task434 = new Task434();
            int countOfSegmentFoo = task434.countSegments(s);
            System.out.println(countOfSegmentFoo);
        }


    }

    public int countSegments(String s) {
        String[] sSplit = s.split(" ");
        int count = 0;
        for (int i = 0; i < sSplit.length; i++) {
            if (!sSplit[i].isEmpty()) {
                count++;
            }
        }
        return count;


    }
}
