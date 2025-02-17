
import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double m,km;
        System.out.println("enter the miles number:");
        m=sc.nextDouble();
        km=m*1.60935;
        System.out.println("the miles converted to kilometer results to:");
        System.out.println(km);
        sc.close();
    }
}