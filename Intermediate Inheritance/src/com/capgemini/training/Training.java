//Parent class containing training details
package com.capgemini.training;

abstract class Training {

	String ID;
	String subject;
	double fees;

	// default constructor
	Training() {

	}

	// setting values
	Training(String ID, String subject, double fees) // Constructor
	{
		this.ID = ID;
		this.subject = subject;
		this.fees = fees;

	}

	abstract void getOrderValue();
}
