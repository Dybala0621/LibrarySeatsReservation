package mybatisptac.springbootmybatisquickstart.service.impl;

import mybatisptac.springbootmybatisquickstart.Mapper.SeatMapper;
import mybatisptac.springbootmybatisquickstart.Pojo.Seats;
import mybatisptac.springbootmybatisquickstart.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISeatServiceImpl implements SeatService {

    @Autowired
    SeatMapper seatMapper;
    @Override
    public void insertSeat(Seats seat) {
        seatMapper.insert(seat);
    }
    public void DeleteSeat(Seats seat) {//删除一个座位
        seatMapper.delete(seat);
    }
    public void GetBySeatF(Short i){//按楼层查询座位操作
        List<Seats> seats=seatMapper.getBySeatF(i);
        System.out.println(seats.toString());
    }
    public void InitSeat() {//座位初始化,先清空所有在增加所有
        for(int i=1;i<=6;i++){
            for(int j=1;j<=100;j++){
                Seats seat = new Seats();
                seat.setSeatFloor(i);
                seat.setSeatId(j);
                seatMapper.delete(seat);
            }
        }
        for(int i=1;i<=6;i++){
            for(int j=1;j<=100;j++){
                Seats seat = new Seats();
                seat.setSeatFloor(i);
                seat.setSeatId(j);
                seatMapper.insert(seat);
            }
        }
    }
}
