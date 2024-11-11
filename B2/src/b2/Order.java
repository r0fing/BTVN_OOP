/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.util.ArrayList;
import java.util.Currency;

/**
 *
 * @author HLC_2021
 */
public class Order {
    private Customer customer;
    private ArrayList<OrderLine> orderLines = new ArrayList<>();
    private Currency total ;

    public Order(Customer customer, Currency total) {
        this.customer = customer;
        this.total = total;
    }

    public void addLine(OrderLine line) {
        orderLines.add(line);
    }

    public void removeLine(OrderLine line) {
        orderLines.remove(line);
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Customer getCustomer() {
        return customer;
    }
    
}
