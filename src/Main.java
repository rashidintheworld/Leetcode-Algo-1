import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        boolean isFlag = true;
        char[] aC = a.toCharArray();
        char[] bC = b.toCharArray();
        for(int i =0 ; i<a.length();i++){
            Arrays.sort(aC);
            Arrays.sort(bC);
        }
        if(Arrays.equals(aC,bC)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not anagrams");
        }
    }
}