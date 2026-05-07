package outils_libre_lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class OrderCalculatorTest {

    private final CalculationService calculationService = new CalculationService();
    private final OrderCalculator orderCalculator = new OrderCalculator(calculationService);

    @Test
    public void testCalculateOrderTotal() {
        // 100 + (100 * 0.1) = 110
        double total = orderCalculator.calculateOrderTotal(100.0, 0.1);
        assertEquals(110.0, total, 0.0001);
    }

    @Test
    public void testApplyOrderDiscount() {
        // 110 * (1 - 0.2) = 88
        double discounted = orderCalculator.applyOrderDiscount(110.0, 0.2);
        assertEquals(88.0, discounted, 0.0001);
    }

    @Test
    public void testCalculationServiceCalculateTotal() {
        double total = calculationService.calculateTotal(200.0, 0.05);
        assertEquals(210.0, total, 0.0001);
    }

    @Test
    public void testCalculationServiceApplyDiscount() {
        double result = calculationService.applyDiscount(200.0, 0.1);
        assertEquals(180.0, result, 0.0001);
    }
}
