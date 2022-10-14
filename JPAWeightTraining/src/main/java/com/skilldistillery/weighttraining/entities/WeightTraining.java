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

	@Override
	public String toString() {
		return "WeightTraining [id=" + id + ", bench=" + bench + ", deadlift=" + deadlift + "]";
	}

}
