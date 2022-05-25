package com.sriharsha.springlearning;

public class BaseBallCoach implements CoachInterface {

	HelperClass helperClass;
	
	// BaseBallCoach(HelperClass helperClass){
	// 	this.helperClass = helperClass;
	// }
	
	@Override
	public void getDailyWorkOut() {
		System.out.println("Dialy work out");
	}

	public void setIsHeGood(HelperClass helperClass){
		this.helperClass = helperClass;
	}

	@Override
	public void isHeGood() {
		helperClass.isGoodCoach();
	}

}
