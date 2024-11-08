package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.hw4.*;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    @Test
    public void testNewInterface() {
        CustomerDataViaHttps customerDataViaHttps = new NewSystem();

        // print the customer
        customerDataViaHttps.printCustomer(1);

        Customer customer = customerDataViaHttps.getCustomerViaHttps(1);
        assertEquals(1,customer.getCustomerId());
        assertEquals("data from HTTPS",customer.getData());
    }

    @Test
    public void testOldInterface() {
        CustomerDataViaUsb customerDataViaUsb = new OldSystem();

        // print the customer
        customerDataViaUsb.printCustomer(1);

        Customer customer = customerDataViaUsb.getCustomerViaUsb(1);
        assertEquals(1,customer.getCustomerId());
        assertEquals("data from USB",customer.getData());
    }

    @Test
    public void testAdapter() {
        CustomerDataViaUsb customerDataViaUsb = new OldSystem();
        HttpsToUsbAdapter httpsToUsbAdapter = new HttpsToUsbAdapter(customerDataViaUsb);

        // print the customer
        httpsToUsbAdapter.printCustomer(1);

        Customer customer = httpsToUsbAdapter.getCustomerViaHttps(1);
        assertEquals(1,customer.getCustomerId());
        assertEquals("data from USB",customer.getData());
    }


}
