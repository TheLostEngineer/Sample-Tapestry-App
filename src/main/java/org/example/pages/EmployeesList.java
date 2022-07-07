package org.example.pages;

import org.apache.tapestry5.annotations.Property;
import org.example.dao.EmployeesDAO;
import org.example.entity.Employee;

import java.util.List;

public class EmployeesList {

//    @Inject
//    private EmployeesDAO employeesDAO;

    @Property
    private Employee employee;


    public List<Employee> getEmployees() {
        EmployeesDAO employeesDAO = new EmployeesDAO();
        return employeesDAO.findAll();
    }

    void onActionFromDelete() {
        EmployeesDAO employeesDAO = new EmployeesDAO();
        employeesDAO.delete(1);
        return;

    }

    }

//    @Property
//    private String name, address, salary;
//
//    void setupRender() {
//        name = "Ajay";
//        address = "Pune";
//        salary = "10000";
//    }
//
//
//}
