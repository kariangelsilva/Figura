public class Circulo extends figura {

    public Circulo(double radio, double lado){
       super(radio, lado);
    }
@Override
   public void area() {
        System.out.println("El area del circulo es: " + area);
}
}