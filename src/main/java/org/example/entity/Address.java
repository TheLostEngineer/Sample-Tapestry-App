package org.example.entity;

import org.apache.tapestry5.beaneditor.Validate;

public class Address {

    @Validate("required")
    public String employeeName;
    @Validate("required")
    public String employeeAddress;
    @Validate("required")
    public int employeeSalary;
}
