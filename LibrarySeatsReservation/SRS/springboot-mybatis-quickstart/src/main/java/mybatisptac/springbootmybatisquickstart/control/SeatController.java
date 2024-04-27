package mybatisptac.springbootmybatisquickstart.control;

import mybatisptac.springbootmybatisquickstart.Pojo.Seats;
import mybatisptac.springbootmybatisquickstart.service.SeatService;
import mybatisptac.springbootmybatisquickstart.util.ResponseResult;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//声明是一个启动类
@RequestMapping("/seat")//请求处理类，需要处理的请求路径为seat/seats
@ResponseBody
/**
 * Controller层通常是应用程序的接入层
 * controller(view)-->service-->mapper(DAO)
 */
public class SeatController {
    @Autowired
    SeatService seatService;
    /**
     * 新增一个座位
     *
     **/
    @PostMapping("/seats")//指定请求路径
    public ResponseResult<String> insertSeats(@RequestBody Seats seats){
        seatService.insertSeat(seats);
        return ResponseResult.ok("新增成功");
    }
    /**
     * post:增 delete：删 put：改 get：查
     */
    @DeleteMapping("/seats")
    public ResponseResult<String> deleteSeats(@RequestBody Seats seats){
        seatService.DeleteSeat(seats);
        return ResponseResult.ok("删除成功");
    }
    @GetMapping("/seats")
    public ResponseResult<String> getSeats(short i){
        seatService.GetBySeatF(i);
        return ResponseResult.ok("查找成功");
    }

}
