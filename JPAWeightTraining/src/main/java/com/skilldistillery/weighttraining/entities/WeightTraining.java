package com.skilldistillery.weighttraining.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weight_training")
public class WeightTraining {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="bench_press")
	private int bench;
	
	@Column(name="bent_over_rows")
	private int bentOverRows;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private int ohp;

	private int squat;
	
	private int deadlift;

	public WeightTraining() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBench() {
		return bench;
	}

	public void setBench(int bench) {
		this.bench = bench;
	}

	public int getDeadlift() {
		return deadlift;
	}

	public void setDeadlift(int deadlift) {
		this.deadlift = deadlift;
	}

	public int getBentOverRows() {
		return bentOverRows;
	}

	public void setBentOverRows(int bentOverRows) {
		this.bentOverRows = bentOverRows;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSquat() {
		return squat;
	}

	public void setSquat(int squat) {
		this.squat = squat;
	}

	
	public int getOhp() {
		return ohp;
	}

	public void setOhp(int ohp) {
		this.ohp = ohp;
	}

	@Override
	public String toString() {
		return "WeightTraining [id=" + id + ", bench=" + bench + ", bentOverRows=" + bentOverRows + ", firstName="
				+ firstName + ", lastName=" + lastName + ", ohp=" + ohp + ", squat=" + squat + ", deadlift=" + deadlift
				+ "]";
	}

}
