import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scar= new Scanner(System.in);
    
    System.out.print("Ingrese el lado del cuadrado: ");
    double ladoCuadrado = scar.nextDouble();
    double radioCuadrado= 0;
    Figura cuadrado= new Cuadrado (ladoCuadrado, radioCuadrado);

    System.out.print("Ingrese el radio del círculo:");
        double radioCirculo = scar.nextDouble();
        double ladoCirculo = 0;


        Figura c = new Circulo(radioCirculo, ladoCirculo);

    

    cuadrado.area();
      c.area();
        scar.close();
}
}