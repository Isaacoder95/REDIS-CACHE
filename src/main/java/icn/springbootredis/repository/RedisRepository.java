package icn.springbootredis.repository;

import java.util.Map;

import icn.springbootredis.domain.Student;

public interface RedisRepository {
    Map<String, Student> findAll();
    Student findById(String id);
    void save(Student student);
    void delete(String id);
}
