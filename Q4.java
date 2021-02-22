//Q.4 Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name

import java.util.*;

class Employees
{
    Double age;
    Double salary;
    String name;

    Employees(Double age,Double salary,String name)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    public String toString()
    {
        return this.age+" "+this.salary+" "+this.name;
    }
}

class sortbysalary implements Comparator<Employees>
{
    public int compare(Employees e1,Employees e2)
    {
        return (int)(e1.salary-e2.salary);
    }
}

public class Q4
{
    public static void main(String[] args) {

        ArrayList<Employees> ar = new ArrayList<Employees>();
        ar.add(new Employees(26.1, 21190.0, "Sumit"));
        ar.add(new Employees(31.5, 45634.0, "Vikas"));
        ar.add(new Employees(45.3, 23253.0,"Ashu"));

        Collections.sort(ar,new sortbysalary().reversed());

        for (Employees emp : ar) {
            System.out.println(emp);
        }
    }
}

//Output:
//      31.5 45634.0 Vikas
//      45.3 23253.0 Ashu
//      26.1 21190.0 Sumit

