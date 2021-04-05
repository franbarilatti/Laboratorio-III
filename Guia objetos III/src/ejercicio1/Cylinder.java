package ejercicio1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radio, String color, double height) {
        super(radio, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return super.calcArea();
    }

    public double calcVolume(){
        double volume = calcArea() * this.height;
        return volume;
    }

    @Override
    public String toString() {
        return "Color: "+ this.getColor()+
                " Radio: "+ this.getRadio()+
                " Area de la base: " + calcArea()+
                " Altura: "+this.height+
                " Volumen: "+ calcVolume();
    }
}
