public class Cuadrado extends figura {

    public Cuadrado(double radio, double lado){
       super(radio, lado);

    }
@Override
   public void area() {
        System.out.println("El area del Cuadrado es:" + area );
        double area = lado * lado;
}
}