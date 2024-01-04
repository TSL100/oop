/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_first;

enum gender{male,female}
public abstract class Employee {
    String name;
    String adress;
    int ssn;
    gender sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public gender getSex() {
        return sex;
    }

    public void setSex(gender sex) {
        this.sex = sex;
    }

    public Employee() {
    }

    public Employee(String name, String adress, int ssn, gender sex) {
        this.name = name;
        this.adress = adress;
        this.ssn = ssn;
        this.sex = sex;
    }
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", adress=" + adress + ", ssn=" + ssn + ", sex=" + sex + '}';
    }
    
}
