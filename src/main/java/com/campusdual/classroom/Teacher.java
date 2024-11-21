package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
	@Override
	public void getDetails() {
		System.out.println("Esta persona es de tipo: " + this.getClass().getSimpleName() + "\n");
		System.out.println("Nombre completo "+ this.name + " "+ this.surname + ", profesor en "+ this.area.toLowerCase() + "\n");
	}
}
