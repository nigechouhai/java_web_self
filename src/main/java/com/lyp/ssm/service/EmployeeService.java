package com.lyp.ssm.service;

import com.lyp.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface EmployeeService {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    /**
     * 修改员工信息
     * @param password
     */
    public String updateEmployee(String password);

    /**
     * 删除员工信息
     * @param empId
     */
    public String deleteEmployee(Integer empId);
}
