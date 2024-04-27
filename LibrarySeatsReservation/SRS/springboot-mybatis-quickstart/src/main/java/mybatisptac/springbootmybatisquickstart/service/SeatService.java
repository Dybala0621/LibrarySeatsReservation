package mybatisptac.springbootmybatisquickstart.service;

import mybatisptac.springbootmybatisquickstart.Pojo.Seats;

public interface SeatService {
    //座位操作的方法
    void insertSeat(Seats seats);//插入座位
    void DeleteSeat(Seats seat);//删除座位
    void GetBySeatF(Short i);//根据楼层查找座位
    void InitSeat();//座位初始化方法
}
