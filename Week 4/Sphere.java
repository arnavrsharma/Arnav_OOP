import java.util.Scanner;
class Circle{
    int r;
    double v,a;
    void In(Scanner sc){
        System.out.println("Enter the radius value:");
        r=sc.nextInt();
        Volumn();
    }
    void Volumn(){
        v=(4*Sphere.Pi*Math.pow(r,3))/3;
        Surface();
    }
    void Surface(){
        a=4*Sphere.Pi*Math.pow(r,2);
        Display();
    }
    void Display(){
        System.out.println("Your sphere volumn is:"+v);
        System.out.println("Your sphere surface area is:"+a);
    }
}
public class Sphere {
    public static final double Pi=3.14159;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        c.In(sc);
        sc.close();
    }
    
}