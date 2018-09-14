package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> findCompany(final String companyPartName) {
        try {
            LOGGER.info("Company search finished");
            return companyDao.findCompanyWithLetters();
        } catch (Exception e) {
            LOGGER.error("error " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Employee> findEmployee(final String employeePartName) {
        try {
            LOGGER.info("Employee search finished");
            return employeeDao.findEmployeeWithLetters();
        } catch (Exception e) {
            LOGGER.error("error " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
