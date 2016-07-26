import org.junit.Test;
import smartCinema.imp.AttendanceAnalysis;
import smartCinema.mybatis.imp.AttendanceServiceImp;
import smartCinema.mybatis.util.Attendance;

import java.util.List;

/**
 * Created by lupeidong on 16/7/25.
 */
public class AttendanceTest {
    @Test
    public void attendanceTest(){
        List<Attendance> attendances = AttendanceAnalysis.attendanceAnalysis("x-men");
        for(Attendance attendance : attendances){
            System.out.println(attendance);
        }
    }
}
