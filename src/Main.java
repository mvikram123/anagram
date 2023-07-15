import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean anagram(String s1,String s2)
    {
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());
        if(s1.length()!=s2.length()) return false;
        for(int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                return true;
            }
        }
        return false;
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String s1 and s2");
        String s1=sc.next();
        String s2=sc.next();


        System.out.println("Hello world!"+anagram(s1.toLowerCase(),s2.toLowerCase()));
    }
}