package edu.mum.lab7.cs.cs425.studentmgmt.model.Reposotory;

import edu.mum.lab7.cs.cs425.studentmgmt.model.StudentEntity;
import edu.mum.lab7.cs.cs425.studentmgmt.model.TranscriptEntity;
import org.springframework.data.repository.CrudRepository;

public interface TranscriptReposotory extends CrudRepository<TranscriptEntity,Long> {
}
