/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author HLC_2021
 */
public class OrderList {
    private ArrayList<Order> orders = new ArrayList<>();
    
    public void add(Order order) {
        orders.add(order);
    }
    
    public void remove(Order order) {
        orders.remove(order);
    }
    
    public Iterator<Order> getIterator() {
        return orders.iterator();
    }
    
    public int getCount() {
        return orders.size();
    }
}
