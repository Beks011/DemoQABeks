package com.demoqa.utils;

import com.demoqa.entities.Employee;
import com.demoqa.entities.PractiseFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.github.javafaker.Faker;

public class RandomUtils  {
    Faker faker = new Faker();
    public  TextBoxEntity generaterandomTextBoxEntity(){
        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;
    }

    public PractiseFormEntity ganeraterandomPractiseFormEntity(){
        PractiseFormEntity practiseFormEntity = new PractiseFormEntity();
        practiseFormEntity.setFirstName(faker.name().fullName());
        practiseFormEntity.setLastName(faker.name().lastName());
        practiseFormEntity.setEmail(faker.internet().emailAddress());
        practiseFormEntity.setNumber(faker.phoneNumber().subscriberNumber(10));
        practiseFormEntity.setCurrentAddress(faker.address().fullAddress());
        practiseFormEntity.setSubject(faker.random().toString());
        practiseFormEntity.setState("Haryana");
        practiseFormEntity.setCity("Panipat");
        return practiseFormEntity;
    }

    public Employee createMockEmployee(){
        Employee employee = new Employee();
        employee.setFirstName(faker.name().firstName());
        employee.setLastName(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18,100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(1000000l,2000000000l));
        employee.setDepartment(faker.job().position());
        return employee;
    }
}
