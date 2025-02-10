public class Diamond {
    public static void main(String[] args) {
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= 4 - j; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * j - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 3; j >= 1; j--) {
            for (int k = 1; k <= 4 - j; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * j - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}