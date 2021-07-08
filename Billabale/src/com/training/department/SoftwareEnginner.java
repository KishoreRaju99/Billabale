package com.training.department;

import com.training.exercise.Billable;

public class SoftwareEnginner implements Billable {
int pf=2500;

@Override
public double Calculate(Object obj) {
Integer salary =(Integer) obj;
salary = salary - pf;
return salary;
}

	

}
