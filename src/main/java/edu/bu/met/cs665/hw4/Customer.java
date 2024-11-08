/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/08/2024
 * File Name: Customer.java
 * Description: This class represents a customer entity with a unique ID and associated data.
 */
package edu.bu.met.cs665.hw4;

/**
 * This is the Customer class.
 * This class is provides methods for accessing the customer's ID and data.
 */
public class Customer {
    private int customerId;
    private String data;

    /**
     * Constructor for creating a new Customer instance.
     * @param customerId The unique identifier for the customer.
     * @param data The customer data.
     */
    public Customer(int customerId, String data){
        this.customerId = customerId;
        this.data = data;
    }

    /**
     * Retrieves the unique customer ID.
     * @return An integer representing the customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Retrieves the data associated with the customer.
     * @return A String containing the customer data.
     */
    public String getData() {
        return data;
    }

    /**
     * Provides a string representation of the Customer object, including the ID and data.
     * @return A formatted string representing the customer's ID and data.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", data='" + data + '\'' +
                '}';
    }
}
