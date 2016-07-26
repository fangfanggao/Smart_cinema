package smartCinema.mybatis.core;

/**
 * Created by lupeidong on 16/7/25.
 */
public interface IMovieService {
    default double selectAvgPrice(String director, String main_actor1, String main_actor2){
        return 0;
    }

    default double selectAvgAttendance(String director, String main_actor1, String main_actor2){
        return 0;
    }
}
