import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smartCinema.mybatis.core.TicketPriceService;
import smartCinema.mybatis.util.TicketPrice;

import java.util.List;

/**
 * Created by lupeidong on 16/7/20.
 */

public class MybatisSpringTest {

    ApplicationContext context = null;
    TicketPriceService ticketPriceService = null;

    @Before
    public void initContext(){
        this.context = new ClassPathXmlApplicationContext("cinema_demo.xml");
        this.ticketPriceService = (TicketPriceService) context.getBean("ticketPriceService");
    }


    @Test
    public void insert(){
        TicketPrice price = new TicketPrice("hahaha",15888,38.7,15001,3);
        ticketPriceService.insertPrice(price);
        List<TicketPrice> ticketPrices = ticketPriceService.selectByDay(3);
        for(TicketPrice ticketPrice:ticketPrices){
            System.out.println(ticketPrice);
        }
    }
    @Test
    public void selectByDay(){

        List<TicketPrice> ticketPrices = ticketPriceService.selectByDay(1);
        for(TicketPrice ticketPrice:ticketPrices){
            System.out.println(ticketPrice);
        }
    }
    @Test
    public void delete(){
        this.ticketPriceService.delete(7);
        List<TicketPrice> ticketPrices = ticketPriceService.selectByDay(3);
        for(TicketPrice ticketPrice:ticketPrices){
            System.out.println(ticketPrice);
        }
    }
}
