package com.verto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verto.Exceptions.EmployeeNotFoundException;
import com.verto.entity.Employee;
import com.verto.service.IEmployeeMgmtService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeMgmtService empService;

	@GetMapping("/")
	public String homePage() {
		return "Home Page";
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> enrollEmployee(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		String msg = empService.addEmployee(employee);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Employee>> displayAllEmployee(){
		List<Employee> list = empService.fetchAllEmployee();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> modifyEmplpyee(@RequestBody Employee employee)throws EmployeeNotFoundException{
		String msg = empService.updateEmployee(employee);
		return new ResponseEntity<String>(msg, HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("update/{eId}/{ePosition}")
	public ResponseEntity<String> modifyEmployeePosition(@PathVariable Integer eId,@PathVariable String ePosition)throws EmployeeNotFoundException{
		String msg = empService.updateEmployeePosition(eId, ePosition);
	    return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{eId}")
	public ResponseEntity<String> deleteEmployeeRecord(@PathVariable Integer eId)throws EmployeeNotFoundException{
		String msg = empService.deleteEmployee(eId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/get/{eId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer eId)throws EmployeeNotFoundException{
		Employee employee = empService.fetchEmployeeDetailsById(eId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
}
