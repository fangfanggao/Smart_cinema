package smartCinema.core;

/**
 * Created by lupeidong on 16/7/25.
 */
public interface IMovieAnalysis {
    default int predict_attendance(String director, String main_actor1, String main_actor2){
        return 0;
    }

    default double predict_price(String director, String main_actor1, String main_actor2){
        return 0;
    }
}
