package mybatisptac.springbootmybatisquickstart.Pojo;

import lombok.*;
@Getter
@ToString
@NoArgsConstructor

public class Person {
    private String UserID;
    private String UserPas;
    private String SFZid;
    private String Phone;
    private String Name;
    private Short TimeOfVio;
    private Short DaysCanUse;

    public void setUserID(String userID) {
        UserID = userID;
    }

    public void setUserPas(String userPas) {
        UserPas = userPas;
    }

    public void setSFZid(String SFZid)throws Exception {
        if(SFZid.length()==18){
        this.SFZid = SFZid;}
        else{
            throw new Exception("身份证需要18位");
        }
    }

    public void setPhone(String phone)throws Exception {
        if(phone.length()==11){
        Phone = phone;}
        else{
            throw new Exception("手机号需要11位");
        }
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTimeOfVio(short timeOfVio) {
        TimeOfVio = 0;
    }

    public void setDaysCanUse(short daysCanUse) {
        DaysCanUse = 0;
    }

    public Person(String userID, String userPas, String SFZid, String phone, String name, short timeOfVio, short daysCanUse) {
        UserID = userID;
        UserPas = userPas;
        this.SFZid = SFZid;
        Phone = phone;
        Name = name;
        TimeOfVio = 0;
        DaysCanUse = 0;
    }
}
