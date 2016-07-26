package smartCinema.mybatis.core;

import smartCinema.mybatis.util.TicketPrice;

import java.util.List;

/**
 * Created by lupeidong on 16/7/20.
 */
public interface TicketPriceService {
    List<TicketPrice> selectByDay(int id);
    List<String> selectMovies();
    List<TicketPrice> selectByMovie(String movieName);
    List<TicketPrice> selectByDays(int daysOnScreen);
    List<TicketPrice> selectByMovieDays(int daysOnScreen,String movieName);
    void delete(int id);
    public void updateByMovieDay(double ticketPrice, int attendance, double benefit, String movieName, int dayOnScreen);
    public void  insertPrice(TicketPrice price);
}
