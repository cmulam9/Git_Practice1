package com.anilkm.SB_JPA_Composite.Dao;

import com.anilkm.SB_JPA_Composite.Entity.StudentComposite;
import com.anilkm.SB_JPA_Composite.Entity.StudentEntity;

public interface StudentDAO {
 void saveEntity (StudentEntity entity);
 StudentEntity findStudentById(StudentComposite id);
 
}
