package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void runDemo() {
		Calculator calculator = new Calculator();

		List<Double> itemAmount = new ArrayList<Double>();
		itemAmount.add(40.0);
		itemAmount.add(22.5);
		itemAmount.add(67.2);
		itemAmount.add(85.3);

		// class adaptor
		System.out.println("\nClass adaptor");
		CalculatorClassAdapter calculatorClassAdapter = new CalculatorClassAdapter();
		System.out.println("Item Amount: "+calculatorClassAdapter.accumulation(itemAmount));
		System.out.println("Balance after Payment: "+calculatorClassAdapter.payment(300.0));

		// object adaptor
		System.out.println("\nObject adaptor");
		CalculatorObjectAdapter calculatorObjectAdapter = new CalculatorObjectAdapter(calculator);
		System.out.println("Item Amount: "+calculatorObjectAdapter.accumulation(itemAmount));
		System.out.println("Balance after Payment: "+calculatorObjectAdapter.payment(250.0));
		

	}
}
