import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.print(s1);
            int s1lenght = 15 - s1.length();
                for (int j = 0; j < s1lenght; j++) {
                System.out.print(" ");
                }
            int xlenght = String.valueOf(x).length();
                for (int j = 0; j < 3 - xlenght; j++) {
                System.out.print("0");
                }

                System.out.println(x);

        }
        System.out.print("================================");
    }


}