/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

public class Student extends Person implements Displayable{
    private int Grad;
    private boolean attend;

    public int getGrad() {
        return Grad;
    }

    public void setGrad(int Grad) {
        this.Grad = Grad;
    }

    public boolean isAttend() {
        return attend;
    }

    public void setAttend(boolean attend) {
        this.attend = attend;
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
