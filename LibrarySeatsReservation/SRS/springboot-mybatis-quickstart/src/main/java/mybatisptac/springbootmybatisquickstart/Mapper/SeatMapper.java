package mybatisptac.springbootmybatisquickstart.Mapper;

import mybatisptac.springbootmybatisquickstart.Pojo.Seats;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface SeatMapper {
    @Select("select * from SRS.Seats where SeatF = #{seatFloor}")
    public List<Seats> getBySeatF(Short SeatFloor);
    @Insert("insert Seats(SeatId, SeatF) VALUES (#{seatId},#{seatFloor})")
    public void insert(Seats seat);

    @Delete("delete from SRS.Seats where SeatF=#{seatFloor} and SeatId=#{seatId}")
    public void delete(Seats seats);
}

