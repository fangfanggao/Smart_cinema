package smartCinema.imp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smartCinema.mybatis.core.IAttendanceService;
import smartCinema.mybatis.core.TicketPriceService;
import smartCinema.mybatis.util.Attendance;

import java.util.List;

/**
 * Created by lupeidong on 16/7/25.
 */
public class AttendanceAnalysis {

    public static List<Attendance> attendanceAnalysis(String movieName){
        IAttendanceService iAttendanceService = initContext();
        List<Attendance> attendances = iAttendanceService.selectBymovieName(movieName);
        return attendances;
    }

    /**
     * scan beans for mybatis
     * @return
     */
    private static IAttendanceService initContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("cinema_demo.xml");
        IAttendanceService iAttendanceService = (IAttendanceService) context.getBean("attendanceService");
        return iAttendanceService;
    }


}
