import java.util.Random;
import java.util.Scanner;
class Encrypt{
    int pin;
    String encryptpin;
    String pinHex;
    String random_hex1;
    String random_hex2;
    void Data(Scanner sc, Random r){
        System.out.println("enter your pin:");
        pin=sc.nextInt();
        P_encrypt(r);
    }
    void P_encrypt(Random r){
        pinHex=Integer.toHexString(pin);
        int random_num1=1000+r.nextInt(64536);
        int random_num2=1000+r.nextInt(64536);

        random_hex1=Integer.toHexString(random_num1);
        random_hex2=Integer.toHexString(random_num2);
        encryptpin=random_hex1+pinHex+random_hex2;
        Display();
    }
    void Display(){
        System.out.println("your encrypted pin is:"+encryptpin);
    }
}
public class PinEncryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        Encrypt e=new Encrypt();
        e.Data(sc, r);
        sc.close();
    }
}