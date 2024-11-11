/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

/**
 *
 * @author HLC_2021
 */
import java.util.Currency;

public class OrderLine {
    private Currency value;

    public OrderLine(Currency value) {
        this.value = value;
    }

    public Currency getValue() {
        return value;
    }
}
