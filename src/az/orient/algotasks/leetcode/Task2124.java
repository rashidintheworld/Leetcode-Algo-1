package az.orient.algotasks.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Task2124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Task2124 task2124 = new Task2124();
        boolean boolFoo = task2124.checkString(s);
    }
    public boolean checkString(String s) {
        int[] array = new int[s.length()];
        int[] arrayCopy = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int a = Integer.valueOf(ch);
            array[i] = a;
            arrayCopy[i] = a;
        }
        Arrays.sort(array);
        return Arrays.equals(arrayCopy,array);
    }
}
