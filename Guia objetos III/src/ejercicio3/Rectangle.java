package ejercicio3;

public class Rectangle extends Figure{

    private double height;
    private double width;

    // -- Constructor --//

    public Rectangle() {
    }

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    // -- Getters --//

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // -- Setters --//

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    // -- toString --//

    @Override
    public String toString() {
        return super.toString()+
                "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    // -- Methods --//


    @Override
    public double calcArea() { return height * width;}

    @Override
    public double calcperimeter() { return (2*height)+(2*width);}
}
