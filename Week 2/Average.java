
// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and " +
                       "I will compute their average");


       System.out.println("enter first value:");
       val1=scan.nextInt();



       System.out.println("enter second value:");
       val2=scan.nextInt();


       System.out.println("enter third value:");
       val3=scan.nextInt();


       //compute the average


       average=val1+val2+val3/3.0;


       //print the average


       System.out.println("the average is:"+average);

        scan.close();
    }
}