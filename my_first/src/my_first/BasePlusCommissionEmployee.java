/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_first;

/**
 *
 * @author tsl
 */
public class BasePlusCommissionEmployee extends Commission_employee{
    
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double earnings()
    {
        return base+super.earnings();
    }
    @Override
    public void Displayalldetails()
    {
    super.Displayalldetails();
    Displayearnings();
    }
    @Override
    public void Displayearnings()
    {
        System.out.println("Earning"+earnings());
    }
}
