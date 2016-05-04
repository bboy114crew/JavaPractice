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
public class FulltimeEmp extends People {

    private double basicSalary;
    private double bonus;

    public double calcTotalSalar() {
        return basicSalary + bonus;
    }

    public FulltimeEmp(int id, String name, double basicSalary, double bonus) {
        super(id, name);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FulltimeEmp{" + "basicSalary=" + basicSalary + ", bonus=" + bonus + '}';
    }

}
