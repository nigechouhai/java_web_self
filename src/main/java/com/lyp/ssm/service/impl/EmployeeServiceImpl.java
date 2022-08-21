package com.lyp.ssm.service.impl;

import com.lyp.ssm.mapper.EmployeeMapper;
import com.lyp.ssm.pojo.Employee;
import com.lyp.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 4);
        //查询所有的员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public String updateEmployee(String password) {
        return employeeMapper.updateEmployee(password);
    }

    @Override
    public String deleteEmployee(Integer empId) {
        return employeeMapper.deleteEmployee(empId);
    }

}
