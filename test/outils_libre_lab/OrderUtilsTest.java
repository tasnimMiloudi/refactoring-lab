package outils_libre_lab;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class OrderUtilsTest {

    @Test
    public void testCalculateTotal() {
        Customer customer = new Customer("Test", false, false);
        List<Item> items = Arrays.asList(
                new Item("Book", 10.0, 2),   // 20
                new Item("Pen", 5.0, 4)       // 20
        );
        Order order = new Order(customer, items);
        assertEquals(40.0, OrderUtils.calculateTotal(order), 0.0001);
    }

    @Test
    public void testCalculateTotalSingleItem() {
        Customer customer = new Customer("Test", false, false);
        List<Item> items = Arrays.asList(new Item("Laptop", 500.0, 1));
        Order order = new Order(customer, items);
        assertEquals(500.0, OrderUtils.calculateTotal(order), 0.0001);
    }

    @Test
    public void testInvoiceGeneratorUsesOrderUtils() {
        Customer customer = new Customer("Test", false, false);
        List<Item> items = Arrays.asList(new Item("Phone", 300.0, 2));
        Order order = new Order(customer, items);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        assertEquals(600.0, invoiceGenerator.calculateTotal(order), 0.0001);
    }
}
