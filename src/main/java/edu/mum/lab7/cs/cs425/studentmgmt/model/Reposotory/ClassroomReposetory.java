package edu.mum.lab7.cs.cs425.studentmgmt.model.Reposotory;

import edu.mum.lab7.cs.cs425.studentmgmt.model.ClassroomEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClassroomReposetory extends CrudRepository<ClassroomEntity,Long> {
}
