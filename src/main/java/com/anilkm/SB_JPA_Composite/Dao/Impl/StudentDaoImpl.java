package com.anilkm.SB_JPA_Composite.Dao.Impl;

import org.springframework.stereotype.Repository;

import com.anilkm.SB_JPA_Composite.Dao.StudentDAO;
import com.anilkm.SB_JPA_Composite.Entity.StudentComposite;
import com.anilkm.SB_JPA_Composite.Entity.StudentEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	
	public void saveEntity(StudentEntity entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
		

		
	}

	
	public StudentEntity findStudentById(StudentComposite id) {
		// TODO Auto-generated method stub
		return entityManager.find(StudentEntity.class,id);
	}

}
