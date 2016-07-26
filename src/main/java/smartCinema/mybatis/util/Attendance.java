package smartCinema.mybatis.util;

import java.sql.Timestamp;

/**
 * Created by lupeidong on 16/7/1.
 */
public class Attendance {
    private int id;

    private String movieName;

    private double rowChipRate;

    private double attendRate;

    private int dayOnScreen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getRowChipRate() {
        return rowChipRate;
    }

    public void setRowChipRate(double rowChipRate) {
        this.rowChipRate = rowChipRate;
    }

    public double getAttendRate() {
        return attendRate;
    }

    public void setAttendRate(double attendRate) {
        this.attendRate = attendRate;
    }

    public int getDayOnScreen(){
        return dayOnScreen;
    }

    public void setDayOnScreen(int day) {
        this.dayOnScreen = day;
    }

    @Override
    public String toString() {
        return "id: " + id + ", movie's name: " + movieName + ", movie schedule rate: " + rowChipRate
                + ", attend rate: " + attendRate + ", day on Screen: "+dayOnScreen;
    }
}
