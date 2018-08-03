//Public Training class
package com.capgemini.training;

public class PublicTraining extends Training {

	int participants;
	double getOrderValue;

	// default constructor
	PublicTraining() {

	}

	// setting values
	PublicTraining(String ID, String subject, int participants, double fees) // Constructor
	{
		super(ID, subject, fees); // calling parent
		this.participants = participants;

	}

	// override the get function
	@Override
	void getOrderValue() {
		getOrderValue = fees * participants;
	}

	void display() // display method
	{
		System.out.println("The total amount for training is " + getOrderValue);
	}

}
