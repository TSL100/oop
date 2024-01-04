/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

public class SalariedTeacher extends Teacher implements Displayable{
    private double bouns;
    private double dedation;
    public SalariedTeacher(double salary, String courses, String name, int id) {
        super(salary, courses, name, id);
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDedation() {
        return dedation;
    }

    public void setDedation(double dedation) {
        this.dedation = dedation;
    }
     @Override
     public double earnings()
     {
         return bouns - dedation + salary;
     }
      public void Displayalldetails()
    {
    System.out.println("Displayalldetails");
    }
    
    public void Displayearnings()
    {
        System.out.println("Displayearnings");
    }
    public void DisplayName()
    {
    System.out.println();
    }
}
