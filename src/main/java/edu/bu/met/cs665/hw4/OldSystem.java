/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/08/2024
 * File Name: OldSystem.java
 * Description: This class is represents the legacy system for accessing customer data via a USB connection. It implements the CustomerDataViaUsb interface.
 */
package edu.bu.met.cs665.hw4;

/**
 * This is the OldSystem class.
 * This class is simulates a legacy system that retrieves customer data through a USB connection.
 */
public class OldSystem implements CustomerDataViaUsb{
    /**
     * Prints the customer data associated with the specified customer ID.
     * @param customerId The unique identifier for the customer whose data is to be printed.
     */
    @Override
    public void printCustomer(int customerId) {
        System.out.println(new Customer(customerId,"data from USB"));
    }

    /**
     * Retrieves the customer data associated with the specified customer ID.
     * @param customerId The unique identifier for the customer.
     * @return A Customer object containing the ID and associated data from the USB source.
     */
    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return new Customer(customerId,"data from USB");
    }

}
