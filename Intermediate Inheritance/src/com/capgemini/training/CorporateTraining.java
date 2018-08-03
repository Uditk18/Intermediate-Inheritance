package com.capgemini.training;

//Corporate Training details
public class CorporateTraining extends Training {

	int days;
	double getOrderValue;

	// default constructor
	CorporateTraining() {

	}

	CorporateTraining(String ID, String subject, int days, double fees) // Constructor
	{
		// setting values by calling super class
		super(ID, subject, fees);
		this.days = days;

	}

	// get order value function (given)
	void getOrderValue() {
		getOrderValue = fees * days;
	}

	// display function
	void disp() {
		System.out.println("The total amount for training is " + getOrderValue);
	}
}
