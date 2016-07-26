package smartCinema.mybatis.imp;

import smartCinema.mybatis.core.IMovieService;
import smartCinema.mybatis.mapper.MovieMapper;

/**
 * Created by lupeidong on 16/7/25.
 */
public class MovieServieImp implements IMovieService {

    private MovieMapper movieMapper;

    public MovieMapper getMovieMapper() {
        return movieMapper;
    }

    public void setMovieMapper(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public double selectAvgPrice(String director, String main_actor1, String main_actor2){
        return this.movieMapper.selectAvgPrice(director,main_actor1,main_actor2);
    }

    public double selectAvgAttendance(String director, String main_actor1, String main_actor2){
        return this.movieMapper.selectAvgAttendance(director,main_actor1,main_actor2);
    }

}
