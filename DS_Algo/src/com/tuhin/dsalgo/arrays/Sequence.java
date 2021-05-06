package com.tuhin.dsalgo.arrays;

public class Sequence {

	static double maxSubArraySum(double a[], int size) 
	{ 
	   
	    // max_so_far represents the maximum sum 
	    // found till now and max_ending_here 
	    // represents the maximum sum ending at 
	    // a specific index 
	    double max_so_far = Integer.MIN_VALUE, 
	           max_ending_here = 0; 
	   
	    // Iterating through the array to find 
	    // the maximum sum of the subarray 
	    for (int i = 0; i < size; i++) { 
	        max_ending_here = max_ending_here + a[i]; 
	        if (max_so_far < max_ending_here) 
	            max_so_far = max_ending_here; 
	   
	        // If the maximum sum ending at a 
	        // specific index becomes less than 0, 
	        // then making it equal to 0. 
	        if (max_ending_here < 0) 
	            max_ending_here = 0; 
	    } 
	    return max_so_far; 
	} 
	   
	// Function to find the minimum possible sum 
	// of the array elements after performing 
	// the given operation 
	static void minPossibleSum(double a[], int n, double x) 
	{ 
	    double mxSum = maxSubArraySum(a, n); 
	    double sum = 0; 
	   
	    // Finding the sum of the array 
	    for (int i = 0; i < n; i++) { 
	        sum += a[i]; 
	    } 
	   
	    // Computing the minimum sum of the array 
	    sum = sum - mxSum + mxSum / x; 
	   
	    System.out.print(sum +"\n"); 
	} 
	   
	// Driver code 
	public static void main(String[] args) 
	{ 
	    int N = 3; 
	    double X = 3; 
	    double A[] = { 2,4,8 }; 
	    minPossibleSum(A, N, X); 
	} 
	} 

