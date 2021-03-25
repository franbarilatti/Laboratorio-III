package classes;

public class hour {
    private int sec;
    private int min;
    private int hour;

    public hour(int sec, int min, int hour) {
        this.sec =(sec >= 0 && sec < 60) ? sec : 0;
        this.min = (min >= 0 && min < 60) ? min : 0;
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
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

    public hour incrementSecond(){
        hour hour = new hour(this.sec,this.min,this.hour);
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

    public hour decrementSecond(){
        hour hour = new hour(this.sec,this.min,this.hour);
        hour.sec--;
        if(hour.sec < 0){
            hour.sec = 59;
            hour.min--;
        }
        if(hour.min < 0){
            hour.min = 59;
            hour.hour--;
        }

        return hour;
    }
}
