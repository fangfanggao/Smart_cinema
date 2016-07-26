package smartCinema.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by lupeidong on 16/7/1.
 */
public class SessionsFactory {

    public static SqlSessionFactory getSqlSessionFactory() throws IOException{

        FileInputStream inputSource =  new FileInputStream(Resources.getResourceURL("mybatis/mybatis-config.xml").getFile());

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputSource);
        return sqlSessionFactory;
    }

}
