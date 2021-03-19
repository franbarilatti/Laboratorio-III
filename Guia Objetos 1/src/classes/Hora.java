package classes;

public class Hora {
    private int sec;
    private int min;
    private int hour;

    public Hora(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Hora incrementSecond(){
        Hora hour = new Hora(this.sec,this.min,this.hour);
        hour.sec++;
        if(hour.sec == 60){
            hour.sec = 0;
            hour.min++;
        }
        if (hour.min == 60){
            hour.min = 0;
            hour.hour++;
        }
        return hour;
    }

    public Hora decrementSecond(){
        Hora hour = new Hora(this.sec,this.min,this.hour);
        hour.sec--;
        if
    }
}
