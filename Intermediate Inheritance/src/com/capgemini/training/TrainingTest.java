//Test class for Training parent class
package com.capgemini.training;

public class TrainingTest {

	public static void main(String args[]) {
		PublicTraining publicTraining = new PublicTraining("007", "Java Cloud", 50, 5000);
		CorporateTraining corporateTraining = new CorporateTraining("009", ".net", 50, 4000);

		publicTraining.getOrderValue();
		publicTraining.display();
		corporateTraining.getOrderValue();
		corporateTraining.disp();

	}
}
