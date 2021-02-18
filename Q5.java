//Q.5 Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age

import java.util.*;

class Student
{
    String name;
    Double score;
    Double age;

    Student(String name, Double score, Double age)
    {
        this.name=name;
        this.score=score;
        this.age=age;

    }
    public String toString()
    {
        return this.age+" "+this.score+" "+this.name;
    }
}

class sortByScore implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return (int)(s1.score-s2.score);
    }
}
class sortByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Q5
{
    public static void main(String[] args) {

        ArrayList<Student> ar = new ArrayList<>();

        ar.add(new Student("Sumit", 78.5, 24.2));
        ar.add(new Student("Vikas", 76.4, 23.1));
        ar.add(new Student("Deepak", 88.2, 24.7));
        ar.add(new Student("Ashu", 88.2, 25.8 ));

        Collections.sort(ar,new sortByScore().thenComparing(new sortByName()));

        for (Student std : ar) {
            System.out.println(std);
        }
    }
}

//Output:
//        23.1 76.4 Vikas
//        24.2 78.5 Sumit
//        25.8 88.2 Ashu
//        24.7 88.2 Deepak
