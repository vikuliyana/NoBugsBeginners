package org.example.task1.clock;

public class Clock implements Readable {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
    }


    @Override
    public void read() {
        System.out.println("Current time: " + hour + " hours " +  minute + " minutes " + second + " seconds");
    }
}
