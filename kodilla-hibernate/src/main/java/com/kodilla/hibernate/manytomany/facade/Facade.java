package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> findCompanyByAnyChar(String word) {
        List<Company> companies = companyDao.findByAnyChar(word);
        if (companies.size() >=1){
            LOGGER.info("Successful process!");
        } else {
            LOGGER.error("Not found");
        }
        return companies;
    }

    public List<Employee> findEmployeeByAnyChar(String word) {
        List<Employee> employees = employeeDao.findByAnyChar(word);
        if (employees.size() >=1){
            LOGGER.info("Successful process!");
        } else {
            LOGGER.error("Not found");
        }
        return employees;
    }

}
