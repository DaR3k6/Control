import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = n.nextInt();

        if (numero < 0) {
            System.out.println("Numero negativo:" + numero);
        } else System.out.println("Numero positivo:" + numero);

    }
}