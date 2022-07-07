package org.example.dao;

import org.example.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface Dao<T>{

    Optional<T> get (long id);
    List<T> findAll();

    void save(T t);
    void update(T t, String [] params);
   // List<Employee> delete(T t);

    List<Employee> delete(int id);
}
