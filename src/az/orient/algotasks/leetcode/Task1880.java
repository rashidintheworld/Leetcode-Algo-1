package az.orient.algotasks.leetcode;

import java.util.Scanner;

public class Task1880 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next().toLowerCase();
        String secondWord = sc.next().toLowerCase();
        String targetWord = sc.next().toLowerCase();

        if (firstWord.length() >= 0 && firstWord.length() <= 8 && secondWord.length() >= 0 && secondWord.length() <= 8 && targetWord.length() >= 0 && targetWord.length() <= 8) {
            Task1880 task1880 = new Task1880();
            boolean boolFoo = task1880.isSumEqual(firstWord, secondWord, targetWord);
            System.out.println(boolFoo);
        }
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String firstWordDef = "";
        String secondWordDef = "";
        String targetWordDef = "";

        for (int i = 0; i < firstWord.length(); i++) {
            firstWordDef += (firstWord.charAt(i) - 97);
        }
        for (int i = 0; i < secondWord.length(); i++) {
            secondWordDef += (secondWord.charAt(i) - 97);
        }
        for (int i = 0; i < targetWord.length(); i++) {
            targetWordDef += (targetWord.charAt(i) - 97);
        }
        int firstWordSum = Integer.parseInt(firstWordDef);
        int secondWordSum = Integer.parseInt(secondWordDef);
        int targetWordSum = Integer.parseInt(targetWordDef);

        return firstWordSum + secondWordSum == targetWordSum;
    }
}
