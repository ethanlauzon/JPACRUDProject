package com.skilldistillery.weighttraining.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.weighttraining.entities.WeightTraining;

@Service
@Transactional
public class WeightTrainingDAOImpl implements WeightTrainingDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<WeightTraining> findAll() {
		String jpql = "SELECT wt FROM WeightTraining wt";
		return em.createQuery(jpql, WeightTraining.class).getResultList();
	}

	@Override
	public WeightTraining findById(int id) {
		return em.find(WeightTraining.class, id);
	}

	@Override
	public WeightTraining create(WeightTraining wt) {
		
		return null;
	}

	@Override
	public WeightTraining update(int id, WeightTraining wt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
