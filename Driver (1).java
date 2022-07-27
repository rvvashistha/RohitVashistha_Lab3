package com.rohit.main;

import com.rohit.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {

			BalancingBrackets balancingBrackets = new BalancingBrackets();

			String bracketExpression = "([[{}]])";

			boolean result;
			result = balancingBrackets.checkBracketBalance(bracketExpression);

			if (result)
				System.out.println("the input strings are in balance");
	  
			else
				System.out.println("the input strings does not have balanced brackets ");

		    }

	
   
}
