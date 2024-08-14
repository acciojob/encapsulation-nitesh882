// Main.java
package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly(); // Create an object of RWOnly
        
        // Use setter to set the value of 'name'
        obj.setName("John");

        // Use getter to access the value of 'name'
        System.out.println(obj.getName());
    }
}
