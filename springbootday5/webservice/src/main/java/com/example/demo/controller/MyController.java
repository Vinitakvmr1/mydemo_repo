package com.example.demo.controller;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.sun.tools.javac.util.List;

@RestController
public class MyController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Welcome to Rest based web service";
	}
	@GetMapping("/user{arg}")
	public String display(@PathVariable String arg) {
		return "Welcome"+arg+"Vinita";
	}
	//GetMapping("/user?name={value}")
	//public String show(@PathParam(value="name") String name) {
		//return "Wecome user="+name+" to REST Web Service";
	//}
	
	@GetMapping("/employee")
    public Employee getEmployee() {
        return new Employee(100, "Test", "Test@gmail.com");
    }
 
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(101, "Test", "Test@gmail.com"));
        employeeList.add(new Employee(102, "Abcd", "abcd@gmail.com"));
        employeeList.add(new Employee(103, "Xyz", "xyz@gmail.com"));
        employeeList.add(new Employee(104, "Lmn", "lmn@gmail.com"));
        employeeList.add(new Employee(105, "BCD", "bcd@gmail.com"));
        return employeeList;
    }

}
