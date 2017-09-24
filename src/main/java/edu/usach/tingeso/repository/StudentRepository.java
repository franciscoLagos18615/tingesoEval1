package edu.usach.tingeso.repository;


import edu.usach.tingeso.models.Student;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface StudentRepository extends CrudRepository<Student,Long> {
}
