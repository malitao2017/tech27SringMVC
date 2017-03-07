package com.dao;

import java.util.List;

import com.model.EmployeeVO;

public interface EmployeeDAO{
    public List<EmployeeVO> getAllEmployees();
}