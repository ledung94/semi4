package com.example.Lab3.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Override
	public String toString() {
		return "Student [ name=" + name + ", roll=" + roll + ", className=" + className + "]";
	}

	@Column(name = "name")
	private String name;

	@Id
	@Column(name = "roll")
	private String roll;

	@Column(name = "className")
	private String className;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
