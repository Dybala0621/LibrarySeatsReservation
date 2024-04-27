package mybatisptac.springbootmybatisquickstart.service.impl;

import mybatisptac.springbootmybatisquickstart.Mapper.PersonMapper;
import mybatisptac.springbootmybatisquickstart.Pojo.Person;
import mybatisptac.springbootmybatisquickstart.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;
    public void InsertP(Person p) throws Exception {//增加一个用户
        personMapper.insert(p);
    }
    public void DeleteP(Person p) {//删除一个用户
        personMapper.delete(p);
    }

}
