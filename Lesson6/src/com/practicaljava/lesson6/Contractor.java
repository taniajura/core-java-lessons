package com.practicaljava.lesson6;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
	}

	@Override
	public boolean increasePay(int percent) {
		if (percent <= INCREASE_CAP) {
			System.out.println("Increasing salary by " + percent + "%," + getName());
			return true;
		} else {
			System.out.println("You can't increase salary of contractor by more than " + INCREASE_CAP + "%. " + getName()); 
			return false;
		}
	}

}
