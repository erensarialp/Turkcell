package com.turkcell;

public class Example {
    public static void main(String[] args) {

        Employee emp = new Employee("Eren", "Sarialp", "123", 50, "IT" );

        Employee emp1 = new Employee();
        emp1.setFirstName("Seko");
        System.out.println(emp1.getFirstName());
    }

}
