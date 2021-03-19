package classes;

public class Rectangulo {
    private double alto = 1.0;
    private double ancho = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto(double alto) {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho(double ancho) {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcPerimetro(){
        return 2 * (ancho + alto);
    }

    public double calcArea(){
        return ancho * alto;
    }

}
