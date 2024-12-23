package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}
	@Override
	public void getDetails() {
		System.out.println("Esta persona es de tipo: " + this.getClass().getSimpleName() + "\n");
		System.out.println("Doctor "+ this.name + " "+ this.surname + ", especialista en "+ this.specialization.toLowerCase() + "\n");
	}
}
