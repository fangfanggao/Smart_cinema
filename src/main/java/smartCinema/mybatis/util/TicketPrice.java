package smartCinema.mybatis.util;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by lupeidong on 16/7/15.
 */
public class TicketPrice {
    private int id;
    private String movieName;
    private int attendance;
    private double ticketPrice;
    private double benefit;
    private int dayOnScreen;

    public TicketPrice(String movieName, int attendance, double ticketPrice, double benefit, int dayOnScreen){
        this.movieName = movieName;
        this.attendance = attendance;
        this.ticketPrice = ticketPrice;
        this.benefit = benefit;
        this.dayOnScreen = dayOnScreen;
    }
    public TicketPrice(){};
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

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getBenifit() {
        return benefit;
    }

    public void setBenifit(double benifit) {
        this.benefit = benifit;
    }

    public int getDayOnScreen() {
        return dayOnScreen;
    }

    public void setDayOnScreen(int dayOnScreen) {
        this.dayOnScreen = dayOnScreen;
    }

    public String toString(){
        return "ID: "+id+", movieName: "+ movieName+", ticketPrice: "+ ticketPrice+", attendance: "+ attendance +
                ", benefit:"+benefit+", dayOnScreen: "+ dayOnScreen;
    }
}
