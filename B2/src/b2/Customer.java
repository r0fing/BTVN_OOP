/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

/**
 *
 * @author HLC_2021
 */
public class Customer {
    private String address, code, name;

    public Customer(String address, String code, String name) {
        this.address = address;
        this.code = code;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
