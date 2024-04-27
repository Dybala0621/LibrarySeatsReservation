package mybatisptac.springbootmybatisquickstart;

import mybatisptac.springbootmybatisquickstart.Mapper.PersonMapper;
import mybatisptac.springbootmybatisquickstart.Mapper.SeatMapper;
import mybatisptac.springbootmybatisquickstart.Pojo.Person;
import mybatisptac.springbootmybatisquickstart.Pojo.Seats;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {
    @Autowired
    private SeatMapper seatMapper;
    @Autowired
    private PersonMapper personMapper;


    public void TestGetBySeatF(Short i){//按楼层查询座位操作
        List<Seats> seats=seatMapper.getBySeatF(i);
        System.out.println(seats.toString());
    }

    public void TestInitSeat() {//座位初始化,先清空所有在增加所有
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

    public void TestInsert() {//插入一个座位
        Seats seat = new Seats();
        seat.setSeatFloor(1);
        seat.setSeatId(1);
        seatMapper.insert(seat);
    }


    public void TestIDelete() {//删除一个座位
        Seats seat = new Seats();
        seat.setSeatId(23);
        seat.setSeatFloor(1);
        seatMapper.delete(seat);
    }


    public void TestInsertP() throws Exception {//增加一个用户
        Person p=new Person();
        p.setUserID("0003");
        p.setName("jones");
        p.setPhone("11111222223");
        p.setUserPas("1234");
        p.setSFZid("123456789012345678");
        personMapper.insert(p);
    }
    @Test
    public void TestIDeleteP() {//删除一个用户
        Person p=new Person();
        p.setUserID("0002");
        personMapper.delete(p);
    }
}
