package edu.neu.csye7374;

import edu.neu.csye7374.CalculatableAPI.OPERATION;

import java.util.List;

public class CalculatorObjectAdapter implements AccumulatableAPI {
   private final Calculator calculator;
   private double sum;

   public CalculatorObjectAdapter(Calculator calculator) {
	   super();
	   this.calculator = calculator;
	   this.sum = 0;
   }

   @Override
   public double payment (double payment) {
	   return this.calculator.operation(OPERATION.SUB, payment, sum);
   }

	@Override
	public double accumulation(List<Double> itemPrices) {	
		sum = 0;
	    for (double itemPrice : itemPrices) {
		    sum = this.calculator.operation(OPERATION.ADD, sum, itemPrice);
		    }
	    return sum;
	}
}
