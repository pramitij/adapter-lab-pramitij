package edu.neu.csye7374;

import java.util.List;

public class CalculatorClassAdapter extends Calculator implements AccumulatableAPI {
	private double sum;

	@Override
	public double accumulation(List<Double> itemPrices) {
		sum = 0;
	    for (double itemPrice : itemPrices) {
		    sum = super.operation(OPERATION.ADD, sum, itemPrice);
		    }
	    return sum;
	}

	@Override
	public double payment(double payment) {
		   return super.operation(OPERATION.SUB, payment, sum);
	}
}
