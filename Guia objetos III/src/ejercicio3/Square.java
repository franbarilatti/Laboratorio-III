package ejercicio3;

public class Square extends Figure{
    private double side;


    //-- Constructores --//


    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    //-- Getter --//

    public double getSide() {
        return side;
    }

    //-- Setters --//


    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Square{" +
                "side=" + side +
                '}';
    }

    //-- Methods --//
    @Override
    public double calcArea() {return Math.pow(side,2);}

    @Override
    public double calcperimeter() {return side*4;}
}
