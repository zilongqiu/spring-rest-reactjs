package com.example.springrestreactjs.payroll.repository;

import com.example.springrestreactjs.payroll.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
