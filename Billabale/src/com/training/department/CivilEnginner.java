package com.training.department;

import com.training.exercise.Billable;

public class CivilEnginner implements Billable {
	int pf=3500;

	@Override
	public double Calculate(Object obj) {
	Integer salary =(Integer) obj;
	salary = salary - pf;
	return salary;
	}
}
