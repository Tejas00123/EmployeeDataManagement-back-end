package com.verto.service;

import java.util.List;

import com.verto.Exceptions.EmployeeNotFoundException;
import com.verto.entity.Employee;

public interface IEmployeeMgmtService {
  public String addEmployee(Employee employee);
  public List<Employee> fetchAllEmployee();
  public String updateEmployee(Employee employee)throws EmployeeNotFoundException;
  public String updateEmployeePosition(Integer eId,String ePosition)throws EmployeeNotFoundException;
  public String deleteEmployee(Integer eId)throws EmployeeNotFoundException;
  public Employee fetchEmployeeDetailsById(Integer eId)throws EmployeeNotFoundException;
}
