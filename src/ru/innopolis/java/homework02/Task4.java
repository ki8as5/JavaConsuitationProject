import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner kiruha = new Scanner(System.in);
        int i = kiruha.nextInt();
        String s = kiruha.nextLine();

        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.print(s);
            }
            System.out.println();
        }

    }
}


