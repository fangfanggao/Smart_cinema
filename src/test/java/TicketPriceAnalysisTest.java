import smartCinema.imp.FunctionGet;
import smartCinema.imp.TicketPriceAnalysis;
import smartCinema.mybatis.util.TicketPrice;

import java.io.IOException;

/**
 * Created by lupeidong on 16/7/12.
 */
public class TicketPriceAnalysisTest {
    public static void main(String args[]) throws IOException{
        FunctionGet handle = new FunctionGet();
        handle.functionGet();
        //TicketPriceAnalysis ticketPriceAnalysis = new TicketPriceAnalysis();
        //ticketPriceAnalysis.ticketPriceAnalyze("X-MEN",16000,36.7,17009);
    }


}
