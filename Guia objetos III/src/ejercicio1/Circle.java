package ejercicio1;

public class Circle {
    private double radio = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public double setRadio(double radio) {
        this.radio = radio;
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcArea(){
        double area = 0;
        area = Math.PI * Math.pow(this.radio,2);
        return area;
    }

    @Override
    public String toString() {
        return "color: "+ this.color+
                " radio: "+ this.radio+
                " area: "+ calcArea();
    }
}
