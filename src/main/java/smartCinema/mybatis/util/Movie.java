package smartCinema.mybatis.util;

/**
 * Created by lupeidong on 16/7/25.
 */
public class Movie {
    private int id;
    private String movieName;
    private String director;
    private String main_actor1;
    private String main_actor2;
    private int day_on_creen;
    private int attendance;
    private double ticket_price;
    private double benefit;

    public double getBenefit() {
        return benefit;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getDay_on_creen() {
        return day_on_creen;
    }

    public int getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }

    public String getMain_actor1() {
        return main_actor1;
    }

    public String getMain_actor2() {
        return main_actor2;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }

    public void setDay_on_creen(int day_on_creen) {
        this.day_on_creen = day_on_creen;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMain_actor1(String main_actor1) {
        this.main_actor1 = main_actor1;
    }

    public void setMain_actor2(String main_actor2) {
        this.main_actor2 = main_actor2;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

}
