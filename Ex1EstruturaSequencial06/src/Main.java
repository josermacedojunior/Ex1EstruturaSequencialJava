import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C, tri, cir, trap, quad, ret, pi;
        pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        tri = (A * C)/2;
        cir = pi * C * C;
        trap = ((A + B) * C)/2;
        quad = B * B;
        ret = A * B;
        System.out.printf("Triangulo: %.3f%n",tri);
        System.out.printf("Círculo: %.3f%n",cir);
        System.out.printf("Trapézio: %.3f%n",trap);
        System.out.printf("Quadrado: %.3f%n",quad);
        System.out.printf("Retangulo: %.3f%n", ret);

        sc.close();
    }
}