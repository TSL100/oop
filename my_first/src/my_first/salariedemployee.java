/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_first;

/**
 *
 * @author tsl
 */
public class salariedemployee extends Employee implements Displayable{
    double salary,bonus,deduction;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public salariedemployee() {
    }

    public salariedemployee(double salary, double bonus, double deduction, String name, String adress, int ssn, gender sex) {
        super(name, adress, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    @Override
    public double earnings()
    {
    return (salary + bonus) - deduction;
    }
    public void Displayalldetails()
    {
        System.out.println(super.toString());
        System.out.println(this.toString());
    }
    public void Displayearnings()
    {System.out.println(earnings());}

    @Override
    public String toString() {
        return "Salariedemployee{" + "salary=" + salary + ", bonus=" + bonus + ", deduction=" + deduction + '}';
    }
    
}
