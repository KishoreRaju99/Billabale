package com.training.exercise;

public interface Billable {
	public  double Calculate(Object obj);
	class service{
		public void getSalary(Billable bill) {
			System.out.println(bill.Calculate(34000));
		}
		
	}

	
}