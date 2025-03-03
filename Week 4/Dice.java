import java.util.Random;
import java.util.Scanner;

class Roll {
    int sides1, sides2;
    int total1 = 0, total2 = 0;
    Random r;

    Roll(Random r) {
        this.r = r;
    }

    void input(Scanner sc) {
        System.out.println("How many sides does die 1 have?");
        sides1 = sc.nextInt();
        System.out.println("How many sides does die 2 have?");
        sides2 = sc.nextInt();
        shuffle();
    }

    void shuffle() {
        String[] rollNames = {"First", "Second", "Third"};
        for (int i = 0; i < 3; i++) {
            int roll1 = r.nextInt(sides1) + 1;
            int roll2 = r.nextInt(sides2) + 1;
            total1 += roll1;
            total2 += roll2;
            System.out.println("Die 1 " + rollNames[i] + " roll = " + roll1 + ".");
            System.out.println("Die 2 " + rollNames[i] + " roll = " + roll2 + ".");
        }
        average();
    }

    void average() {
        double avg1 = total1 / 3.0;
        double avg2 = total2 / 3.0;
        display(avg1, avg2);
    }

    void display(double avg1, double avg2) {
        System.out.println("Die 1 rolled a total of " + total1 + " and rolled " + String.format("%.3f", avg1) + " on average.");
        System.out.println("Die 2 rolled a total of " + total2 + " and rolled " + String.format("%.3f", avg2) + " on average.");
    }
}

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Roll roll = new Roll(r);
        roll.input(sc);
        sc.close();
    }
}