package com.lyp.ssm.mapper;

import com.github.pagehelper.PageInfo;
import com.lyp.ssm.pojo.Employee;

import java.util.List;


public interface EmployeeMapper {

    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);

    public String updateEmployee(String password);

    public String deleteEmployee(Integer empId);
}
