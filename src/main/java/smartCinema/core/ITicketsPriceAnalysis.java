package smartCinema.core;

import java.io.IOException;

/**
 * Created by lupeidong on 16/7/25.
 */
public interface ITicketsPriceAnalysis {
    default void ticketPriceAnalyze(int day, double benefit_predict, double price_predict)throws IOException{
        return;
    }


}
