/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1;

/**
 *
 * @author HLC_2021
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new PartTimeEmployee("Nguyen Van A", 40000, 5);
        Employee e2 = new FullTimeEmployee("Dang Thi B", 100000);
        System.out.println(e1.getName() + " " + e1.getPaymentPerHour() + " " + e1.calculateSalary());
        System.out.println(e2.getName() + " " + e2.getPaymentPerHour() + " " + e2.calculateSalary());
    }
}
