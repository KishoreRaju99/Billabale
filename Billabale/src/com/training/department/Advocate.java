package com.training.department;

import com.training.exercise.Billable;

public class Advocate implements Billable {

	int pf=4500;

	@Override
	public double Calculate(Object obj) {
	Integer salary =(Integer) obj;
	salary = salary - pf;
	return salary;
}
}
