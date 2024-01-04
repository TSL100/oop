/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

public abstract class Teacher extends Person{
    double salary;
    String courses;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public Teacher(double salary, String courses, String name, int id) {
        super(name, id);
        this.salary = salary;
        this.courses = courses;
    }
    public abstract double earnings();
}
