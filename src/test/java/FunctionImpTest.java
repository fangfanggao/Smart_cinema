import smartCinema.imp.FunctionImpl;
import smartCinema.imp.TicketPriceAnalysis;

import java.io.IOException;

/**
 * Created by lupeidong on 16/7/25.
 */
public class FunctionImpTest {

    /**
     * X-MEN
     * Bryan Singer
     * Hugh Jackman
     * James Mangold
     */

    public static void main(String[] args){
        try {
            FunctionImpl.functionImpl("Tickets","Ticket price analysis");
        }catch (IOException e){
            e.printStackTrace();
        }
        /*try {
            TicketPriceAnalysis ticketPriceAnalysis = new TicketPriceAnalysis();
            ticketPriceAnalysis.ticketPriceAnalyze("x-men",328000, 36,20500);
        }catch (IOException e){
            e.printStackTrace();
        }*/

    }
}
