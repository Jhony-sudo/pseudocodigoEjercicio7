import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Random r = new Random();
        int NumPar = 0;
        int NumImpar = 0;
        int Cero = 0;
        for (int i = 0; i < 15; i++) {
            int Num = r.nextInt(36);
            System.out.println(Num);
            if (Num % 2 == 0 && Num > 0) {
                NumPar++;
            } else {
                NumImpar++;
            }
            if (Num == 0) {
                Cero++;
            }
        }

        System.out.println("El promedio de los numeros pares generados es de: " + 100 * (float) NumPar / 15 + "%");
        System.out.println("El promedio de los numeros Impares generados es de: " + 100 * (float) NumImpar / 15 + "%");
        System.out.println("El promedio de ceros generados es de: " + 100 * (float) Cero / 15 + "%");
    }

}
