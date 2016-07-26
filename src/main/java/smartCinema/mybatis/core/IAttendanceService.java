package smartCinema.mybatis.core;

import smartCinema.mybatis.util.Attendance;

import java.util.List;

/**
 * Created by lupeidong on 16/7/25.
 */
public interface IAttendanceService {
    default List<Attendance> selectBymovieName(String movieName){
        return null;
    }
}
