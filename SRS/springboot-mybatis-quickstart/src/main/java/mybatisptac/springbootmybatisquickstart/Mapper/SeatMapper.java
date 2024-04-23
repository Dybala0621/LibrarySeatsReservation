package mybatisptac.springbootmybatisquickstart.Mapper;

import mybatisptac.springbootmybatisquickstart.Pojo.Seats;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface SeatMapper {
    @Select("select * from SRS.Seats where SeatF = #{SeatF}")
    public List<Seats> getBySeatF(Integer SeatF);
    @Insert("insert Seats(SeatId, SeatF) VALUES (#{SeatId},#{SeatF})")
    public void insert(Seats seat);

    @Delete("delete from Seats where SeatF=#{SeatF} and SeatId=#{SeatId}")
    public void delete(Seats seats);
}

