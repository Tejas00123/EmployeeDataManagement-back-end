package com.verto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verto.Exceptions.EmployeeNotFoundException;
import com.verto.entity.Employee;
import com.verto.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepo empRepo;
	
	@Override
	public String addEmployee(Employee employee) {
//		boolean exists = empRepo.existsById(employee.getEId());
//	    if(exists) {
//	    	 throw new IllegalArgumentException("Record already exists in DB with this ID : "+employee.getEId()); 
//	    }
//	    
	    	Integer eId = empRepo.save(employee).getEId();
	    	return "Employee added Successfully..! with id : "+eId;
		
	}
	
	@Override
	public List<Employee> fetchAllEmployee() {
		return empRepo.findAll();
	}
	
	@Override
	public String updateEmployee(Employee employee) throws EmployeeNotFoundException {
	    empRepo.findById(employee.getEId())
	           .orElseThrow(() -> new EmployeeNotFoundException(
	               "Employee with ID: " + employee.getEId() + " not found!"
	           ));

	    empRepo.save(employee);
	    return "Employee record updated successfully with ID: " + employee.getEId();
	}
	
	@Override
	public String updateEmployeePosition(Integer eId, String ePosition)throws EmployeeNotFoundException {
		Employee employee = empRepo.findById(eId)
		.orElseThrow(()->new EmployeeNotFoundException(
				"Employee with ID: " + eId + " not found!"));
		employee.setEPosition(ePosition);
		empRepo.save(employee);
		return "Employee Position updated successfully with ID: "+ eId;
	}

	@Override
	public String deleteEmployee(Integer eId) throws EmployeeNotFoundException {
		empRepo.findById(eId)
        .orElseThrow(() -> new EmployeeNotFoundException(
            "Employee with ID: " + eId+ " not found!"
        ));
		empRepo.deleteById(eId);
		return "Employee record eeleted successfully with ID: "+ eId;
	}
	
	@Override
	public Employee fetchEmployeeDetailsById(Integer eId)throws EmployeeNotFoundException {
		Employee employee = empRepo.findById(eId)
        .orElseThrow(() -> new EmployeeNotFoundException(
            "Employee with ID: " + eId+ " not found!"
        ));
		return employee;
	}
}
