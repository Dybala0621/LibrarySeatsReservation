package mybatisptac.springbootmybatisquickstart.Pojo;

import lombok.*;
@Getter
@ToString
@NoArgsConstructor

public class Person {
    private String userID;
    private String userPas;
    private String SFZid;
    private String phone;
    private String name;
    private Short timeOfVio;
    private Short daysCanUse;

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserPas(String userPas) {
        this.userPas = userPas;
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
        this.phone = phone;
        }
        else{
            throw new Exception("手机号需要11位");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeOfVio(short timeOfVio) {
        this.timeOfVio = 0;
    }

    public void setDaysCanUse(short daysCanUse) {
        this.daysCanUse = 0;
    }

    public Person(String userID, String userPas, String SFZid, String phone, String name, short timeOfVio, short daysCanUse) {
        this.userID = userID;
        this.userPas = userPas;
        this.SFZid = SFZid;
        this.phone = phone;
        this.name = name;
        this.timeOfVio = 0;
        this.daysCanUse = 0;
    }
}
