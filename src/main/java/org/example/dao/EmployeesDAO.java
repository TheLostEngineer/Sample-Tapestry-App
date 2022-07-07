package org.example.dao;

import org.example.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EmployeesDAO implements Dao<Employee> {
    private List<Employee> employees = new ArrayList<>();

    public EmployeesDAO() {
        employees.add(new Employee(1, "Raj", "Delhi", 40000));
        employees.add(new Employee(2, "Amit", "Noida", 45000));
        employees.add(new Employee(3, "Suraj", "Mumbai", 54000));
        employees.add(new Employee(4, "Krishna", "Chennai", 64000));
        employees.add(new Employee(5, "Hitesh", "Pune", 45000));



    }





    @Override
    public Optional<Employee> get(long id) {
        return Optional.ofNullable(employees.get((int) id));
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }



    @Override
    public void save(Employee employee) {
        employee.add(employee);

    }

    @Override
    public void update(Employee employee, String[] params) {
//        employees.setEmployeeId(Objects.requireNonNull(
//                params[0], "Id cannot be null"));
        employee.setEmployeeName(Objects.requireNonNull(
                params[1], "Name cannot be null"));
        employee.setEmployeeAddress(Objects.requireNonNull(
                params[2], "Address cannot be null"));
//        employees.setEmployeeSalary(Objects.requireNonNull(
//                params[3],));

    }

//    @Override
//    public List<Employee> delete(Employee employee) {
//        return null;
//    }

    @Override
    public List<Employee> delete(int employeeId) {
        return employees;
    }
}
