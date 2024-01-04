/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_first;

/**
 *
 * @author tsl
 */
public class Commission_employee extends Employee implements Displayable
{
    private double gross_sales;
    private double commission_rate;

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    @Override
     public double earnings()
    {
        return gross_sales*commission_rate;
    }

    @Override
    public String toString() {
        return "Commission_employee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }
     
      public void Displayalldetails()
    {
        System.out.println(super.toString());
        System.out.println(this.toString());
    }
    public void Displayearnings()
    {System.out.println(earnings());
    }
}
