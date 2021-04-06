package ejercicio3;

public class Circulo extends Figure{

    private double radio;

    // -- Constructor --//

    public Circulo() {
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // -- Getters --//

    public double getRadio() {
        return radio;
    }

    // -- Setters --//

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // -- toString --//

    @Override
    public String toString() {
        return super.toString()+
                "Circulo{" +
                "radio=" + radio +
                '}';
    }


    // -- Methods --//


    @Override
    public double calcArea() { return Math.PI * Math.pow(radio,2); }

    @Override
    public double calcperimeter() { return 2 * Math.PI * radio; }
}
