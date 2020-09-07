package com.algorithms.dynamic.program;

import java.util.ArrayList;

//The cost of a stock on each day is given in an array, find the max profit that you can make by buying
//and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, 
//the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. 
//If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

//Solution: 
//Find the local minima and store it as starting index. If not exists, return.
//Find the local maxima. and store it as ending index. If we reach the end, set the end as ending index.
//Update the solution (Increment count of buy sell pairs)
//Repeat the above steps if end is not reached.
public class StockBuySell {
	class Stock {
		int buy;
		int sell;
	}
	void stockBuySell(int price[], int n) 
    { 
        // Prices must be given for at least two days 
        if (n == 1) 
            return; 
  
        int count = 0; 
  
        // solution array 
        ArrayList<Stock> sol = new ArrayList<Stock>(); 
  
        // Traverse through given price array 
        int i = 0; 
        while (i < n - 1) { 
            // Find Local Minima. Note that the limit is (n-2) as we are 
            // comparing present element to the next element. 
            while ((i < n - 1) && (price[i + 1] <= price[i])) 
                i++; 
  
            // If we reached the end, break as no further solution possible 
            if (i == n - 1) 
                break; 
  
            Stock e = new Stock(); 
            e.buy = i;
            i++;
            // Store the index of minima 
  
            // Find Local Maxima.  Note that the limit is (n-1) as we are 
            // comparing to previous element 
            while ((i < n) && (price[i] >= price[i - 1])) 
                i++; 
  
            // Store the index of maxima 
            e.sell = i - 1; 
            sol.add(e); 
  
            // Increment number of buy/sell 
            count++; 
        } 
  
        // print solution 
        if (count == 0) 
            System.out.println("There is no day when buying the stock "
                               + "will make profit"); 
        else
			for (int j = 0; j < count; j++) 
                System.out.println("Buy on day: " + sol.get(j).buy 
                                   + "        "
                                   + "Sell on day : " + sol.get(j).sell); 
  
        return; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockBuySell stock = new StockBuySell();

		// stock prices on consecutive days
		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n = price.length;

		// fucntion call
		stock.stockBuySell(price, n);
	}

}
