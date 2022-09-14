import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod1, cod2;
        double num1, num2, v1, v2, vt;
        cod1 = sc.nextInt();
        num1 = sc.nextDouble();
        v1 = sc.nextDouble();
        cod2 = sc.nextInt();
        num2 = sc.nextDouble();
        v2 = sc.nextDouble();

        vt = (v1 * num1) + (v2 * num2);
        System.out.printf("Valor a pagar: R$%.2f%n", vt);

        sc.close();

    }
}