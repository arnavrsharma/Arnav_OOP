import java.util.Scanner;

public class Reverse {
    public static String reverse(String str){
        if(str.isEmpty()) return str;
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your letter:");
        String word=sc.nextLine();
        System.err.println("Reversed string:"+reverse(word));
        sc.close();
    }
}