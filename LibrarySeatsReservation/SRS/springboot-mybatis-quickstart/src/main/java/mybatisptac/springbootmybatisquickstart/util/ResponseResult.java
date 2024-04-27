package mybatisptac.springbootmybatisquickstart.util;

import lombok.Data;

/**
 * @description：响应结果返回类
 * @date：2023-03-30 09:08:36
 * @author：wangwc21
 **/
@Data
public class ResponseResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public ResponseResult() {
    }

    /**
     * 返回自定义code、msg和结果对象
     *
     * @param code
     * @param msg
     * @param data
     * @return:
     */
    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 返回定义的异常ResultCode和结果对象
     *
     * @param resultCode
     * @param data
     * @return:
     */
    public ResponseResult(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public static <T> ResponseResult<T> error(String msg) {
        return error(ResultCode.ERROR.getCode(), msg);
    }

    public static <T> ResponseResult<T> error(int code, String msg) {
        return new ResponseResult<>(code, msg, null);
    }

    public static <T> ResponseResult<T> error(int code, String msg, T data) {
        return new ResponseResult<>(code, msg, data);
    }

    public static <T> ResponseResult<T> ok(String msg, T data) {
        return new ResponseResult<>(ResultCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ResponseResult<T> ok(T data) {
        return new ResponseResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public static <T> ResponseResult<T> ok() {
        return new ResponseResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
    }

}
