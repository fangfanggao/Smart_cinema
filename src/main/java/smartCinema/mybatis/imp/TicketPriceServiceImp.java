package smartCinema.mybatis.imp;


import smartCinema.mybatis.core.TicketPriceService;
import smartCinema.mybatis.mapper.TicketPriceMapper;
import smartCinema.mybatis.util.TicketPrice;

import java.util.List;

/**
 * Created by lupeidong on 16/7/20.
 */
public class TicketPriceServiceImp implements TicketPriceService {

    private TicketPriceMapper ticketPriceMapper;

    public TicketPriceMapper getTicketPriceMapper(){
        return ticketPriceMapper;
    }

    public void setTicketPriceMapper(TicketPriceMapper ticketPrice) {
        this.ticketPriceMapper = ticketPrice;
    }

    public List<TicketPrice> selectByDay(int id){
        return this.ticketPriceMapper.selectByDay(id);
    }

    public List<String> selectMovies(){
        return this.ticketPriceMapper.selectMovies();
    }
    public List<TicketPrice> selectByMovie(String movieName){
        return this.ticketPriceMapper.selectByMovie(movieName);
    }
    public List<TicketPrice> selectByDays(int daysOnScreen){
        return this.ticketPriceMapper.selectByDays(daysOnScreen);
    }
    public List<TicketPrice> selectByMovieDays(int daysOnScreen,String movieName){
        return this.ticketPriceMapper.selectByMovieDays(daysOnScreen,movieName);
    }
    public void delete(int id){
        this.ticketPriceMapper.delete(id);
    }
    public void updateByMovieDay(double ticketPrice, int attendance, double benefit, String movieName, int dayOnScreen){
        this.ticketPriceMapper.updateByMovieDay(ticketPrice,attendance,benefit,movieName,dayOnScreen);
    }

    public void  insertPrice(TicketPrice price){
        this.ticketPriceMapper.insertPrice(price);
    }
}
