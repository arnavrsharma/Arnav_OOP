import java.util.Scanner;
public class Fraction {
    public static void main(String[] args) {
        Scanner div=new Scanner(System.in);
        int num,dnum;
        double divide;
        System.out.println("enter your numerator:");
        num=div.nextInt();
        System.out.println("enter your denumerator:");
        dnum=div.nextInt();
        divide=(double)num/dnum;
        System.out.println("your result in decimal is:");
        System.out.println(divide);
        div.close();
    }
}