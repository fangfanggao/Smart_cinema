package smartCinema.mybatis.imp;

import smartCinema.mybatis.core.IAttendanceService;
import smartCinema.mybatis.mapper.AttendanceMapper;
import smartCinema.mybatis.util.Attendance;

import java.util.List;

/**
 * Created by lupeidong on 16/7/25.
 */
public class AttendanceServiceImp implements IAttendanceService{
    private AttendanceMapper attendanceMapper;

    public AttendanceMapper getAttendanceMapper() {
        return attendanceMapper;
    }

    public void setAttendanceMapper(AttendanceMapper attendanceMapper) {
        this.attendanceMapper = attendanceMapper;
    }

    public List<Attendance> selectBymovieName(String movieName){
        return this.attendanceMapper.selectBymovieName(movieName);
    }
}
