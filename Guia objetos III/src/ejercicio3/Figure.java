package ejercicio3;

public abstract class Figure {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    // -- Constructors --//

    // -- Getters --//
    public String getColor() {
        return color;
    }

    // -- Setters --//

    public void setColor(String color) {
        this.color = color;
    }

    // -- toString --//

    @Override
    public String toString() {
        return "Figura [ color: "+ color + " ]";
    }

    // -- Methods --//
    public abstract double calcArea();
    public abstract double calcperimeter();


}
