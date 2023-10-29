package edu.hw3;

import edu.hw3.task6.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Task6Test {

    @Test
    void testMostValuableStock() {
        Stock stock1 = new Stock("Apple", 150.00);
        Stock stock2 = new Stock("Google", 200.00);
        Stock stock3 = new Stock("Microsoft", 180.00);

        StockMarket market = new StockMarketImpl();

        market.add(stock1);
        market.add(stock2);
        market.add(stock3);

        Stock mostValuableStock = market.mostValuableStock();

        assertEquals("Google", mostValuableStock.getName());
        assertEquals(200.00, mostValuableStock.getPrice(), 0.001);
    }

    @Test
    void testRemoveStock() {
        Stock stock1 = new Stock("Apple", 150.00);
        Stock stock2 = new Stock("Google", 200.00);
        Stock stock3 = new Stock("Microsoft", 180.00);

        StockMarket market = new StockMarketImpl();

        market.add(stock1);
        market.add(stock2);
        market.add(stock3);

        market.remove(stock2);

        Stock mostValuableStock = market.mostValuableStock();

        assertEquals("Microsoft", mostValuableStock.getName());
        assertEquals(180.00, mostValuableStock.getPrice(), 0.001);
    }

    @Test
    void testEmptyMarket() {
        StockMarket market = new StockMarketImpl();

        Stock mostValuableStock = market.mostValuableStock();

        assertNull(mostValuableStock);
    }
}
