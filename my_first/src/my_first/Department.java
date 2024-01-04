/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_first;

import java.util.ArrayList;

public class Department {
    int dno;
    String dname;
    ArrayList <Employee> emplist;

    public Department() {
    }

    public Department(int dno, String dname, ArrayList<Employee> emplist) {
        this.dno = dno;
        this.dname = dname;
        this.emplist = emplist;
    }
    public void add_employee(Employee e)
    {emplist.add(e);}
    public void remove_employee(int indx)
    {emplist.remove(indx);}
    public int getemployeecount()
    {return emplist.size();}
    public void print_basic_data (){
for(int i=0 ; i<emplist.size ();i++)
{
System.out.println(emplist.get(i).getSsn()+" "+emplist.get(i).getName()+" "+emplist.get(i).getSex());
}
    }
    public void print_all_details()
    {
    for(int i=0 ; i<emplist.size ();i++)
    {
    if(emplist.get(i) instanceof salariedemployee)
        ((salariedemployee)emplist.get(i)).Displayalldetails();
     if(emplist.get(i) instanceof Hourlyemployee)
        ((Hourlyemployee)emplist.get(i)).Displayalldetails();
      if(emplist.get(i) instanceof Commission_employee)
        ((Commission_employee)emplist.get(i)).Displayalldetails();
    }
    }
    }
