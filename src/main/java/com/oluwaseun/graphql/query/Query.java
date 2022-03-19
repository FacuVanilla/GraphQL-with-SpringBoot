package com.oluwaseun.graphql.query;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.oluwaseun.graphql.model.Employee;
import com.oluwaseun.graphql.model.InputRequest;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String helloWorld() {
        return "Hello World";
    }

    public String getEmployeeName(String empId) {
        return "TestEmployee for employee id " + empId;
    }

    public Employee getEmployeeNameIfPresent(InputRequest inputRequest) {
        Employee emp = new Employee();
        emp.setEmpId(inputRequest.getEmpId());
        emp.setEmpName("Seun Adedayo");
        emp.setEmpEmail("Adedayo@gnail.com");
        emp.setEmpNationality("Nigeria");
        return emp;
    }

}


