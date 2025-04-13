package excecoes;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split("");
        int position = sc.nextInt();
        System.out.println(vect[position]);

        sc.close();
    }
}
