package mybatisptac.springbootmybatisquickstart.service;

import mybatisptac.springbootmybatisquickstart.Pojo.Person;

public interface PersonService {
    public void InsertP(Person p) throws Exception;
    public void DeleteP(Person p);
}
