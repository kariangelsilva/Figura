import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        figura Cuadrado = new Cuadrado(lado, null);

        Cuadrado.area();
    }
}