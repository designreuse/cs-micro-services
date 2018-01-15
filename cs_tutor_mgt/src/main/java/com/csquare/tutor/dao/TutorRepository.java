package com.csquare.tutor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csquare.tutor.model.Tutor;
import com.csquare.tutor.model.TutorHigherEdu;



public interface TutorRepository extends JpaRepository<TutorHigherEdu, String> {

}