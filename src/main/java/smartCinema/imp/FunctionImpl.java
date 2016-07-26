package smartCinema.imp;

import smartCinema.mybatis.util.Movie;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lupeidong on 16/7/15.
 */
public class FunctionImpl {

    public static void functionImpl(String moduleName,String functionName) throws IOException{

        /**
         * module ticket
         */
        if(moduleName.equals("Tickets")){
            /**
             * function Ticket price analysis
             */
            if(functionName.equals("Ticket price analysis")){

                functionTicketPrice();

            }
        }
    }

    /**
     * function Ticket price analysis
     * default :     movieName: X-MEN
     *               director: Bryan Singer
     *               main_actor1: Hugh Jackman
     *               main_actor2: James Mangold
     *               COST: 30
     */
    private static void functionTicketPrice()throws IOException{
        /**
         * predict benefit
         */
        System.out.println("please input name ,the director, main actor1, main actor2 of your movie for predict");
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        String director = sc.nextLine();
        String main_actor1 = sc.nextLine();
        String main_actor2 = sc.nextLine();

        MovieAnalysis movieAnalysis = new MovieAnalysis();
        int predict_attendance = movieAnalysis.predict_attendance(director,main_actor1,main_actor2);
        double predict_price = movieAnalysis.predict_price(director,main_actor1,main_actor2);

        double cost = 30;   //default 30
        double predict_benefit = (predict_price-cost+10)*predict_attendance; // that  10 RMB income for snacks


        /**
         * analysis
         */
        TicketPriceAnalysis ticketAnalysis = new TicketPriceAnalysis();
        ticketAnalysis.ticketPriceAnalyze(movieName,predict_benefit,predict_price,predict_attendance);


    }


}
