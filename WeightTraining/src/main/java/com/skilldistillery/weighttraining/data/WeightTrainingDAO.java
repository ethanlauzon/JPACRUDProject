package com.skilldistillery.weighttraining.data;

import java.util.List;

import com.skilldistillery.weighttraining.entities.WeightTraining;

public interface WeightTrainingDAO {

	List<WeightTraining> findAll();
	WeightTraining findById(int id);
	WeightTraining create(WeightTraining wt);
	WeightTraining update(int id, WeightTraining wt);
	boolean deleteById(int id);
	
	
	
}
