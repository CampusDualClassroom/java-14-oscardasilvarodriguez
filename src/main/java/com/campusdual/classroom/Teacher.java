package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
	@Override
	public void getDetails() {
		System.out.println("Nombre completo "+ name + " "+ surname + ", profesor en "+ area.toLowerCase());
	}
}
