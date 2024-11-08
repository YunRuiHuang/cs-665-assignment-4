/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/08/2024
 * File Name: CustomerDataViaHttps.java
 * Description: This class is defines the methods for accessing customer data via HTTPS.
 */
package edu.bu.met.cs665.hw4;

/**
 * This is the CustomerDataViaHttps class.
 * This class is defines the methods for accessing customer data via HTTPS.
 */
/**
 * New System
 */
public interface CustomerDataViaHttps {
    /**
     * Prints the customer data associated with the specified customer ID.
     * @param customerId The unique identifier for the customer whose data is to be printed.
     */
    void printCustomer(int customerId);

    /**
     * Retrieves the customer data associated with the specified customer ID.
     * @param customerId The unique identifier for the customer.
     * @return A Customer object containing the ID and associated data from the HTTPS source.
     */
    Customer getCustomerViaHttps(int customerId);
}
