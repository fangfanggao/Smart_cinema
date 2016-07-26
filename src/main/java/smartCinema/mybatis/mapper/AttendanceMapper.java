package smartCinema.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import smartCinema.mybatis.util.Attendance;

import java.util.List;

/**
 * 以下的操作1都是把SQL写在配置文件里面的，而操作2都是直接用注解标明要执行的SQL语句
 * 因为该Mapper的全名跟BlogMapper.xml文件里面的namespace是一样的，所以不能在这里面
 * 用注解定义一个与BlogMapper.xml文件里面同名的映射
 * @author andy
 *
 */
public interface AttendanceMapper {


    @Select("select * from t_attendance where movieName = #{movieName}")
    public List<Attendance>  selectBymovieName(String movieName);


    @Insert("insert into t_attendance(movieName,rowChipRate,attendRate,dayOnScreen) values(#{movieName},#{rowChipRate},#{attendRate},#{dayOnScreen})")
    public void insertAttendance2(Attendance attendance);


    @Update("update t_attendance set movieName=#{movieName},rowChipRate=#{rowChipRate},attendRate=#{attendRate},dayOnScreen=#{dayOnScreen} where id=#{id}")
    public void updateAttendance2(Attendance attendance);


    @Delete("delete from t_attendance where id = #{id}")
    public void deleteAttendance2(int id);


    @Select("select * from t_attendance")
    public List<Attendance> selectAll();


    @Select("select * from t_attendance where movieName like \"%\"#{movieName}\"%\"")
    public List<Attendance> fuzzyQuery2(String movieName);

}
