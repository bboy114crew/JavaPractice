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
public class PRO192_generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Payroll<FulltimeEmp> fulltimeEmp = new Payroll<FulltimeEmp>();
        fulltimeEmp.add(new FulltimeEmp(1, "Nguy Van Thang", 5000000.0, 700000.0));
        fulltimeEmp.add(new FulltimeEmp(1, "Nguyen Thuy Linh", 4000000.0, 6000000.0));
        dumPayroll(fulltimeEmp);
    }

    public static void dumPayroll(Payroll c) {
        for (int k = 0; k < c.resource.size(); k++) {
            System.out.println(c.resource.get(k));
        }
    }
}
