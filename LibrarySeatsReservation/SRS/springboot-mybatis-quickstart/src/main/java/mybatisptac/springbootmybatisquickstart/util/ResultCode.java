package mybatisptac.springbootmybatisquickstart.util;

/**
 * @description：返回状态码和说明
 * @date：2023-03-30 09:08:56
 * @author：wangwc21
**/
public enum ResultCode {
    //返回
    SUCCESS(200, "请求成功！"),

    EXCEPT(500, "系统异常，请稍后重试！"),
    ERROR(501, "系统内部错误！"),
    PARAM_ERROR(502,"参数错误!"),
    ;

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据msg获取ResultCode
     *
     * @param msg
     * @return: com.taikang.iot.init.common.ResultCode
     * @author: chengdan15
     * @date: 2021/9/22 14:39
     */
    public static ResultCode getResultByMsg(String msg) {
        ResultCode result = null;
        for (ResultCode c : ResultCode.values()) {
            if (c.getMsg().equals(msg)) {
                result = c;
                break;
            }
        }
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
