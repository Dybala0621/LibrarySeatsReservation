package mybatisptac.springbootmybatisquickstart.Mapper;

import mybatisptac.springbootmybatisquickstart.Pojo.Person;
import mybatisptac.springbootmybatisquickstart.Pojo.Seats;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;
import java.util.List;
/**
 * mapper就是数据访问层（DAO层）
 */

@Mapper
public interface  PersonMapper {

    @Insert("insert Person(UserID , UserPas, SFZid, Phone, Name)\n" +
            "VALUES (#{UserID},#{UserPas},#{SFZid},#{Phone},#{Name})")
    public void insert(Person person);

    @Delete("delete from SRS.Person where UserID=#{UserID} ")
    public void delete(Person person);

}