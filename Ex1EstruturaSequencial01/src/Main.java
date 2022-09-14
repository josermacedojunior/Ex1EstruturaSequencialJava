import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, res;
        x = sc.nextInt();
        y = sc.nextInt();
        res = x + y;

        System.out.println("Soma = " + res);

        sc.close();
    }
}