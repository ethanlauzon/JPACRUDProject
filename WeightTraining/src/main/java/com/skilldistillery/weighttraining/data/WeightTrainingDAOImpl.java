package com.skilldistillery.weighttraining.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
		em.persist(wt);
		return wt;
	}

	@Override
	public WeightTraining update(int id, WeightTraining wt) {
		WeightTraining dbWT = em.find(WeightTraining.class, id);
		if (dbWT != null) {
			dbWT.setFirstName(wt.getFirstName());
			dbWT.setLastName(wt.getLastName());
			dbWT.setOhp(wt.getOhp());
			dbWT.setBench(wt.getBench());
			dbWT.setSquat(wt.getSquat());
			dbWT.setBentOverRows(wt.getBentOverRows());
			dbWT.setDeadlift(wt.getDeadlift());
		}
		em.persist(dbWT);
		
		return dbWT;
	}

	@Override
	public boolean deleteById(int id) {
		boolean successfullyKickedOut = false;
		WeightTraining quitter = em.find(WeightTraining.class, id);
		if (quitter != null) {
			em.remove(quitter);
			successfullyKickedOut = !em.contains(quitter);
		}
		return successfullyKickedOut;
	}
}