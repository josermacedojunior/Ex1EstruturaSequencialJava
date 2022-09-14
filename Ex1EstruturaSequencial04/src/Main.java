import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int num;
        double h, vh, sal;
        num = sc.nextInt();
        h = sc.nextDouble();
        vh = sc.nextDouble();
        sal = h * vh;
        System.out.println("Number : " + num);
        System.out.printf("SALARY = U$%.2f%n", sal);

        sc.close();

    }
}