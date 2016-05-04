/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_generics;

/**
 *
 * @author NgT
 */
public class ParttimeEmp extends People{
    
    private double noOfWorks; //so ngay cong
    private double salaryRate; //tien cong nhat
    
    public double calcTotalSalary(){
        return noOfWorks*salaryRate;
    }

    public ParttimeEmp( int id, String name,double noOfWorks, double salaryRate) {
        super(id, name);
        this.noOfWorks = noOfWorks;
        this.salaryRate = salaryRate;
    }

    public double getNoOfWorks() {
        return noOfWorks;
    }

    public void setNoOfWorks(double noOfWorks) {
        this.noOfWorks = noOfWorks;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    @Override
    public String toString() {
        return "ParttimeEmp{" + "noOfWorks=" + noOfWorks + ", salaryRate=" + salaryRate + '}';
    }
    
}
