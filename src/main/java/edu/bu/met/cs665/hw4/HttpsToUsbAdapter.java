/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/08/2024
 * File Name: HttpsToUsbAdapter.java
 * Description: This class is enables the new system interface to communicate with the legacy system by adapting HTTPS-based requests to USB-based data retrieval methods.
 */
package edu.bu.met.cs665.hw4;

/**
 * This is the HttpsToUsbAdapter class.
 * This class is translates HTTPS-based customer data requests into USB-based requests.
 */
public class HttpsToUsbAdapter implements CustomerDataViaHttps{
    private CustomerDataViaUsb customerDataViaUsb;

    /**
     * Constructor for creating an HttpsToUsbAdapter instance.
     * @param customerDataViaUsb An instance of CustomerDataViaUsb for retrieving data from the legacy system.
     */
    public HttpsToUsbAdapter(CustomerDataViaUsb customerDataViaUsb){
        this.customerDataViaUsb = customerDataViaUsb;
    }

    /**
     * Prints the customer data associated with the specified customer ID by delegating the request to the legacy system's USB-based method.
     * @param customerId The unique identifier for the customer whose data is to be printed.
     */
    @Override
    public void printCustomer(int customerId) {
        this.customerDataViaUsb.printCustomer(customerId);
    }

    /**
     * Retrieves the customer data associated with the specified customer ID by delegating the request to the legacy system's USB-based method.
     * @param customerId The unique identifier for the customer.
     * @return A Customer object containing the ID and associated data retrieved via USB.
     */
    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return this.customerDataViaUsb.getCustomerViaUsb(customerId);
    }
}
