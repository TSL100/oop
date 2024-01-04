/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

public class ParttimeTeacher extends Teacher implements Displayable{
    private int hour;
    private double salaryhour;
    public ParttimeTeacher(double salary, String courses, String name, int id) {
        super(salary, courses, name, id);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getSalaryhour() {
        return salaryhour;
    }

    public void setSalaryhour(double salaryhour) {
        this.salaryhour = salaryhour;
    }

    public ParttimeTeacher(int hour, double salaryhour, double salary, String courses, String name, int id) {
        super(salary, courses, name, id);
        this.hour = hour;
        this.salaryhour = salaryhour;
    }
    @Override
     public double earnings()
     {
         return hour * salaryhour;
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
