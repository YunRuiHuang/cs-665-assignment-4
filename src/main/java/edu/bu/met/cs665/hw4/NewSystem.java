/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/08/2024
 * File Name: NewSystem.java
 * Description: This class represents the new system for accessing customer data via HTTPS. It implements the CustomerDataViaHttps interface.
 */
package edu.bu.met.cs665.hw4;

/**
 * This is the NewSystem class.
 * This class is simulates a system that retrieves customer data through an HTTPS connection
 */
public class NewSystem implements CustomerDataViaHttps{

    /**
     * Prints the customer data associated with the specified customer ID.
     * @param customerId The unique identifier for the customer whose data is to be printed.
     */
    @Override
    public void printCustomer(int customerId) {
        System.out.println(new Customer(customerId,"data from HTTPS"));
    }

    /**
     * Retrieves the customer data associated with the specified customer ID.
     * @param customerId The unique identifier for the customer.
     * @return A Customer object containing the ID and associated data from the HTTPS source.
     */
    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return new Customer(customerId,"data from HTTPS");
    }
}
