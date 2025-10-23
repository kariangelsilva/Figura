public class Circulo extends Figura{

    public Circulo(double radio, double lado) {
        super(lado, radio); 
    }

    @Override
    public void area() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}

