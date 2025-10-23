public class Cuadrado extends Figura {
    public Cuadrado (Double lado, Double radio){
        super( lado, radio);
    }

@Override
    public void area() {
        double area = lado * lado;
    System.out.println("El area del circulo es: " + area );
        }

}
