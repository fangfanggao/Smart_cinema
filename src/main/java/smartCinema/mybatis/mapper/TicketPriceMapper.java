package smartCinema.mybatis.mapper;


import org.apache.ibatis.annotations.*;
import smartCinema.mybatis.util.TicketPrice;

import java.util.List;
/**
 * Created by lupeidong on 16/7/15.
 */
public interface TicketPriceMapper {

    @Select("select * from ticket_price where movieName = #{movieName}")
    public List<TicketPrice> selectByMovie(String movieName);

    @Select("select * from ticket_price where dayOnScreen = #{dayOnScreen}")
    public List<TicketPrice> selectByDay(int dayOnScreen);

    @Select("select * from ticket_price where dayOnScreen <= #{daysOnScreen}")
    public List<TicketPrice> selectByDays(int daysOnScreen);

    @Select("select * from ticket_price where dayOnScreen <= #{daysOnScreen} and movieName = #{movieName}")
    public List<TicketPrice> selectByMovieDays(@Param("daysOnScreen") int daysOnScreen, @Param("movieName") String movieName);

    @Select("select movieName from ticket_price group by movieName")
    public List<String> selectMovies();

    @Insert("insert into ticket_price(movieName,attendance,ticketPrice,benefit,dayOnScreen)values(#{movieName},#{attendance},#{ticketPrice},#{benefit},#{dayOnScreen})")
    public void  insertPrice(TicketPrice price);

    @Delete("delete from ticket_price where id=#{id}")
    public  void delete(int id);

    @Update("update ticket_price set ticketPrice = #{ticketPrice}, attendance=#{attendance}, benefit=#{benefit} where movieName=#{movieName} and dayOnScreen=#{dayOnScreen}")
    public void updateByMovieDay(@Param("ticketPrice") double ticketPrice,@Param("attendance") int attendance,@Param("benefit") double benefit, @Param("movieName") String movieName, @Param("dayOnScreen") int dayOnScreen);
}
