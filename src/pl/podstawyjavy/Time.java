package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-07.
 */

public class Time {
    public final static int MAX_HOUR = 23;
    public static final int MAX_MINUTES = 59;
    public static final int MIN_MINUTES = 0;
    public static final int DEFAULT_MINUTES = 0;
    private final static int MIN_HOUR = 0;
    private final static int DEFAULT_HOUR = 0;
    private final static int MINUTES_IN_HOUR = 60;
    private final static int HOURS_PER_DAY = 24;
    private int hours;
    private int minutes;

    public Time() {
    }

    public Time(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < MIN_HOUR || hours > MAX_HOUR) {
            this.hours = DEFAULT_HOUR;
        } else {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < MIN_MINUTES || minutes > MAX_MINUTES) {
            this.minutes = DEFAULT_MINUTES;
        } else {
            this.minutes = minutes;
        }
    }

    public void printTime() {
        System.out.println("Time: " + hours + ":" + minutes);
    }


    // czySieUdalo
    public boolean addMinutes(int minutes) {
        if (minutes < MIN_MINUTES) {
            return false;
        } else {
            int newMinutes = this.minutes + minutes;
            if (newMinutes > MAX_MINUTES) {
                addHours(newMinutes / MINUTES_IN_HOUR);
                this.minutes = newMinutes % MINUTES_IN_HOUR;
            } else {
                this.minutes = newMinutes;
            }
            return true;
        }
    }

    public void addHours(int hours) {
        int newHours = this.hours + hours;

        if (newHours > MAX_HOUR) {
            this.hours = newHours % HOURS_PER_DAY;
        } else {
            this.hours = newHours;
        }
    }

    public void add(Time time){
        int hoursToAdd = time.getHours();
        int minutesToAdd = time.getMinutes();

        addMinutes(minutesToAdd);
        addHours(hoursToAdd);
    }
}