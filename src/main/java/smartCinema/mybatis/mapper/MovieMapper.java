package smartCinema.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Primary;

/**
 * Created by lupeidong on 16/7/25.
 */
public interface MovieMapper {
    @Select("select avg(ticket_price) from movies where director=#{director} or "+
            "main_actor1 = #{main_actor1} or main_actor2 =  #{main_actor1}  or " +
            "main_actor1 = #{main_actor2} or main_actor2 =  #{main_actor2} ")
    public double selectAvgPrice(@Param("director") String director,
                                 @Param("main_actor1") String main_actor1,
                                 @Param("main_actor2") String main_actor2);

    @Select("select avg(attendance) from movies where director=#{director} or "+
            "main_actor1 = #{main_actor1} or main_actor2 =  #{main_actor1}  or " +
            "main_actor1 = #{main_actor2} or main_actor2 =  #{main_actor2} ")
    public double selectAvgAttendance(@Param("director") String director,
                                 @Param("main_actor1") String main_actor1,
                                 @Param("main_actor2") String main_actor2);

}
