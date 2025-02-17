import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l,a,p;
        System.out.println("enter length of square:");
        l=s.nextInt();
        a=l*l;
        p=4*l;
        System.out.println("the area and perimeter of square is:");
        System.out.println(a);
        System.out.println(p);
        s.close();
    }
}