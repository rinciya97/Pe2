package com.stackroute.pe2;

class Employeeinfo
{
    String Name;
    int Salary;
    int Age;



    public void setName(String name) {
        Name=name;

    }



    public void setSalary(int salary) {
        Salary = salary;
    }



    public void setAge(int age) {
        Age = age;
    }
    public String getName()
    {
        return Name;
    }
    public int getSalary()
    {
        return Salary;
    }
    public int getAge()
    {
        return Age;
    }
}

public class CheckTheMemberVariable {
    public static void main(String args[]) {
        Employeeinfo ei = new Employeeinfo();
        ei.setName("Harry");
        ei.setAge(23);
        ei.setSalary(21000);
        System.out.println("Members Name "+ ei.getName());
        System.out.println("Members Age "+ei.getSalary());
        System.out.println("Members Salary "+ei.getAge());


    }
}

