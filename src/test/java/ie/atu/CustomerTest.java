
package ie.atu;

import ie.atu.week10.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    void setup(){customer = new Customer();}

    @Test
    void constructorInitialisation()
    {
        customer = new Customer("Alice Smith", "1 High Street", "0851234567", 1001, true);
        assertEquals("Alice Smith", customer.getName());
        assertEquals("1 High Street", customer.getAddress());
        assertEquals("0851234567", customer.getPhoneNumber());
        assertEquals(1001, customer.getCustomerNumber());
        System.out.println(customer);
    }

}


