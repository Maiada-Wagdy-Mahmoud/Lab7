package edu.mum.lab7.cs.cs425.studentmgmt.model.Reposotory;

import edu.mum.lab7.cs.cs425.studentmgmt.model.StudentEntity;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface StudentReposotory extends CrudRepository<StudentEntity,Long> {
}
