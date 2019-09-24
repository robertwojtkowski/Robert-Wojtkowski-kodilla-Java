package com.example.hibernate.manytomany.dao;


import com.example.hibernate.manytomany.Company;
import com.example.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();


        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void findByQuer() {
        //Given
        Employee employee1 = new Employee("Firstname", "Lastname");
        Employee employee2 = new Employee("Firstname2", "Lastname2");

        Company company1 = new Company("Company");
        Company company2 = new Company("xyzCompany");

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);

        //When
        companyDao.save(company1);
        int employee1Id = company1.getId();
        companyDao.save(company2);
        int employee2Id = company2.getId();

        //Then
        Assert.assertEquals(1, employeeDao.byLastname("Lastname").size());
        Assert.assertEquals(1, companyDao.firstCharactersIs("Com").size());
        //CleanUp
        try {
            companyDao.deleteById(employee1Id);
            companyDao.deleteById(employee2Id);
        } catch (Exception e) {
            //do nothing
        }

    }
}
