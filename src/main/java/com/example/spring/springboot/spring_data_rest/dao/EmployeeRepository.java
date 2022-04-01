package com.example.spring.springboot.spring_data_rest.dao;

import com.example.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//import java.util.List;

public interface EmployeeRepository extends
        JpaRepository<Employee, Integer
                /*== primary key (Employee --> private int id;) */
                > { // old EmployeeDAO
    // тут важно создавать метод согласно определенным правилам!
//    public List<Employee> findAllByName(String name); // автодополнение в про IDE

    /*
    * <artifactId>spring-boot-starter-data-rest</artifactId>
    * заменит Employee на employees

    * */
}
