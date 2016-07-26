package smartCinema.imp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smartCinema.core.ITicketsPriceAnalysis;
import smartCinema.mybatis.core.TicketPriceService;
import smartCinema.mybatis.util.TicketPrice;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lupeidong on 16/7/24.
 */
public class TicketPriceAnalysis implements ITicketsPriceAnalysis{
    private  double k_benefit = 0;
    private  double benefit_predict;
    private  double price_predict;

    private  double k_attendance = 0;

    private  int attendance_predict;


    /**
     * analysis tickets' record
     * @param movieName
     * @param benefit_predict
     * @param price_predict
     * @param attendance_predict
     * @throws IOException
     */
    public void ticketPriceAnalyze(String movieName,double benefit_predict, double price_predict,int attendance_predict) throws IOException {
        this.benefit_predict = benefit_predict;
        this.price_predict = price_predict;
        this.attendance_predict = attendance_predict;

        /**
         * scan beans for mybatis
         */
        TicketPriceService ticketPriceService = initContext();

        /**
         * get all records about one movie
         */
        List<TicketPrice> tickets = ticketPriceService.selectByMovieDays(3,movieName);
        double benefitMax = 0;
        double benefit_avg = benefit_predict;

        double attendanceMax = 0;
        int attendance_avg = attendance_predict;
        double price_avg = price_predict;

        if(tickets.isEmpty()){
            System.out.println("the movie hasn't been on screen. we suggest ticket price: "+price_predict);
            return;
        }
        /**
         * analysis the price and give a suggestion
         */
        for(TicketPrice ticket : tickets){
            System.out.println(ticket);
            if(ticket.getDayOnScreen()==0){
                /**
                 * benefit
                 */
                k_benefit = Math.atan((ticket.getBenifit()-benefit_predict)/benefit_predict)*2/Math.PI;
                benefitMax = k_benefit*ticket.getTicketPrice()+(1-k_benefit)*price_predict;
                benefit_avg = (ticket.getBenifit()+benefit_predict)/2;

                /**
                 * attendance
                 */
                k_attendance = Math.atan((ticket.getAttendance()-attendance_predict)/attendance_predict)*2/Math.PI;
                attendanceMax = k_attendance*ticket.getTicketPrice()+(1-k_benefit)*price_predict;
                attendance_avg = (ticket.getAttendance()+attendance_predict)/2;

                price_avg = (ticket.getTicketPrice()+price_predict)/2;
            }else{
                /**
                 * benefit
                 */
                k_benefit = Math.atan((ticket.getBenifit()-benefit_avg)/benefit_avg)*2/Math.PI;
                //benefitMax = k_benefit*ticket.getTicketPrice() + (1-k_benefit)*price_avg;
                benefitMax = (1+k_benefit)*ticket.getTicketPrice();

                benefit_avg = (benefit_avg*ticket.getDayOnScreen()+ticket.getBenifit())/(ticket.getDayOnScreen()+1);
                /**
                 * attendance
                 */
                k_attendance = Math.atan((ticket.getAttendance()-attendance_avg)/attendance_avg)*2/Math.PI;

                attendanceMax = (1-k_attendance)*ticket.getTicketPrice();

                attendance_avg = (attendance_avg*ticket.getDayOnScreen()+ticket.getAttendance())/(ticket.getDayOnScreen()+1);

                price_avg = (price_avg*ticket.getDayOnScreen()+ticket.getTicketPrice())/(ticket.getDayOnScreen()+1);
                }
        }


        System.out.println("our suggestion ticket price: "+benefitMax+" can get most benefit");
    }

    /**
     * scan beans for mybatis
     * @return
     */
    private static TicketPriceService initContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("cinema_demo.xml");
        TicketPriceService ticketPriceService = (TicketPriceService) context.getBean("ticketPriceService");
        return ticketPriceService;
    }

    public double getBenefit_predict() {
        return benefit_predict;
    }

    public double getPrice_predict() {
        return price_predict;
    }
}
