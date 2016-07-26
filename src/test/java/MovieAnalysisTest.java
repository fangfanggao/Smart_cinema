import org.junit.Test;
import smartCinema.imp.MovieAnalysis;

/**
 * Created by lupeidong on 16/7/25.
 */
public class MovieAnalysisTest {
    @Test
    public void movieTest(){
        MovieAnalysis movieAnalysis = new MovieAnalysis();
        int attendance = movieAnalysis.predict_attendance("Bryan Singer","Hugh Jackman","James Mangold");
        System.out.println(attendance);
        double price = movieAnalysis.predict_price("Bryan Singer","Hugh Jackman","James Mangold");
        System.out.println(price);
    }
}
