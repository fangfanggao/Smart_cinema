package smartCinema.imp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smartCinema.core.IMovieAnalysis;
import smartCinema.mybatis.core.IMovieService;
import smartCinema.mybatis.core.TicketPriceService;

/**
 * Created by lupeidong on 16/7/25.
 */
public class MovieAnalysis implements IMovieAnalysis{

    /**
     * scan beans for mybatis
     * @return
     */
    private static IMovieService initContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("cinema_demo.xml");
        IMovieService movieService = (IMovieService) context.getBean("movieService");
        return movieService;
    }

    public int predict_attendance(String director, String main_actor1, String main_actor2){
        IMovieService movieService = initContext();
        int attendance = (int)movieService.selectAvgAttendance(director,main_actor1,main_actor2);
        return attendance;
    }

    public double predict_price(String director, String main_actor1, String main_actor2){
        IMovieService movieService = initContext();
        double price = movieService.selectAvgPrice(director,main_actor1,main_actor2);
        return price;
    }
}
