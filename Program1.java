package com.kokilas.day1;
public class Program1 {
	 public static void main(String[] args) {
	 int[] prices = {7, 1, 5, 3, 6, 4};
	 int profit = 0;
     int maxProfit = 0;

	        if (prices == null || prices.length <= 1) {
	            System.out.println(0);
	        }
	        for (int i = 1; i < prices.length; i++) {
	        	  int diff = prices[i] - prices[i - 1];
	              if (diff > 0) {
	                  profit += diff;
	                  if (profit > maxProfit) {
	                      maxProfit = profit;
	                  }
	              } else {
	                  profit = 0;
	              }
	          }
	          
	          System.out.println("Maximum profit: " + maxProfit);
	      }
	  }