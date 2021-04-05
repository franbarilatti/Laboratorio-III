package ejercicio2;

public class Student extends Person{
    private int ingressYear;
    private double fee;
    private String career;

    public Student() {
    }

    public Student(String dni, String name, String surname, String email, String adress, int ingressYear, double fee, String career) {
        super(dni, name, surname, email, adress);
        this.ingressYear = ingressYear;
        this.fee = fee;
        this.career = career;
    }

    public int getIngressYear() {
        return ingressYear;
    }

    public void setIngressYear(int ingressYear) {
        this.ingressYear = ingressYear;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return super.toString()+
                " año de inicio: "+ingressYear+
                " valor de cuotas: "+ fee+
                " carrera: "+career;

    }
}
